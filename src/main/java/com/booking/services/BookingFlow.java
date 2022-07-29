package com.booking.services;

import org.springframework.stereotype.Service;

import com.booking.entities.Booking;
import com.booking.entities.BookingDetail;
import com.booking.entities.Invoice;

@Service
public class BookingFlow implements IBookingFlow{
	
	
	// Autowired booking-Service
	// Autowired booking_detail-Service
	// Autowired invoice-Service
	
	@Override
	public void mainFlowBooking(Booking booking, BookingDetail bookingDetail, Invoice invoice) {
		//1.Booking bookingNew =  bookingService.create(booking);
		
		//2. bookingDetail.set(bookingNew.getId());
		// BookingDetail bookingDetail_new = bookingDetailService.create(bookingDetail);
		
		// 3. invoice.setBookingId(bookingNew.getId());
		// Invoice invoice_new = invoice_Service.create(invoice)
	}

	

}
