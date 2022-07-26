package com.booking.apis;

import com.booking.entities.AuthRequest;
import com.booking.entities.AuthResponse;
import com.booking.entities.Staff;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface StaffAPI<activateaccoun> {
	@GET("staff/findByEmail/{email}")
	public Call<Staff> staffFindByEmail(@Path("email") String email);

	@GET("staff/findall")
	public Call<List<Staff>> findAllStaff();
	
	@POST("staff/create")
	public Call<Staff> create(@Body Staff staff);

	@POST("staff/login")
	public Call<AuthResponse> login(@Body AuthRequest authRequest);

	@GET("staff/activateaccount")
	public Call<Integer> activate(@Query("id") int id);

	@GET("staff/resetpw")
	public Call<Integer> resetpw(@Query("id") int id, @Query("password") String password);

	@POST("staff/forgotpw")
	public Call<AuthResponse> forgotPw(@Query("email") String email);
}
