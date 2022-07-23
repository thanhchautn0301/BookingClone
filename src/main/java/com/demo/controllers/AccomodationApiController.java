package com.demo.controllers;

import com.demo.entities_api.AccomodationApi;
import com.demo.services.IAccomodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = {"api/accomodation"})
public class AccomodationApiController {
    @Autowired
    private IAccomodationService accomodationService;
    @RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findall() {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findall(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallaccomodationwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findallaccomodationtypewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findallaccomodationwithsort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="findallaccomodationwithpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findallaccomodationtypewithpaginate(@PathVariable int offset, @PathVariable int pagesize) {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findallaccomodationpaginate(offset,pagesize), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="create", method=RequestMethod.POST)
    public ResponseEntity<AccomodationApi> create(@RequestBody AccomodationApi accomodationApi) {
        try {
            return new ResponseEntity<AccomodationApi>(accomodationService.create(accomodationApi), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<AccomodationApi>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="update", method=RequestMethod.PUT)
    public ResponseEntity<Boolean> update(@RequestBody AccomodationApi accomodationApi) {
        try {
            return new ResponseEntity<Boolean>(accomodationService.update(accomodationApi),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable("id") int accomodationApi_id) {
        try {
            return new ResponseEntity<Boolean>(accomodationService.delete(accomodationApi_id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @RequestMapping(value="findaccomodationbyid/{id}", method=RequestMethod.GET)
    public ResponseEntity<AccomodationApi> findaccomodationbyid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<AccomodationApi>(accomodationService.findAccomodationById(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<AccomodationApi>(HttpStatus.BAD_REQUEST);
        }
    }
    @RequestMapping(value="findaccomodationbyhostid/{id}", method=RequestMethod.GET)
    public ResponseEntity<List<AccomodationApi>> findaccomodationbyhostid(@PathVariable("id") int id) {
        try {
            return new ResponseEntity<List<AccomodationApi>>(accomodationService.findallaccomodationbyhost(id),HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<AccomodationApi>>(HttpStatus.BAD_REQUEST);
        }
    }
}
