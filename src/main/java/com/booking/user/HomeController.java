package com.booking.user;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booking.apis.APIClient;
import com.booking.apis.StaffAPI;


import retrofit2.Response;

@Controller
@RequestMapping(value = "home")
public class HomeController {

	@RequestMapping(value = {"index",""}, method = RequestMethod.GET)
	public String index() {
		
		return "home/index";
	}
	
	@RequestMapping(value = {"search"}, method = RequestMethod.GET)
	public String search() {
		return "home/search";
	}
	
	@RequestMapping(value = {"details"}, method = RequestMethod.GET)
	public String details() {
		return "home/details";
	}
}
