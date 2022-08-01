package com.booking.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entities.Booking;
import com.booking.entities.BookingDetail;
import com.booking.entities.Invoice;
import com.booking.helpers.BookingDateHelper;

@Service
public class BookingFlow implements IBookingFlow{
	
	@Autowired
	private IBookingService bookingService;
	@Autowired
	private IBookingDetailService bookingDetailService;
	@Autowired
	private IInvoiceService invoiceService;
	@Autowired
	private IRoomService roomService;
	
	@Override
	public void mainFlowBooking(Booking booking, BookingDetail bookingDetail, Invoice invoice) {
		if(booking != null) {
			Booking booking_Saved = bookingService.create(booking);
			if(booking_Saved != null) {
				BookingDetail bookingDetail_Saved = bookingDetailService.create(bookingDetail);
				if(bookingDetail_Saved!=null) {
					invoice.setBooking_id(booking_Saved.getId());
					invoice.setStatus(true);
					invoiceService.create(invoice);
				}
			}
			else {
				System.out.println("Failed ko luu dc");
			}
			
		}

	}

	

}
