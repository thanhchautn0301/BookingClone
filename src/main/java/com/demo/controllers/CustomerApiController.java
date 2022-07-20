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

import com.demo.entities_api.CityApi;
import com.demo.entities_api.CustomerApi;
import com.demo.services.ICityService;
import com.demo.services.ICustomerService;

@RestController
@RequestMapping(value = {"api/customer"})
public class CustomerApiController {
	@Autowired
	private ICustomerService customerService;
	
	@RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<CustomerApi>> findAll() {
        try {
            return new ResponseEntity<List<CustomerApi>>(customerService.findAllCustomer(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CustomerApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	@RequestMapping(value="findallcustomerwithsort", method=RequestMethod.GET)
    public ResponseEntity<List<CustomerApi>> findallcustomerwithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<CustomerApi>>(customerService.findAllCustomerWithSort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CustomerApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	 @RequestMapping(value="findallcustomerpaginate/{offset}/{pagesize}", method=RequestMethod.GET)
	    public ResponseEntity<Object> findallcustomerpaginate(@PathVariable int offset, @PathVariable int pagesize) {
	        try {
	            return new ResponseEntity<Object>(new Object() {
	                public int totalQuantityCities = customerService.findAllCustomer().size();
	                public List<CustomerApi> cityDisplay = customerService.findAllPaginate(offset, pagesize);
	                public double pagequantity = Math.ceil(Double.parseDouble(String.valueOf(customerService.findAllCustomer().size()))/10);
	            }, HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="create", method=RequestMethod.POST)
	    public ResponseEntity<Boolean> create(@RequestBody CustomerApi customerApi) {
	        try {
	            return new ResponseEntity<Boolean>(customerService.create(customerApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="update", method=RequestMethod.PUT)
	    public ResponseEntity<Boolean> update(@RequestBody CustomerApi customerApi) {
	        try {
	            return new ResponseEntity<Boolean>(customerService.update(customerApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	    public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
	        try {
	            return new ResponseEntity<Boolean>(customerService.delete(id),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="findcustomerbyid/{id}", method=RequestMethod.GET)
	    public ResponseEntity<CustomerApi> findcustomerbyid(@PathVariable("id") int id) {
	        try {
	            return new ResponseEntity<CustomerApi>(customerService.findCityById(id),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<CustomerApi>(HttpStatus.BAD_REQUEST);
	        }
	    }
}
