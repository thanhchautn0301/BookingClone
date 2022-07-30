package com.booking.customer;


import com.booking.entities.*;
import com.booking.services.IVoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booking.helpers.BookingDateHelper;
import com.booking.services.IBookingFlow;
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
	private IVoucherService voucherService;
	
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	private IBookingFlow bookingFlow;
	
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
		BookingDetail bookingDetail = new  BookingDetail(1,1,2,3,2,dateCheckIn,dateCheckOut,true);
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
	
	@RequestMapping(value = {"startBooking"}, method = RequestMethod.POST)
	public String mainFLowBooking(HttpSession session,String voucherName) {
		BookingForm bookingForm = (BookingForm) session.getAttribute("booking");
		System.out.println("Booking detail checkin : " + bookingForm.getBookingDetail().getCheckin());
		System.out.println("Booking detail checkout : " + bookingForm.getBookingDetail().getCheckout());
		// Lay tu input voucher tu form booking
		// Day la set cung
		// if else kiem tra xem voucher name co rong hay khong
		voucherName = "abc";
		Voucher voucher = voucherService.findVoucherByName(voucherName);
		Invoice invoice = new Invoice();
		invoice.setVoucher_id(voucher.getId());
		bookingFlow.mainFlowBooking(bookingForm.getBooking(), bookingForm.getBookingDetail(), invoice);
		return "booking/booking-success";
	}
	// Chau^ Chau^' viet ajax controller kiem tra check
}
