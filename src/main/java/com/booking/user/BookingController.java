package com.booking.user;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "booking")
public class BookingController {
	@RequestMapping(value = {"form"}, method = RequestMethod.GET)
	public String index() {
		return "booking/booking-room";
	}

	@RequestMapping(value = {"success"}, method = RequestMethod.GET)
	public String success() {
		return "booking/booking-success";
	}
}
