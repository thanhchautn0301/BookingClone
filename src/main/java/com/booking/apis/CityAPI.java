package com.booking.apis;



import java.util.List;

import com.booking.entities.City;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

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
}
