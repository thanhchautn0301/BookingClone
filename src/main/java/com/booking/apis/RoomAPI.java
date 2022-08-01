package com.booking.apis;

import java.util.List;

import com.booking.entities.RoomDetail;
import com.booking.entities.RoomHome;
import org.springframework.web.multipart.MultipartFile;

import com.booking.entities.Room;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface RoomAPI {
	@POST("room/create")
	Call<Room> create(@Body Room room);
	
	@GET("room/findAllByHostId/{hostId}")
	Call<List<Room>> findAllByHostId(@Path("hostId") int hostId);
	
	@PUT("room/update")
	Call<Boolean> update(@Body Room Room);
	
	@DELETE("room/delete/{id}")
	Call<Boolean> delete(@Path("id") int id);


	@GET("room/findroombycitydaterequest")
	Call<List<RoomHome>> findRoomByCityDate(@Query("name") String name, @Query("daterange") String dateRange, @Query("category") String category);
	
	@Multipart
    @POST("room/uploadImage")
    Call<Boolean> uploadImage(@Part MultipartBody.Part file);
	
	@GET("room/findroombyid/{id}")
	Call<Room> findRoomById(@Path("id") int id);
	
	@GET("room/findprice/{id}")
	Call<Double> findPriceByRoomId(@Path("id") int id);

	
}