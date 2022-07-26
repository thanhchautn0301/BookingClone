package com.demo.controllers;

import com.demo.entities.Staff;
import com.demo.entities_api.AuthRequest;
import com.demo.entities_api.AuthResponse;
import com.demo.entities_api.RoleApi;
import com.demo.entities_api.StaffApi;
import com.demo.jwt.JwtTokenFilter;
import com.demo.jwt.JwtTokenUtil;
import com.demo.repositories.RoleRepository;
import com.demo.services.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"api/staff"})
public class StaffApiController {

    @Autowired
    AuthenticationManager authManager;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired private RoleRepository roleRepository;

    @Autowired
    private IStaffService staffService;

    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<StaffApi>> findall() {
        try {
            return new ResponseEntity<List<StaffApi>>(staffService.findAll(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<StaffApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<StaffApi> create(@RequestBody StaffApi staffApi) {
        try {
            return new ResponseEntity<StaffApi>(staffService.create(staffApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<StaffApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="login", method= RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody AuthRequest request) {
        try {
            Authentication authentication = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
            );
            StaffApi staffApi =(StaffApi) authentication.getPrincipal();

            if(!staffApi.getStatus()) {
                String activateToken = jwtTokenUtil.generateActivateToken(staffApi);
                AuthResponse authResponse = new AuthResponse("inactivate", activateToken, staffApi.getId());
                return ResponseEntity.ok(authResponse);
            }
            else {
                String accessToken = jwtTokenUtil.generateAccessToken(staffApi);
                AuthResponse authResponse = new AuthResponse(staffApi.getEmail(), accessToken, staffApi.getId());
                return ResponseEntity.ok(authResponse);
            }
        } catch(HttpClientErrorException.BadRequest ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @RequestMapping(value="forgotpw", method= RequestMethod.POST)
    public ResponseEntity<?> forgotpw(@RequestParam("email") String email) {
        try {
            Optional<StaffApi> staffApi = staffService.findStaffApiByEmail(email);
            if(staffApi.isPresent()) {
                StaffApi staff = staffApi.get();
                String resetPwToken = jwtTokenUtil.generateResetPwToken(staff);
                AuthResponse authResponse = new AuthResponse("resetpw", resetPwToken, staff.getId());
                return ResponseEntity.ok(authResponse);
            }
            else {
                System.out.println("Invalid email");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }
        } catch(HttpClientErrorException.BadRequest ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }


    @RequestMapping(value="resetpw", method= RequestMethod.GET)
    public ResponseEntity<?> resetpw(@RequestParam("id") int id,@RequestParam("password") String password) {
        try {
            int result = staffService.resetPassword(id, password);
            return new ResponseEntity<Integer>(result,HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Integer>(-1,HttpStatus.BAD_REQUEST);
        }
    }



    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody StaffApi staffApi) {
        try {
            return new ResponseEntity<Boolean>(staffService.update(staffApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int staffApi_id) {
        try {
            return new ResponseEntity<Boolean>(staffService.delete(staffApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findstaffbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<StaffApi> findstaffbyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<StaffApi>(staffService.findStaffById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<StaffApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findstaffapibyemail", method=RequestMethod.GET)
    public ResponseEntity<Optional<StaffApi>> findstaffapibyemail(@RequestParam("email") String email) {
        try {
            return new ResponseEntity<Optional<StaffApi>>(staffService.findStaffApiByEmail(email),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Optional<StaffApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="activateaccount", method=RequestMethod.GET)
    public ResponseEntity<Integer> activateaccount(@RequestParam("id") int id) {
        try {
            int result = staffService.activateAccount(id);
            return new ResponseEntity<Integer>(result,HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Integer>(-1,HttpStatus.BAD_REQUEST);
        }
    }
}
