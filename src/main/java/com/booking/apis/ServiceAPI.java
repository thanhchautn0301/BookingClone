package com.booking.apis;


import com.booking.entities.AccommodationOfCity;
import com.booking.entities.City;
import com.booking.entities.Service;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceAPI {
	@POST("service/create")
	public Call<Service> create(@Body Service service);
	

}
