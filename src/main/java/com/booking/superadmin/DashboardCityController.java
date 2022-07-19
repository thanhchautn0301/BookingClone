package com.booking.superadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.City;
import com.booking.services.ICityService;

@Controller
@RequestMapping(value = "superadmin/dashboard/city")
public class DashboardCityController {
	@Autowired
	private ICityService cityService;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String city(ModelMap modelMap,@ModelAttribute("result") String result) {
		if(result != null) {
			System.out.println("Result : " + result);
		}
		modelMap.put("cities", cityService.findAll());
		return "superadmin/dashboard/city";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String city(@RequestParam("name") String cityName
			,RedirectAttributes redirectAttributes) {
			City city = cityService.create(cityName);
			if(city != null) {
				redirectAttributes.addFlashAttribute("result","success");
			}
			else {
				redirectAttributes.addFlashAttribute("result","failed");
			}
		return "redirect:/superadmin/dashboard/city";
	}
	
	@RequestMapping(value = "edit",method = RequestMethod.POST)
	public String city(@RequestParam("name") String cityName,@RequestParam("id") int id
			,RedirectAttributes redirectAttributes) {
			City city = new City();
			city.setId(id);
			city.setName(cityName);
			boolean result = cityService.update(city);
			if(result) {
				redirectAttributes.addFlashAttribute("result","success");
			}
			else {
				redirectAttributes.addFlashAttribute("result","failed");
			}
		return "redirect:/superadmin/dashboard/city";
	}
	
	@RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
	public String city(@PathVariable("id") int id
			,RedirectAttributes redirectAttributes) {
			boolean result = cityService.delete(id);
			if(result) {
				redirectAttributes.addFlashAttribute("result","success");
			}
			else {
				redirectAttributes.addFlashAttribute("result","failed");
			}
		return "redirect:/superadmin/dashboard/city";
	}
}
