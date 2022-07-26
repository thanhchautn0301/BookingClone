package com.booking.superadmin;

import com.booking.services.IImageService;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.City;
import com.booking.services.ICityService;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "superadmin/dashboard/city")
public class DashboardCityController {
	@Autowired
	private ICityService cityService;
	@Autowired
	private IImageService imageService;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String city(ModelMap modelMap,@ModelAttribute("result") String result) {
		if(result != null) {
			System.out.println("Result : " + result);
		}
		modelMap.put("cities", cityService.findAll());
		return "superadmin/dashboard/city";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String city(@RequestParam("name") String cityName, @RequestParam(name = "photos", required = false) MultipartFile photos
			,RedirectAttributes redirectAttributes) throws IOException {
			City city = null;
			if(photos != null){
				File imageFile = new File(System.getProperty("java.io.tmpdir")+"/"+ photos.getOriginalFilename());
				photos.transferTo(imageFile);

				RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), imageFile);

				MultipartBody.Part imageBody = MultipartBody.Part.createFormData("file", imageFile.getName(), requestFile);
				String nameImageString = "";
				nameImageString = imageService.uploadFile(imageBody);
				if(nameImageString != "") {
					city = cityService.create(cityName,nameImageString);
				}
			}

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
