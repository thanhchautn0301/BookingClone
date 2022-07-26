package com.booking.test;

import com.booking.entities.AuthRequest;
import com.booking.entities.AuthResponse;
import com.booking.helpers.TokenReader;
import com.booking.services.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private IStaffService staffService;

    @RequestMapping(value= {"index",""}, method= RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("auth",new AuthRequest());
        return "test/login";
    }

    @RequestMapping(value= {"requestresetpw"}, method= RequestMethod.GET)
    public String requestresetpw(@RequestParam("token") String resetPwToken, @RequestParam("id") int id) {
        // Assign reset password token for token reader
        System.out.println("Assign reset pw for asjkdg");
        System.out.println("Reset password token: "+resetPwToken);
        TokenReader.assignToken(resetPwToken);
        System.out.println("Token reader: "+TokenReader.token);
        TokenReader.assignUserId(id);

        return "redirect:/test/resetpw";
    }

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
                return "redirect:/test";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/home";
    }

    @RequestMapping(value= {"resetpw"}, method= RequestMethod.GET)
    public String resetpw() {
        return "test/resetpw";
    }

    @RequestMapping(value= {"login"}, method= RequestMethod.POST)
    public String index(@ModelAttribute("auth") AuthRequest auth) {
        try {
            AuthResponse authResponse = staffService.login(auth);
            if (authResponse != null) {

                // If sign in with inactivate account then generate an activateToken to its email
                if(authResponse.getEmail().trim().equalsIgnoreCase("inactivate")) {
                    System.out.println("Response: "+authResponse.getEmail());
                    // Thuc hien gui mail activate o day
                    // XXX
                    System.out.println("Activation link is: http://localhost:9597/test/verify?token="+authResponse.getAccessToken()+"&id="+authResponse.getId());
                    return "redirect:/test/activate";
                }

                // If sign in success then read its accessToken
                TokenReader.assignToken(authResponse.getAccessToken());
                TokenReader.assignUserId(authResponse.getId());
                return "redirect:/home/index";

            }
            else {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "test/login";
    }

    @RequestMapping(value= {"forgotpw"}, method= RequestMethod.GET)
    public String forgotpw(@RequestParam("email") String email) {
        try {
            System.out.println("You are here forgotpw");
            AuthResponse authResponse = staffService.forgotPw(email);
            if (authResponse != null) {

                // If sign in with inactivate account then generate an activateToken to its email
                if(authResponse.getEmail().trim().equalsIgnoreCase("resetpw")) {
                    System.out.println("Response: "+authResponse.getEmail());
                    // Thuc hien gui mail activate o day
                    // XXX
                    System.out.println("Follow the link to reset your password: http://localhost:9597/test/requestresetpw?token="+authResponse.getAccessToken()+"&id="+authResponse.getId());
                    // Redirect ve trang yeu cau check email
                    // Dung tam trang activate
                    return "redirect:/test/activate";
                }
                return "redirect:/home/index";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "test/resetpw";
    }

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
                return "redirect:/test";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/home";
    }



    @RequestMapping(value = "activate",method = RequestMethod.GET)
    public String activate() {
        return "test/activate";
    }
}
