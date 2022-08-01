package com.booking.apis;

import com.booking.entities.Booking;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BookingAPI {
	@POST("booking/create")
	Call<Booking> create(@Body Booking booking);
}
