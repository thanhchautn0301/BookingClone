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
    public ResponseEntity<?> login(@RequestBody AuthRequest request, HttpServletResponse response) {
        try {
            System.out.println(request.getEmail());
            System.out.println(request.getPassword());
            Authentication authentication = authManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
            );
            StaffApi staffApi =(StaffApi) authentication.getPrincipal();

            String accessToken = jwtTokenUtil.generateAccessToken(staffApi);

            AuthResponse authResponse = new AuthResponse(staffApi.getEmail(), accessToken);

            // create a cookie
            Cookie cookie = new Cookie("token", accessToken);
            cookie.setMaxAge(7 * 24 * 60 * 60); // expires in 7 days
            cookie.setSecure(true);
            cookie.setHttpOnly(true);

            //add cookie to response
            response.addCookie(cookie);

            return ResponseEntity.ok(authResponse);

        } catch(HttpClientErrorException.BadRequest ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
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
}
