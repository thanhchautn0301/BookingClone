package com.booking.apis;

import java.util.List;

import com.booking.entities.Accommodation;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AccommodationAPI {

	@GET("accomodation/findall")
	Call<List<Accommodation>> findall();
	
	@GET("accomodation/findaccomodationbyid/{id}")
	Call<List<Accommodation>> findById(@Path("id") int id);
	
	@GET("accomodation/findaccomodationbyhostid/{id}")
	Call<List<Accommodation>> findByHostId(@Path("id") int id);
	
	@PUT("accomodation/update")
	Call<Boolean> update(@Body Accommodation accommodation);
	
	@DELETE("accomodation/delete/{id}")
	Call<Boolean> delete(@Path("id") int id);
	
	@POST("accomodation/create")
	Call<Accommodation> create(@Body Accommodation accommodation);
}
