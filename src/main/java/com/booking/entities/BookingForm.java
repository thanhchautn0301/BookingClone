package com.booking.entities;

public class BookingForm {
	
	private Booking booking;
	
	private BookingDetail bookingDetail;
	
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public BookingDetail getBookingDetail() {
		return bookingDetail;
	}
	public void setBookingDetail(BookingDetail bookingDetail) {
		this.bookingDetail = bookingDetail;
	}
	public BookingForm(Booking booking, BookingDetail bookingDetail) {
		super();
		this.booking = booking;
		this.bookingDetail = bookingDetail;
	}
	public BookingForm() {}
}
