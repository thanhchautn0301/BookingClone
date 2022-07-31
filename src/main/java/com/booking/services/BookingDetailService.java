package com.booking.services;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.BookingDetailAPI;
import com.booking.entities.BookingDetail;

import retrofit2.Response;

@Service
public class BookingDetailService implements IBookingDetailService {
	
	private BookingDetailAPI bookingDetailAPI;
	
	public BookingDetailService() {
		bookingDetailAPI = APIClient.getClient().create(BookingDetailAPI.class);
	}
	@Override
	public BookingDetail create(BookingDetail bookingDetail) {
		Response<BookingDetail> response;
		try {
			bookingDetail.setStatus(true);
			response = bookingDetailAPI.create(bookingDetail).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
