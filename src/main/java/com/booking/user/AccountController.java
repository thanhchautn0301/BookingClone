package com.booking.user;

import com.booking.entities.AuthRequest;
import com.booking.entities.AuthResponse;
import com.booking.helpers.TokenReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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


	// done
	@RequestMapping(value= {"resetpw"}, method= RequestMethod.POST)
	public String resetpw(@RequestParam("password") String password) {
		try {
			// Thuc hien reset pw
			System.out.println("Bat dau reset password");
			if(staffService.resetpw(TokenReader.userid, password) >0) {
				System.out.println("Password moi la: "+password);
				System.out.println("User id: "+TokenReader.userid);
				// Huy token
				TokenReader.assignToken(null);
				TokenReader.assignUserId(0);
				return "redirect:/account/customer/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/home";
	}

	// done
	@RequestMapping(value= {"forgotpw"}, method= RequestMethod.GET)
	public String forgotpw(@RequestParam("email") String email, RedirectAttributes redirectAttributes) {
		try {
			AuthResponse authResponse = staffService.forgotPw(email);
			if (authResponse != null) {
				if(authResponse.getEmail().trim().equalsIgnoreCase("resetpw")) {
					return "redirect:/account/resetPwAlert";
				}
				return "redirect:/home/index";
			}
			else {
				redirectAttributes.addFlashAttribute("msg","This email has not registered before!");
				return "redirect:/account/resetAccountPassword";
			}
		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("msg","This email has not registered before!");
			return "redirect:/account/resetAccountPassword";
		}
	}

	//done
	@RequestMapping(value= {"requestresetpw"}, method= RequestMethod.GET)
	public String requestresetpw(@RequestParam("token") String resetPwToken, @RequestParam("id") int id) {
		// Assign reset password token for token reader
		System.out.println("Assign reset pw for asjkdg");
		System.out.println("Reset password token: "+resetPwToken);
		TokenReader.assignToken(resetPwToken);
		System.out.println("Token reader: "+TokenReader.token);
		TokenReader.assignUserId(id);

		return "redirect:/account/resetpw";
	}

	// done
	@RequestMapping(value = "resetpw",method = RequestMethod.GET)
	public String resetpw() {
		return "account/reset-pw";
	}

	//done
	@RequestMapping(value = "resetPwAlert",method = RequestMethod.GET)
	public String resetPwAlert() {
		return "account/resetpw-alert";
	}

	// done
	@RequestMapping(value = "customer/login", method = RequestMethod.GET)
	public String loginCustomer() {
		return "account/customer-login";
	}

	//done
	@RequestMapping(value = "activate",method = RequestMethod.GET)
	public String activate() {
		return "account/activate-alert";
	}

	// done
	@RequestMapping(value = "host/login", method = RequestMethod.POST)
	public String loginHost(@RequestParam("email") String email,@RequestParam("password") String password, RedirectAttributes redirectAttributes) {
		try {
			AuthRequest auth = new AuthRequest(email,password);
			AuthResponse authResponse = staffService.login(auth);
			System.out.println("Loi o day !!");
			if (authResponse != null) {
				// If sign in with unactivate account
				if(authResponse.getEmail().trim().equalsIgnoreCase("inactivate")) {
					return "redirect:/account/activate";
				}
				// If sign in success then read its accessToken
				TokenReader.assignToken(authResponse.getAccessToken());
				TokenReader.assignUserId(authResponse.getId());
				return "redirect:/home/index";
			}
			else {
				redirectAttributes.addFlashAttribute("msg","Wrong email or password ");
				return "redirect:/account/customer/login";
			}
		} catch (Exception e) {
			return "redirect:/account/customer/login";
		}
	}

	// done
	@RequestMapping(value= {"resetAccountPassword"}, method= RequestMethod.GET)
	public String resetAccountPassword()
	{
		return "account/reset-account";
	}

	// done
	@RequestMapping(value= {"verify"}, method= RequestMethod.GET)
	public String verify(@RequestParam("token") String activateToken, @RequestParam("id") int id) {
		try {
			// Read activate token and assignToken
			TokenReader.assignToken(activateToken);
			// Thuc hien activate account
			if(staffService.activate(id) >0) {
				// Huy token
				TokenReader.assignToken(null);
				TokenReader.assignUserId(0);
				return "redirect:/account/customer/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/home";
	}

	// done
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
		return "redirect:/account/customer/login";
	}

	// done
	@RequestMapping(value = "customer/logout",method = RequestMethod.GET)
	public String logout(Staff staff) {
		if(TokenReader.token !=null) {
			System.out.println("Da logout !!");
			TokenReader.assignToken(null);
		}
		return "redirect:/home/index";
	}
}
