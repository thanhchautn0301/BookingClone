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
				System.out.println("Id: " + booking_Saved.getId());
//				BookingDetail bookingDetail2 = new  BookingDetail();
//				bookingDetail2.setCheckin(new Date());
//				bookingDetail2.setCheckout(new Date());
//				bookingDetail2.setRoomId(1);
//				bookingDetail2.setQuantityAdult(3);
//				bookingDetail2.setQuantityChildren(2);
//				bookingDetail2.setStatus(true);
//				bookingDetail2.setBookingId(booking_Saved.getId());
				BookingDetail bookingDetail_Saved = bookingDetailService.create(bookingDetail);
				if(bookingDetail_Saved!=null) {
					invoice.setBooking_id(booking_Saved.getId());
					invoice.setStatus(true);
//					if(invoice.getVoucher_id() != 0) {
//						// do something
//					}
					long get_stayDays = BookingDateHelper.countDay(bookingDetail.getCheckin(), bookingDetail.getCheckout());
					double total = get_stayDays * roomService.findPriceByRoomId(bookingDetail.getRoomId());
					invoice.setTotal(total);
					invoiceService.create(invoice);
				}
			}
			else {
				System.out.println("Failed ko luu dc");
			}
			
		}
		
		
		//2. bookingDetail.set(bookingNew.getId());
		// BookingDetail bookingDetail_new = bookingDetailService.create(bookingDetail);
		
		// 3. invoice.setBookingId(bookingNew.getId());
		// Invoice invoice_new = invoice_Service.create(invoice)
	}

	

}
