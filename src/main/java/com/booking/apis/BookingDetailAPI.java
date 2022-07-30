package com.booking.apis;
import com.booking.entities.BookingDetail;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BookingDetailAPI {
	@POST("bookingdetail/create")
	Call<BookingDetail> create(@Body BookingDetail bookingDetail);
}
