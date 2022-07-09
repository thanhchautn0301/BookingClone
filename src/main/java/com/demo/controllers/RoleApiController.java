package com.demo.controllers;

import com.demo.entities_api.RoleApi;
import com.demo.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"api/role"})
public class RoleApiController {
    @Autowired
    private IRoleService roleService;
    @RequestMapping(value="findall", method= RequestMethod.GET)
    public List<RoleApi> findall() {
        try {
            return roleService.findall();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
