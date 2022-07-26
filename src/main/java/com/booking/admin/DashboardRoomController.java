package com.booking.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.entities.Image;
import com.booking.entities.Room;
import com.booking.services.IAccommodationService;
import com.booking.services.IImageService;
import com.booking.services.IRoomService;
import com.booking.services.IRoomTypeService;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

@Controller
@RequestMapping(value = { "admin/dashboard/room" })
public class DashboardRoomController {

	@Autowired
	private IRoomTypeService roomTypeService;

	@Autowired
	private IAccommodationService accommoService;

	@Autowired
	private IRoomService roomService;
	@Autowired
	private IImageService imageService;

	@RequestMapping(value = "type", method = RequestMethod.GET)
	public String roomType() {
		return "admin/dashboard/room-type";
	}

	@RequestMapping(value = "service", method = RequestMethod.GET)
	public String roomService() {
		return "admin/dashboard/room-service";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String roomAdd(ModelMap modelMap) {
		int hostId = 1;
		modelMap.put("roomTypes", roomTypeService.findAllByHostId(hostId));
		modelMap.put("accommos", accommoService.findAllByHostId(hostId));

		return "admin/dashboard/room-add";
	}

	@RequestMapping(value = "info", method = RequestMethod.GET)
	public String roomInfo(ModelMap modelMap) {
		int hostId = 1;
		modelMap.put("roomTypes", roomTypeService.findAllByHostId(hostId));
		modelMap.put("accommos", accommoService.findAllByHostId(hostId));
		modelMap.put("rooms", roomService.findAllByHostId(hostId));
		return "admin/dashboard/room-info";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String roomAddSubmit(Room room, @RequestParam(name = "photos", required = false) MultipartFile[] photos,
			RedirectAttributes redirectAttributes) throws IllegalStateException, IOException {
		int hostId = 1;
		room.setStaff_id(hostId);
		Room result = roomService.create(room);
		if(result != null) {
			
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
						image.setRoom_id(result.getId());
						image.setStatus(true);
						imageService.create(image);
						
				    }
				    
				}
			}
		}
		

		if (result != null) {
			redirectAttributes.addFlashAttribute("result", "failed");
		} else {
			redirectAttributes.addFlashAttribute("result", "success");
		}
		return "redirect:/admin/dashboard/room/add";
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	public String roomEdit(Room room, @RequestParam(name = "photos", required = false) MultipartFile[] photos,
			RedirectAttributes redirectAttributes) {
		int hostId = 1;
		room.setStaff_id(hostId);
		boolean result = roomService.update(room);
		if (!result) {
			redirectAttributes.addFlashAttribute("result", "failed");
		} else {
			redirectAttributes.addFlashAttribute("result", "success");
		}
		return "redirect:/admin/dashboard/room/info";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String roomDelete(@RequestParam("id") int id, RedirectAttributes redirectAttributes) {

		boolean result = roomService.delete(id);
		if (!result) {
			redirectAttributes.addFlashAttribute("result", "failed");
		} else {
			redirectAttributes.addFlashAttribute("result", "success");
		}
		return "redirect:/admin/dashboard/room/info";
	}
}
