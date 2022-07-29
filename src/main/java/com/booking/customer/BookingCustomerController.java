package com.booking.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booking.entities.Booking;
import com.booking.entities.BookingDetail;
import com.booking.entities.BookingForm;
import com.booking.entities.Room;
import com.booking.helpers.BookingDateHelper;
import com.booking.services.ICustomerService;
import com.booking.services.IRoomService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "customer/booking")
public class BookingCustomerController {
	
	@Autowired
	private IRoomService roomService;
	
	@Autowired
	private ICustomerService customerService;
	
	private int customerId = 1;
	
	@RequestMapping(value = {"form"}, method = RequestMethod.GET)
	public String index(HttpSession session,ModelMap modelMap) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date bookingDate = new Date();
		
		//		id_Booking,id_customer,booking_date,payment,status
		Booking booking = new Booking(1,customerId,bookingDate,"Cash",true);
		
		
		Date dateCheckIn = new Date();
		try {
			dateCheckIn = dateFormat.parse("2022-08-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 Date dateCheckOut = new Date();
		try {
			dateCheckOut = dateFormat.parse("2022-08-14");
		} catch (ParseException e) {
			e.printStackTrace();
		}
//	 	id_bookingDetail,id_booking,id_room,quantityAdults,quantityChildren,
			// date_CheckIn,date_CheckOut,status
		BookingDetail bookingDetail = new  BookingDetail(1,1,1,3,2,dateCheckIn,dateCheckOut,true);
		BookingForm bookingForm = new BookingForm(booking,bookingDetail);
		session.setAttribute("booking", bookingForm);
		Room room = roomService.findRoomById(bookingDetail.getId());
		String roomPrice = String.format("%.2f", room.getPrice());
		modelMap.put("room", room);
		modelMap.put("customer", customerService.findCustomerById(customerId));
		modelMap.addAttribute("roomPrice", roomPrice);
		return "booking/booking-room";
	}

	@RequestMapping(value = {"success"}, method = RequestMethod.GET)
	public String success() {
		return "booking/booking-success";
	}
	
//	@RequestMapping(value = {"mainFLowBooking"}, method = RequestMethod.GET)
//	public String mainFLowBooking(//Nhan gia tri param tu form) {
	// Tao 3 doi tuong Booking, BookingDetail va Invoice
	
	// Gan gia tri cua cac param tuong ung vao 3 doi tuong
	
	
	// Goi service bookingFlow
	// bookingFLow.mainBookingFlow(booking,bookingDetail,invoice);
	
//		return "booking/booking-success";
//	}
	

}
