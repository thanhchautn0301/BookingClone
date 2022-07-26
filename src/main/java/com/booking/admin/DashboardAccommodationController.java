package com.booking.admin;

import com.booking.entities.Image;
import com.booking.services.IImageService;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import com.booking.helpers.TokenReader;
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

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "admin/dashboard/accommodation")
public class DashboardAccommodationController {
	@Autowired
	private IImageService imageService;
	@Autowired
	private IAccommodationService accommodationService;
	
	@Autowired
	private ICategoryService categoryService;
	
	@Autowired 
	private ICityService cityService;
	
	@RequestMapping(value = "info",method = RequestMethod.GET)
	public String accommodationInfo(ModelMap modelMap) {
		modelMap.put("accoms", accommodationService.findAllByHostId(6));
		modelMap.put("categories", categoryService.findAll());
		modelMap.put("cities",cityService.findAll());
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
	RedirectAttributes redirectAttributes) throws IOException {
		accommodation.setStaff_id(1);

		Accommodation result = accommodationService.create(accommodation);

		if(photos.length > 0) {
			for (MultipartFile file : photos) {

				File imageFile = new File(System.getProperty("java.io.tmpdir")+"/"+ file.getOriginalFilename());
				file.transferTo(imageFile);

				RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), imageFile);

				MultipartBody.Part imageBody = MultipartBody.Part.createFormData("file", imageFile.getName(), requestFile);
				String nameImageString = "";
				nameImageString = imageService.uploadFile(imageBody);

				if(nameImageString != "") {
					Image image = new Image();
					image.setName(nameImageString);
					image.setAccommodation_id(result.getId());
					image.setStatus(true);
					imageService.create(image);
				}

			}
		}


		if(result == null) {
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
