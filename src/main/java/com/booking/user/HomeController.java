package com.booking.user;



import com.booking.entities.Accommodation;
import com.booking.entities.SearchAccommodation;
import com.booking.helpers.TokenReader;
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

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
	public String index(ModelMap modelMap, RedirectAttributes redirectAttributes) {
		modelMap.put("accommodationOfCity", cityService.findAllAccommodationOfCity());
		modelMap.put("accommodationOfCategory", categoryService.findAllAccommodationOfCategory());

		if(TokenReader.token !=null) {
			modelMap.put("msg","has-login");
			return "home/index";
		} else {
			modelMap.put("msg","not-login");
			return "home/index";
		}
	}
	
	@RequestMapping(value = {"search"}, method = RequestMethod.GET)
	public String searchbycityname(HttpServletRequest request, @RequestParam("cityName") String cityName, ModelMap modelMap) {
		// Success
		SearchAccommodation searchAccommodation = accommodationService.findAllByCityName(cityName);
		String city = cityName.toUpperCase();
		if(searchAccommodation !=null && searchAccommodation.getAccommodationQuantity() >0) {
			int result = searchAccommodation.getAccommodationQuantity();

			List<Accommodation> accomodations = searchAccommodation.getAccommodations();
			if(result >1) {
				modelMap.put("result", result+" accomodations");
				modelMap.put("city", city);
				modelMap.put("accomms", accomodations);
			}
			else {
				modelMap.put("result", result+" accomodation");
				modelMap.put("city", city);
				modelMap.put("accomms", accomodations);
			}
		}
		else {
			List<Accommodation> accomodations = searchAccommodation.getAccommodations();
			modelMap.put("result",0+" accomodation");
			modelMap.put("city",city);
			modelMap.put("accomms",null);
		}
		return "home/search";
	}

	@RequestMapping(value = {"search/{cityid}"}, method = RequestMethod.GET)
	public String searchbycityid(HttpServletRequest request, @PathVariable("cityid") int cityid, ModelMap modelMap) {
		// Success
		SearchAccommodation searchAccommodation = accommodationService.findAllByCityId(cityid);
		if(searchAccommodation !=null && searchAccommodation.getAccommodationQuantity() >0) {
			int result = searchAccommodation.getAccommodationQuantity();

			List<Accommodation> accomodations = searchAccommodation.getAccommodations();
			String city = searchAccommodation.getAccommodations().get(0).getCity_name();
			modelMap.put("result", result);
			modelMap.put("city", city);
			modelMap.put("accomms", accomodations);
		}
		else {
			List<Accommodation> accomodations = searchAccommodation.getAccommodations();
			String city = searchAccommodation.getAccommodations().get(0).getCity_name();
			modelMap.put("result",0);
			modelMap.put("city","This city");
			modelMap.put("accomms",null);
		}
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
