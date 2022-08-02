package com.booking.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entities.AccommodationDetail;
import com.booking.entities.Room;
import com.booking.entities.RoomDetail;
import com.booking.entities.Voucher;
import com.booking.services.IAccommodationService;

@RestController
@RequestMapping(value = "ajax/accommodation")
public class CheckRoomAjaxController {
	
	@Autowired
	private IAccommodationService accommodationService;
	
	@RequestMapping(value = "checkroom" , method = RequestMethod.GET,produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public AccommodationDetail check(@RequestParam("accommodation_id") Integer accommodation_id,
    		@RequestParam("dateRange") String dateRange,@RequestParam("adult") int adult,
    		@RequestParam("children") int children){
	   AccommodationDetail accommodationDetail = new AccommodationDetail();
	   String[] dateRanges = dateRange.split(" to ");
	   accommodationDetail = accommodationService.findaccommodationdetail1(accommodation_id, dateRanges[0], dateRanges[1], adult, children);
	   
       return accommodationDetail;
    }
}
