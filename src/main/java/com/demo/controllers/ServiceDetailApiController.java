package com.demo.controllers;

import com.demo.entities_api.ServiceDetailApi;
import com.demo.services.IServiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/serviceDetail"})
public class ServiceDetailApiController {
    @Autowired
    private IServiceDetailService serviceDetailService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<ServiceDetailApi>> findall() {
        try {
            return new ResponseEntity<List<ServiceDetailApi>>(serviceDetailService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ServiceDetailApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallserviceDetailwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<ServiceDetailApi>> findallserviceDetailtypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<ServiceDetailApi>>(serviceDetailService.findallserviceDetailwithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ServiceDetailApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallserviceDetailwithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<ServiceDetailApi>> findallserviceDetailtypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<ServiceDetailApi>>(serviceDetailService.findallserviceDetailpaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ServiceDetailApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<ServiceDetailApi> create(@RequestBody ServiceDetailApi serviceDetailApi) {
        try {
            return new ResponseEntity<ServiceDetailApi>(serviceDetailService.create(serviceDetailApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ServiceDetailApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody ServiceDetailApi serviceDetailApi) {
        try {
            return new ResponseEntity<Boolean>(serviceDetailService.update(serviceDetailApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int serviceDetailApi_id) {
        try {
            return new ResponseEntity<Boolean>(serviceDetailService.delete(serviceDetailApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findserviceDetailbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<ServiceDetailApi> findserviceDetailbyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<ServiceDetailApi>(serviceDetailService.findServiceDetailById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ServiceDetailApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
