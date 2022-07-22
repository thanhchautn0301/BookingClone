package com.booking.apis;

import java.util.List;

import com.booking.entities.Room;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
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
}
