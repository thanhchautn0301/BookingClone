package com.booking.apis;

import java.util.List;

import com.booking.entities.Accommodation;

import com.booking.entities.SearchAccommodation;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface AccommodationAPI {

	@GET("accomodation/findall")
	Call<List<Accommodation>> findall();
	
	@GET("accomodation/findaccomodationbyid/{id}")
	Call<List<Accommodation>> findById(@Path("id") int id);

	@GET("accomodation/findaccomodationbycityid/{id}")
	Call<SearchAccommodation> findByCityId(@Path("id") int id);
	@GET("accomodation/findaccomodationbycityname")
	Call<SearchAccommodation> findByCityName(@Query("name") String name);

	@GET("accomodation/findaccomodationbyhostid/{id}")
	Call<List<Accommodation>> findByHostId(@Path("id") int id);
	
	@PUT("accomodation/update")
	Call<Boolean> update(@Body Accommodation accommodation);
	
	@DELETE("accomodation/delete/{id}")
	Call<Boolean> delete(@Path("id") int id);
	
	@POST("accomodation/create")
	Call<Accommodation> create(@Body Accommodation accommodation);

	@Multipart
	@POST("image/uploadImage")
	Call<String> uploadImage(@Part MultipartBody.Part file);

}
