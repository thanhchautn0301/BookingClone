package com.booking.apis;

import com.booking.entities.Image;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ImageAPI {
	
	@POST("image/create")
	public Call<Image> create(@Body Image image);
	
	@Multipart
    @POST("image/uploadImage")
    Call<String> uploadImage(@Part MultipartBody.Part file);
}
