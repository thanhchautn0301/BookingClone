package com.demo.controllers;

import com.demo.entities_api.ServiceApi;
import com.demo.services.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/service"})
public class ServiceApiController {
    @Autowired
    private IServiceService serviceService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<ServiceApi>> findall() {
        try {
            return new ResponseEntity<List<ServiceApi>>(serviceService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ServiceApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallservicewithsort", method=RequestMethod.GET)
    public ResponseEntity<List<ServiceApi>> findallservicetypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<ServiceApi>>(serviceService.findallservicewithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ServiceApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallservicewithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<ServiceApi>> findallservicetypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<ServiceApi>>(serviceService.findallservicepaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<ServiceApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<ServiceApi> create(@RequestBody ServiceApi serviceApi) {
        try {
            return new ResponseEntity<ServiceApi>(serviceService.create(serviceApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ServiceApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody ServiceApi serviceApi) {
        try {
            return new ResponseEntity<Boolean>(serviceService.update(serviceApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int serviceApi_id) {
        try {
            return new ResponseEntity<Boolean>(serviceService.delete(serviceApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findservicebyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<ServiceApi> findservicebyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<ServiceApi>(serviceService.findServiceById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<ServiceApi>(HttpStatus.BAD_REQUEST);
        }
    }
}
