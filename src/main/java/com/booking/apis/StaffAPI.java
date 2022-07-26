package com.booking.apis;

import com.booking.entities.AuthRequest;
import com.booking.entities.AuthResponse;
import com.booking.entities.Staff;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

public interface StaffAPI {
	@GET("staff/findByEmail/{email}")
	public Call<Staff> staffFindByEmail(@Path("email") String email);

	@GET("staff/findall")
	public Call<List<Staff>> findAllStaff();
	
	@POST("staff/create")
	public Call<Staff> create(@Body Staff staff);

	@POST("staff/login")
	public Call<AuthResponse> login(@Body AuthRequest authRequest);
}
