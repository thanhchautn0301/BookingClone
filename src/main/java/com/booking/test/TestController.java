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

    @RequestMapping(value= {"login"}, method= RequestMethod.POST)
    public String index(@ModelAttribute("auth") AuthRequest auth) {
        try {
            AuthResponse authResponse = staffService.login(auth);
            if (authResponse != null) {
                System.out.println(authResponse.getAccessToken());
                System.out.println(authResponse.getId());

                TokenReader.assignToken(authResponse.getAccessToken());
                TokenReader.assignUserId(authResponse.getId());
                return "redirect:/home/index";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "test/login";
    }
}
