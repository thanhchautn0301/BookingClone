package com.booking.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "account")
public class AccountController {
	
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
}
