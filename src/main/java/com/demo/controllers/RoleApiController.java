package com.demo.controllers;

import com.demo.entities_api.RoleApi;
import com.demo.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/role"})
public class RoleApiController {
    @Autowired
    private IRoleService roleService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<RoleApi>> findall() {
        try {
            return new ResponseEntity<List<RoleApi>>(roleService.findAll(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoleApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallrolewithsort", method=RequestMethod.GET)
    public ResponseEntity<List<RoleApi>> findallrolewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<RoleApi>>(roleService.findAllRoleWithSort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RoleApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallrolepaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<Object> findallrolepaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<Object>(new Object() {
                public int totalQuantityRoles = roleService.findAll().size();
                public List<RoleApi> rolesDisplay = roleService.findallpaginate(offset, pagesize);
                public double pagequantity = Math.ceil(Double.parseDouble(String.valueOf(roleService.findAll().size()))/10);
            }, HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<Boolean> create(@RequestBody RoleApi roleApi) {
        try {
            return new ResponseEntity<Boolean>(roleService.create(roleApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody RoleApi roleApi) {
        try {
            return new ResponseEntity<Boolean>(roleService.update(roleApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int roleApi_id) {
        try {
            return new ResponseEntity<Boolean>(roleService.delete(roleApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findrolebyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<RoleApi> findrolebyid(@PathVariable int id) {
        try {
            return new ResponseEntity<RoleApi>(roleService.findByRoleId(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<RoleApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
