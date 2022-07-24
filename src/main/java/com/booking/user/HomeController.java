package com.booking.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booking.apis.APIClient;
import com.booking.apis.StaffAPI;
import com.booking.services.ICategoryService;
import com.booking.services.ICityService;

import retrofit2.Response;

@Controller
@RequestMapping(value = "home")
public class HomeController {

	@Autowired
	private ICategoryService categoryService;

	@Autowired
	private ICityService cityService;

	@RequestMapping(value = {"index",""}, method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("accommodationOfCity", cityService.findAllAccommodationOfCity());
		modelMap.put("accommodationOfCategory", categoryService.findAllAccommodationOfCategory());
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
