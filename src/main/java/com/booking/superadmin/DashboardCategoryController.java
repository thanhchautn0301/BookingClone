package com.booking.superadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.Category;
import com.booking.services.ICategoryService;

@Controller
@RequestMapping(value = "superadmin/dashboard/category")
public class DashboardCategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String category(ModelMap modelMap) {
		modelMap.put("categories", categoryService.findAll());
		return "superadmin/dashboard/category";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(@RequestParam("name") String name,RedirectAttributes redirectAttributes) {
		Category category = categoryService.create(name);
		if(category != null) {
			redirectAttributes.addFlashAttribute("result","success");
		}
		else {
			redirectAttributes.addFlashAttribute("result","failed");
		}
	return "redirect:/superadmin/dashboard/category";
	}
	
	@RequestMapping(value = "edit",method = RequestMethod.POST)
	public String edit(@RequestParam("name") String name,
			@RequestParam("id") int id,RedirectAttributes redirectAttributes) {
		Category category = new Category();
		category.setId(id);
		category.setName(name);
		category.setStatus(true);
		boolean result = categoryService.update(category);
		if(result) {
			redirectAttributes.addFlashAttribute("result","success");
		}
		else {
			redirectAttributes.addFlashAttribute("result","failed");
		}
	return "redirect:/superadmin/dashboard/category";
	}
	
	@RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id,RedirectAttributes redirectAttributes) {
		boolean result = categoryService.delete(id);
		if(result) {
			redirectAttributes.addFlashAttribute("result","success");
		}
		else {
			redirectAttributes.addFlashAttribute("result","failed");
		}
	return "redirect:/superadmin/dashboard/category";
	}
}
