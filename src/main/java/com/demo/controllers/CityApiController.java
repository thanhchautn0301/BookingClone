package com.demo.controllers;

import java.io.Console;
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

import com.demo.entities_api.AccommodationOfCityApi;
import com.demo.entities_api.CityApi;
import com.demo.services.ICityService;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping(value = {"api/city"})
public class CityApiController {
	@Autowired
	private ICityService cityService;

//	@RolesAllowed("HOST")
	@RequestMapping(value="findall", method=RequestMethod.GET)
    public ResponseEntity<List<CityApi>> findAll() {
        try {
            return new ResponseEntity<List<CityApi>>(cityService.findAllCity(), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CityApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	@RequestMapping(value="findallcitywithsort", method=RequestMethod.GET)
    public ResponseEntity<List<CityApi>> findallrolewithsort(@RequestParam("field") String field) {
        try {
            return new ResponseEntity<List<CityApi>>(cityService.findAllCityWithSort(field), HttpStatus.OK);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity<List<CityApi>>(HttpStatus.BAD_REQUEST);
        }
    }
	
	 @RequestMapping(value="findallcitypaginate/{offset}/{pagesize}", method=RequestMethod.GET)
	    public ResponseEntity<Object> findallcitypaginate(@PathVariable int offset, @PathVariable int pagesize) {
	        try {
	            return new ResponseEntity<Object>(new Object() {
	                public int totalQuantityCities = cityService.findAllCity().size();
	                public List<CityApi> cityDisplay = cityService.findAllPaginate(offset, pagesize);
	                public double pagequantity = Math.ceil(Double.parseDouble(String.valueOf(cityService.findAllCity().size()))/10);
	            }, HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="create1", method=RequestMethod.POST)
	    public ResponseEntity<CityApi> create(@RequestBody CityApi cityApi) {
	        try {
	            return new ResponseEntity<CityApi>(cityService.create(cityApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<CityApi>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="update", method=RequestMethod.PUT)
	    public ResponseEntity<Boolean> update(@RequestBody CityApi cityApi) {
	        try {
	            return new ResponseEntity<Boolean>(cityService.update(cityApi),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="delete/{id}", method=RequestMethod.DELETE)
	    public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
	        try {
	            return new ResponseEntity<Boolean>(cityService.delete(id),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 
	 @RequestMapping(value="findcitybyid/{id}", method=RequestMethod.GET)
	    public ResponseEntity<CityApi> findcitybyid(@PathVariable("id") int id) {
	        try {
	        	System.out.println(id);
	            return new ResponseEntity<CityApi>(cityService.findCityById(id),HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<CityApi>(HttpStatus.BAD_REQUEST);
	        }
	    }
	 @RequestMapping(value="findHome", method=RequestMethod.GET)
	    public ResponseEntity<List<AccommodationOfCityApi>> findHome() {
	        try {
	            return new ResponseEntity<List<AccommodationOfCityApi>>(cityService.findHomeCity(), HttpStatus.OK);
	        } catch (Exception ex) {
	            ex.printStackTrace();
	            return new ResponseEntity<List<AccommodationOfCityApi>>(HttpStatus.BAD_REQUEST);
	        }
	    }

	 @RequestMapping(value="findallwithhome", method=RequestMethod.GET)
		public ResponseEntity<List<CityApi>> findAllWithHome() {
			try {
				return new ResponseEntity<List<CityApi>>(cityService.findAllCityWithHome(), HttpStatus.OK);
			} catch (Exception ex) {
				ex.printStackTrace();
				return new ResponseEntity<List<CityApi>>(HttpStatus.BAD_REQUEST);
			}
		}
	 
}
