package com.booking.apis;

import java.util.List;

import com.booking.entities.RoomType;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RoomTypeAPI {
	@GET("roomtype/findAllByHostId/{hostId}")
	Call<List<RoomType>> findAllByHostId(@Path("hostId") int hostId);
	@POST("roomtype/create")
	Call<RoomType> create(@Body RoomType roomtype);
	@PUT("roomtype/update")
	Call<Boolean> update(@Body RoomType roomtype);
	@DELETE("roomtype/delete/{id}")
	Call<Boolean> delete(@Path("id") int id);
}
