package com.booking.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"admin/dashboard","admin"})
public class DashboardAdminController {
	
	@RequestMapping(value = {"index",""},method = RequestMethod.GET)
	public String index() {
		return "admin/dashboard/index";
	}
	
	
	
	
	// @RequestMapping(value = "voucher",method = RequestMethod.GET)
	// public String voucher() {
	// 	return "admin/dashboard/voucher";
	// }
	
}
