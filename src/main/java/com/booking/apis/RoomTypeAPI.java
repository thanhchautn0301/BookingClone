package com.booking.apis;

import java.util.List;

import com.booking.entities.RoomType;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RoomTypeAPI {
	@GET("roomtype/findAllByHostId/{hostId}")
	Call<List<RoomType>> findAllByHostId(@Path("hostId") int hostId);
}
