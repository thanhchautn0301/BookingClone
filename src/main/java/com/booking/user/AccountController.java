package com.booking.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.Staff;
import com.booking.services.IStaffService;
import com.booking.services.StaffService;

@Controller
@RequestMapping(value = "account")
public class AccountController {
	
	@Autowired
	private IStaffService staffService;

	@RequestMapping(value = "sign",method = RequestMethod.GET)
	public String sign() {
		return "account/sign";
	}
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String login() {
		return "account/sign-pw";
	}

	@RequestMapping(value = "logout",method = RequestMethod.GET)
	public String logout() {
		return "redirect:/account/login";
	}

	@RequestMapping(value = "register",method = RequestMethod.GET)
	public String register() {
		return "account/register-pw";
	}

	@RequestMapping(value = "resetpw",method = RequestMethod.GET)
	public String resetpw() {
		return "account/resetpw";
	}


	@RequestMapping(value = "host/login", method = RequestMethod.GET)
	public String loginHost() {
		return "account/host-login";
	}

	@RequestMapping(value = "host/register",method = RequestMethod.POST)
	public String registerHost(Staff staff,RedirectAttributes redirectAttributes) {
		staff.setRole_id(1);
		boolean result = staffService.create(staff) != null;
		if(!result) {
			redirectAttributes.addFlashAttribute("result","failed");
		}
		else {
			redirectAttributes.addFlashAttribute("result","success");
		}
		return "redirect:/account/host/login";
	}
}
