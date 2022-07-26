package com.booking.superadmin;

import com.booking.entities.Image;
import com.booking.services.IImageService;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.Category;
import com.booking.services.ICategoryService;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "superadmin/dashboard/category")
public class DashboardCategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	@Autowired
	private IImageService imageService;
	
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String category(ModelMap modelMap) {
		modelMap.put("categories", categoryService.findAll());
		return "superadmin/dashboard/category";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(@RequestParam("name") String name, @RequestParam(name = "photos", required = false) MultipartFile photos, RedirectAttributes redirectAttributes) throws IOException {
		Category category = null;
		if(photos != null){
			File imageFile = new File(System.getProperty("java.io.tmpdir")+"/"+ photos.getOriginalFilename());
			photos.transferTo(imageFile);

			RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), imageFile);

			MultipartBody.Part imageBody = MultipartBody.Part.createFormData("file", imageFile.getName(), requestFile);
			String nameImageString = "";
			nameImageString = imageService.uploadFile(imageBody);

			if(nameImageString != "") {
				 category = categoryService.create(name,nameImageString);
			}
		}

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
