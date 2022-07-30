package com.booking.apis;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.booking.entities.Room;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface RoomAPI {
	@POST("room/create")
	Call<Room> create(@Body Room room);
	
	@GET("room/findAllByHostId/{hostId}")
	Call<List<Room>> findAllByHostId(@Path("hostId") int hostId);
	
	@PUT("room/update")
	Call<Boolean> update(@Body Room Room);
	
	@DELETE("room/delete/{id}")
	Call<Boolean> delete(@Path("id") int id);
	
	@Multipart
    @POST("room/uploadImage")
    Call<Boolean> uploadImage(@Part MultipartBody.Part file);
	
	@GET("room/findroombyid/{id}")
	Call<Room> findRoomById(@Path("id") int id);
	
	@GET("room/findprice/{id}")
	Call<Double> findPriceByRoomId(@Path("id") int id);

	
}