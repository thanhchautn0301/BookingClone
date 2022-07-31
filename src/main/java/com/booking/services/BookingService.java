package com.booking.services;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.BookingAPI;
import com.booking.entities.Booking;

import retrofit2.Response;

@Service
public class BookingService implements IBookingService {
	
	private BookingAPI bookingAPI;
	
	public BookingService() {
		bookingAPI = APIClient.getClient().create(BookingAPI.class);
	}
	
	@Override
	public Booking create(Booking booking) {
		Response<Booking> response;
		try {
			booking.setStatus(true);
			response = bookingAPI.create(booking).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
