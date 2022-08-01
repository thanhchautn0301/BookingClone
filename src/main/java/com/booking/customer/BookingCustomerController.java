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
	
	private int accomodation_id;
	
	private int customerId = 1;
	
	@RequestMapping(value = {"form"}, method = RequestMethod.GET)
	public String index(HttpSession session,ModelMap modelMap,
			@RequestParam("checkIn") String checkIn,@RequestParam("checkOut") String checkOut
			,@RequestParam("id") int roomId) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date bookingDate = new Date();
		
		//		id_Booking,id_customer,booking_date,payment,status
		Booking booking = new Booking(1,customerId,bookingDate,"Cash",true);

		
		Date dateCheckIn = null;
		try {
			dateCheckIn = dateFormat.parse(checkIn);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 Date dateCheckOut = null;
		try {
			dateCheckOut = dateFormat.parse(checkOut);
		} catch (ParseException e) {
			e.printStackTrace();
		}
//	 	id_bookingDetail,id_booking,id_room,quantityAdults,quantityChildren,
			// date_CheckIn,date_CheckOut,status
		BookingDetail bookingDetail = new  BookingDetail(1,1,roomId,3,2,dateCheckIn,dateCheckOut,true);
		BookingForm bookingForm = new BookingForm(booking,bookingDetail);
		session.setAttribute("booking", bookingForm);
		Room room = roomService.findRoomById(bookingDetail.getRoomId());
		String roomPrice = String.format("%.2f", room.getPrice());
		modelMap.put("room", room);
		accomodation_id = room.getAccomodation_id();
		modelMap.put("customer", customerService.findCustomerById(customerId));
		modelMap.addAttribute("roomPrice", roomPrice);
		return "booking/booking-room";
	}

	@RequestMapping(value = {"success"}, method = RequestMethod.GET)
	public String success() {
		return "booking/booking-success";
	}
	
	@RequestMapping(value = {"startBooking"}, method = RequestMethod.POST)
	public String mainFLowBooking(HttpSession session,@RequestParam("voucher") String voucherName) {
		BookingForm bookingForm = (BookingForm) session.getAttribute("booking");
		
		// Lay tu input voucher tu form booking
		// Day la set cung
		// if else kiem tra xem voucher name co rong hay khong
		Voucher voucher = new Voucher();
		long get_stayDays = BookingDateHelper.countDay(bookingForm.getBookingDetail().getCheckin(),bookingForm.getBookingDetail().getCheckout());
		double total = get_stayDays * roomService.findPriceByRoomId(bookingForm.getBookingDetail().getRoomId());
		Invoice invoice = new Invoice();
		if(voucherName != "") {
			voucher = voucherService.findVoucherByName(voucherName,accomodation_id);
		}
		if(voucher.getId() != 0 ) {
			invoice.setVoucher_id(voucher.getId());
			total -= voucher.getPriceDiscount();
			if(total < 0) {
				total = 0;
			}
		}
		invoice.setTotal(total);
		bookingFlow.mainFlowBooking(bookingForm.getBooking(), bookingForm.getBookingDetail(), invoice);
		return "booking/booking-success";
	}
	// Chau^ Chau^' viet ajax controller kiem tra check
}
