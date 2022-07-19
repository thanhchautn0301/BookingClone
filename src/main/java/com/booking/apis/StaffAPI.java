package com.booking.apis;

import com.booking.entities.Staff;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface StaffAPI {
	@GET("staff/findByEmail/{email}")
	public Call<Staff> staffFindByEmail(@Path("email") String email);
	
	@POST("staff/create")
	public Call<Staff> create(@Body Staff staff);
}
