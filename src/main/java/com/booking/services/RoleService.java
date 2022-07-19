package com.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.RoleAPI;
import com.booking.entities.Role;

import retrofit2.Response;

@Service
public class RoleService implements IRoleService {
	
	private RoleAPI roleAPI;
	
	public RoleService() {
		roleAPI = APIClient.getClient().create(RoleAPI.class);
	}
	
	@Override
	public List<Role> findAll() {
		try {
			Response<List<Role>> response = roleAPI.findAll().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
