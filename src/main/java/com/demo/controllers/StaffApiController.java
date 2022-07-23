package com.demo.controllers;

import com.demo.entities_api.StaffApi;
import com.demo.services.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/staff"})
public class StaffApiController {
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
    
    @RequestMapping(value="findByEmail/{email}", method=RequestMethod.GET)
    public ResponseEntity<StaffApi> findByEmail(@PathVariable("email") String email) {
        try {
            return new ResponseEntity<StaffApi>(staffService.findStaffByEmail(email), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<StaffApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
