package com.booking.user;



import com.booking.entities.Accommodation;
import com.booking.entities.SearchAccommodation;
import com.booking.helpers.Filter;
import com.booking.helpers.TokenReader;
import com.booking.entities.*;
import com.booking.helpers.Util;
import com.booking.services.IAccommodationService;
import com.booking.services.IRoomService;
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
import javax.servlet.http.HttpSession;
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

	@Autowired
	private IRoomService roomService;

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
	public String searchbycityname(HttpServletRequest request,
								   HttpSession session,
								   @RequestParam("cityName") String cityName, @RequestParam(value = "daterange", required = false) String dateRange,@RequestParam(value = "category",required = false) String category, ModelMap modelMap, RedirectAttributes redirectAttributes) {
		// Success
		if(dateRange == null || dateRange == "") {
			SearchAccommodation searchAccommodation = accommodationService.findAllByCityName(cityName);
			String city = cityName.toUpperCase();
			Filter filter = new Filter();
			RoomType roomType = Util.GetRoomType(category);
			filter.setAdult(roomType.getQuantityAdult());
			filter.setChildren(roomType.getQuantityChildren());
			if (searchAccommodation != null && searchAccommodation.getAccommodationQuantity() > 0) {
				int result = searchAccommodation.getAccommodationQuantity();
				List<Accommodation> accomodations = searchAccommodation.getAccommodations();
				if (result > 1) {
					modelMap.put("result", result + " accomodations");
					modelMap.put("city", city);
					modelMap.put("accomms", accomodations);
//					modelMap.put("filter", filter);
				} else {
					modelMap.put("result", result + " accomodation");
					modelMap.put("city", city);
					modelMap.put("accomms", accomodations);
//					modelMap.put("filter", filter);
				}
			} else {
				List<Accommodation> accomodations = searchAccommodation.getAccommodations();
				modelMap.put("result", 0 + " accomodation");
				modelMap.put("city", city);
				modelMap.put("accomms", null);
			}
			filter.setCityName(cityName);
			session.setAttribute("filter",filter);
			return "home/search";
		}else{
			Filter filter = new Filter();
			RoomType roomType = Util.GetRoomType(category);
			List<String> dates = Util.getDate(dateRange);
			filter.setCityName(cityName);
			filter.setFromDate(dates.get(0));
			filter.setToDate(dates.get(1));
			filter.setAdult(roomType.getQuantityAdult());
			filter.setChildren(roomType.getQuantityChildren());
			List<RoomHome> rooms = null;
			try {
				 rooms = roomService.findroombycitydaterequest(cityName,dateRange,category);
				if(rooms.size() > 0){
					modelMap.put("result", rooms.size() + " Room");
					modelMap.put("rooms", rooms);					
				}else{
					modelMap.put("result", 0 + " Room");
					modelMap.put("rooms", null);
				}
				session.setAttribute("filter",filter);
				return "home/searchHome";
			}catch (Exception e){
				redirectAttributes.addFlashAttribute("msg","Error server not found");
				return "redirect:/home/index";
			}
		}
	}

	@RequestMapping(value = {"search/{cityid}"}, method = RequestMethod.GET )
	public String searchbycityid(HttpSession session,HttpServletRequest request, @PathVariable("cityid") int cityid, ModelMap modelMap) {
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
	public String details(@PathVariable("accommodationId") Integer id,ModelMap modelMap, HttpSession session) {

		AccommodationDetail accommodationDetail = new AccommodationDetail();
		Filter filter = (Filter) session.getAttribute("filter");
		if(filter.getFromDate() !=null && filter.getToDate() !=null && filter.getAdult() !=null && filter.getChildren() !=null){
			accommodationDetail = accommodationService.findaccommodationdetail1(id, filter.getFromDate(), filter.getToDate(), filter.getAdult(), filter.getChildren());
		}else{
			accommodationDetail = accommodationService.findaccommodationdetail(id);
		}
		List<String> images = accommodationDetail.getImages();
		List<Service> services = accommodationDetail.getServices();
		List<RoomDetail> rooms = accommodationDetail.getRooms();
		Accommodation accommodations = accommodationDetail.getAccommodation();
		modelMap.put("images",images);
		modelMap.put("services",services);
		if(filter.getFromDate() ==null && filter.getToDate() == null) {
			rooms = null;
		}
		modelMap.put("rooms",rooms);
		modelMap.put("accommodation",accommodations);
		return "home/details";
	}

	//loc
	@RequestMapping(value = {"searchhome"}, method = RequestMethod.GET)
	public String searchbycitynamehome(HttpServletRequest request,
								   HttpSession session,@RequestParam(value = "category",required = false) String category,
								   @RequestParam("cityName") String cityName, @RequestParam(value = "datecheckin", required = false) String fromDate,@RequestParam(value = "checkout",required = false) String toDate, ModelMap modelMap, RedirectAttributes redirectAttributes) {
		// Success
		if(fromDate == null || toDate == "") {
			SearchAccommodation searchAccommodation = accommodationService.findAllByCityName(cityName);
			String city = cityName.toUpperCase();
			Filter filter = new Filter();
			RoomType roomType = Util.GetRoomType(category);
			filter.setAdult(roomType.getQuantityAdult());
			filter.setChildren(roomType.getQuantityChildren());
			if (searchAccommodation != null && searchAccommodation.getAccommodationQuantity() > 0) {
				int result = searchAccommodation.getAccommodationQuantity();
				List<Accommodation> accomodations = searchAccommodation.getAccommodations();
				if (result > 1) {
					modelMap.put("result", result + " accomodations");
					modelMap.put("city", city);
					modelMap.put("accomms", accomodations);
				} else {
					modelMap.put("result", result + " accomodation");
					modelMap.put("city", city);
					modelMap.put("accomms", accomodations);
				}
			} else {
				List<Accommodation> accomodations = searchAccommodation.getAccommodations();
				modelMap.put("result", 0 + " accomodation");
				modelMap.put("city", city);
				modelMap.put("accomms", null);
			}
			session.setAttribute("filter", filter);
			return "home/search";
		}else{
			String dateRange = fromDate +" to "+toDate;
			Filter filter = new Filter();
			RoomType roomType = Util.GetRoomType(category);

			filter.setCityName(cityName);
			filter.setFromDate(fromDate);
			filter.setToDate(toDate);
			filter.setAdult(roomType.getQuantityAdult());
			filter.setChildren(roomType.getQuantityChildren());
			List<RoomHome> rooms = null;
			try {
				rooms = roomService.findroombycitydaterequest(cityName,dateRange,category);
				if(rooms.size() > 0){
					modelMap.put("result", rooms.size() + " Room");
					modelMap.put("rooms", rooms);
				}else{
					modelMap.put("result", 0 + " Room");
					modelMap.put("rooms", null);
				}
				session.setAttribute("filter",filter);
				return "home/searchHome";
			}catch (Exception e){
				redirectAttributes.addFlashAttribute("msg","Error server not find");
				return "redirect:/home/index";
			}
		}
	}

}
