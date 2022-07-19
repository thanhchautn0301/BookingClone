package com.booking.apis;



import java.util.List;

import com.booking.entities.Category;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CategoryAPI {
	@POST("category/create")
	public Call<Category> create(@Body Category category);
	
	@PUT("category/update")
	public Call<Boolean> update(@Body Category category);
	
	@DELETE("category/delete/{id}")
	public Call<Boolean> delete(@Path("id") int id);
	
	@GET("category/findall")
	public Call<List<Category>> findall();
	
	@GET("category/findcategoryById/{id}")
	public Call<Category> findcategoryById(@Path("id") int id);
}
