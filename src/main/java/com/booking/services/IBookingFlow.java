package com.booking.services;

import com.booking.entities.Booking;
import com.booking.entities.BookingDetail;
import com.booking.entities.Invoice;

public interface IBookingFlow {
	public void mainFlowBooking(Booking booking, BookingDetail bookingDetail,Invoice invoice);
}
