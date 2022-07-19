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
	
	@RequestMapping(value = "accommodation-info",method = RequestMethod.GET)
	public String accommodationInfo() {
		return "admin/dashboard/accommodation-info";
	}
	
	@RequestMapping(value = "accommodation-add",method = RequestMethod.GET)
	public String accommodationAdd() {
		return "admin/dashboard/add-accommodation";
	}
	
	@RequestMapping(value = "room-type",method = RequestMethod.GET)
	public String roomType() {
		return "admin/dashboard/room-type";
	}
	
	@RequestMapping(value = "room-service",method = RequestMethod.GET)
	public String roomService() {
		return "admin/dashboard/room-service";
	}
	
	@RequestMapping(value = "voucher",method = RequestMethod.GET)
	public String voucher() {
		return "admin/dashboard/voucher";
	}
	
	@RequestMapping(value = "room-add",method = RequestMethod.GET)
	public String roomAdd() {
		return "admin/dashboard/room-add";
	}
}
