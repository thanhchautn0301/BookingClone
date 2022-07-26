package com.booking.apis;



import java.util.List;

import com.booking.entities.Category;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

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

	@Multipart
	@POST("image/uploadImage")
	Call<String> uploadImage(@Part MultipartBody.Part file);
}
