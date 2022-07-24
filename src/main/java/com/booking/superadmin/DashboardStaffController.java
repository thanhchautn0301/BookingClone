package com.booking.superadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.Staff;
import com.booking.services.IRoleService;
import com.booking.services.IStaffService;

@Controller
@RequestMapping(value = "superadmin/dashboard/staff")
public class DashboardStaffController {
	
	@Autowired
	private IRoleService roleService;
	
	@Autowired
	private IStaffService staffService;
	
	@RequestMapping(value = "info",method = RequestMethod.GET)
	public String staffInfo(ModelMap modelMap) {
		modelMap.put("staffs", staffService.findAll());
		return "superadmin/dashboard/staff-info";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String staffAdd(ModelMap modelMap) {
		modelMap.put("roles", roleService.findAll());
		return "superadmin/dashboard/staff-add";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String staffAddSubmit(Staff staff,RedirectAttributes redirectAttributes) {
		staff.setPassword("abc");
		staffService.create(staff);
		if(staff != null) {
			redirectAttributes.addFlashAttribute("result", "success");
		}
		else {
			redirectAttributes.addFlashAttribute("result", "failed");
		}
		return "redirect:/superadmin/dashboard/staff/add";
	}
}
