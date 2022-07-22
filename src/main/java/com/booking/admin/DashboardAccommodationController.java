package com.booking.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.Accommodation;
import com.booking.services.IAccommodationService;
import com.booking.services.ICategoryService;
import com.booking.services.ICityService;

@Controller
@RequestMapping(value = "admin/dashboard/accommodation")
public class DashboardAccommodationController {
	
	@Autowired
	private IAccommodationService accommodationService;
	
	@Autowired
	private ICategoryService categoryService;
	
	@Autowired 
	private ICityService cityService;
	
	@RequestMapping(value = "info",method = RequestMethod.GET)
	public String accommodationInfo(ModelMap modelMap) {
		modelMap.put("accoms", accommodationService.findAllByHostId(1));
		modelMap.put("categories", categoryService.findAll());
		modelMap.put("cities",cityService.findAll());
		System.out.println(accommodationService.findAllByHostId(1));
		return "admin/dashboard/accommodation-info";
	}
	
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public String accommodationUpdate(
			Accommodation accommodation,@RequestParam(name =  "photos", required = false )
			MultipartFile[] photos,
			RedirectAttributes redirectAttributes) 
	{
		accommodation.setStaff_id(1);
		boolean result = accommodationService.update(accommodation);
		if(!result) {
			redirectAttributes.addFlashAttribute("result", "failed");
		}
		else {
			redirectAttributes.addFlashAttribute("result", "success");
		}
		return "redirect:/admin/dashboard/accommodation/info";
		
	}
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String accommodationAdd(ModelMap modelMap) {
		modelMap.put("categories", categoryService.findAll());
		modelMap.put("cities",cityService.findAll());
		return "admin/dashboard/accommodation-add";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String accommodationAddSubmit(Accommodation accommodation,@RequestParam(name =  "photos", required = false )
	MultipartFile[] photos,
	RedirectAttributes redirectAttributes) {
		accommodation.setStaff_id(1);
		System.out.println("File size : " + photos.length);
		boolean result = accommodationService.create(accommodation) != null;
		if(!result) {
			redirectAttributes.addFlashAttribute("result", "failed");
		}
		else {
			redirectAttributes.addFlashAttribute("result", "success");
		}
		return "admin/dashboard/accommodation-add";
	}
	
	@RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
	public String accommodationDelete( Accommodation accommodation,@PathVariable("id") int id,
			RedirectAttributes redirectAttributes) 
	{
		boolean result = accommodationService.delete(id);
		if(!result) {
			redirectAttributes.addFlashAttribute("result", "failed");
		}
		else {
			redirectAttributes.addFlashAttribute("result", "success");
		}
		return "redirect:/admin/dashboard/accommodation/info";
		
	}
	
}
