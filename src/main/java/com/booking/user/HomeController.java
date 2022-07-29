package com.booking.user;



import com.booking.entities.*;
import com.booking.services.IAccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booking.apis.APIClient;
import com.booking.apis.StaffAPI;
import com.booking.services.ICategoryService;
import com.booking.services.ICityService;

import retrofit2.Response;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "home")
public class HomeController {

	@Autowired
	private ICategoryService categoryService;

	@Autowired
	private ICityService cityService;

	@Autowired
	private IAccommodationService accommodationService;

	@RequestMapping(value = {"index",""}, method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("accommodationOfCity", cityService.findAllAccommodationOfCity());
		modelMap.put("accommodationOfCategory", categoryService.findAllAccommodationOfCategory());
		return "home/index";
	}
	
	@RequestMapping(value = {"search/{cityid}"}, method = RequestMethod.GET)
	public String search(HttpServletRequest request, @PathVariable("cityid") int cityid, ModelMap modelMap) {
		// Success
		SearchAccommodation searchAccommodation = accommodationService.findAllByCityId(cityid);
		int result = searchAccommodation.getAccommodationQuantity();
		List<Accommodation> accomodations = searchAccommodation.getAccommodations();
		String city = searchAccommodation.getAccommodations().get(0).getCity_name();
		modelMap.put("result",result);
		modelMap.put("city",city);
		modelMap.put("accomms",accomodations);
		return "home/search";
	}
	
	@RequestMapping(value = {"details/{accommodationId}"}, method = RequestMethod.GET)
	public String details(@PathVariable("accommodationId") Integer id,ModelMap modelMap) {

		AccommodationDetail accommodationDetail = accommodationService.findaccommodationdetail(id);
		List<String> images = accommodationDetail.getImages();
		List<Service> services = accommodationDetail.getServices();
		List<RoomDetail> rooms = accommodationDetail.getRooms();
		Accommodation accommodations = accommodationDetail.getAccommodation();
		modelMap.put("images",images);
		modelMap.put("services",services);
		modelMap.put("rooms",rooms);
		modelMap.put("accommodation",accommodations);


		return "home/details";
	}
}
