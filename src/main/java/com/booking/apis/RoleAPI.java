package com.booking.apis;

import java.util.List;

import com.booking.entities.Role;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RoleAPI {
	
	@GET("role/findall")
	public Call<List<Role>> findAll();
}
