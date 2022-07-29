package com.booking.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "customer")
public class CustomerController {
	
	@RequestMapping(value = "profile", method = RequestMethod.GET)
	public String profile() {
		return "customer/profile";
	}
	
	@RequestMapping(value = "features", method = RequestMethod.GET)
	public String features() {
		return "customer/features";
	}
}
