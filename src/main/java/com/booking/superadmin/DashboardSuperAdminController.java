package com.booking.superadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.apis.APIClient;
import com.booking.apis.CityAPI;
import com.booking.entities.City;
import com.booking.services.ICityService;

import retrofit2.Response;

@Controller
@RequestMapping(value = {"superadmin/dashboard","superadmin"})
public class DashboardSuperAdminController {
	
	
	
	@RequestMapping(value = {"","index"},method = RequestMethod.GET)
	public String index() {
		return "superadmin/dashboard/index";
	}
	
	
	
	
	
	

}
