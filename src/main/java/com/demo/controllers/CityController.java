package com.demo.controllers;



import java.util.List;

import org.apache.tomcat.util.http.fileupload.util.mime.MimeUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.City;
import com.demo.entities_api.CityApi;
import com.demo.services.ICityService;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping( value = "api/city")
public class CityController {
	
	@Autowired
	private ICityService cityService;
	
	@RequestMapping(value = "create" , produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
	consumes = MimeTypeUtils.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public ResponseEntity<CityApi> create(@RequestBody CityApi cityApi){
		
		try {
			return new ResponseEntity<CityApi>(cityService.create(cityApi),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<CityApi>(HttpStatus.BAD_REQUEST);
		}
	}

//	@RolesAllowed("HOST")
	@RequestMapping(value = "findall" , produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	public ResponseEntity<List<CityApi>> findall(){
				try {
					return new ResponseEntity<List<CityApi>>(cityService.findAllCity(),HttpStatus.OK);
				} catch (Exception e) {
					return new ResponseEntity<List<CityApi>>(HttpStatus.BAD_REQUEST);
				}
	}
	
	@RequestMapping(value = "findCityById/{id}" , produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
			public ResponseEntity<CityApi> findById(@PathVariable("id") int id){
				
				try {
					return new ResponseEntity<CityApi>(cityService.findCityById(id),HttpStatus.OK);
				} catch (Exception e) {
					return new ResponseEntity<CityApi>(HttpStatus.BAD_REQUEST);
				}
			}
	
	@RequestMapping(value = "delete/{id}" , produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			method = RequestMethod.DELETE)
			public ResponseEntity<Boolean> delete(@PathVariable("id") int id){
				
				try {
					return new ResponseEntity<Boolean>(cityService.delete(id),HttpStatus.OK);
				} catch (Exception e) {
					return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
				}
			}
	@RequestMapping(value = "update" , produces = MimeTypeUtils.APPLICATION_JSON_VALUE,
			consumes = MimeTypeUtils.APPLICATION_JSON_VALUE,
			method = RequestMethod.PUT)
			public ResponseEntity<Boolean> update(@RequestBody CityApi cityAPi){
				
				try {
					return new ResponseEntity<Boolean>(cityService.update(cityAPi),HttpStatus.OK);
				} catch (Exception e) {
					return new ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
				}
			}
}
