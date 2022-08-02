package com.booking.apis;



import java.util.List;

import com.booking.entities.AccommodationOfCity;
import com.booking.entities.City;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface CityAPI {
	@POST("city/create")
	public Call<City> create(@Body City city);
	
	@PUT("city/update")
	public Call<Boolean> update(@Body City city);
	
	@DELETE("city/delete/{id}")
	public Call<Boolean> delete(@Path("id") int id);
	
	@GET("city/findall")
	public Call<List<City>> findall();
	
	@GET("city/findCityById/{id}")
	public Call<City> findCityById(@Path("id") int id);

	@Multipart
	@POST("image/uploadImage")
	Call<String> uploadImage(@Part MultipartBody.Part file);

	@GET("city/findAllAccommodationOfCity")
	public Call<List<AccommodationOfCity>> findAllAccommodationOfCity();

	@GET("city/findallwithhome")
	public Call<List<City>> findallWithHome();

	@GET("city/findHome")
	public Call<List<AccommodationOfCity>> findHome();
}
