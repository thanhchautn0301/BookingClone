package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities_api.RateApi;
import com.demo.services.ICityService;
import com.demo.services.IRateService;

@RestController
@RequestMapping(value = {"api/rate"})
public class RateApiController {
	@Autowired
	private IRateService rateService;
	
	@RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<RateApi>> findAll() {
        try {
            return new ResponseEntity<List<RateApi>>(rateService.findAllRate(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RateApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	@RequestMapping(value="findallratewithsort", method=RequestMethod.GET)
    public ResponseEntity<List<RateApi>> findallrolewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<RateApi>>(rateService.findAllRateWithSort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<RateApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	 @RequestMapping(value="findallratepaginate/{offset}/{pagesize}", method=RequestMethod.GET)
	    public ResponseEntity<Object> findallcitypaginate(@PathVariable int offset, @PathVariable int pagesize) {
	        try {
	            return new ResponseEntity<Object>(new Object() {
	                public int totalQuantityRates = rateService.findAllRate().size();
	                public List<RateApi> rateDisplay = rateService.findAllRatePaginate(offset, pagesize);
	                public double pagequantity = Math.ceil(Double.parseDouble(String.valueOf(rateService.findAllRate().size()))/10);
	            }, HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="create", method=RequestMethod.POST)
	    public ResponseEntity<Boolean> create(@RequestBody RateApi rateApi) {
	        try {
	            return new ResponseEntity<Boolean>(rateService.create(rateApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="update", method=RequestMethod.PUT)
	    public ResponseEntity<Boolean> update(@RequestBody RateApi rateApi) {
	        try {
	            return new ResponseEntity<Boolean>(rateService.update(rateApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	    public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
	        try {
	            return new ResponseEntity<Boolean>(rateService.delete(id),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="findcitybyid/{id}", method=RequestMethod.GET)
	    public ResponseEntity<RateApi> findcitybyid(@PathVariable("id") int id) {
	        try {
	            return new ResponseEntity<RateApi>(rateService.findRateById(id),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<RateApi>(HttpStatus.BAD_REQUEST);
	        }
	    }
}
