package com.booking.services;

import com.booking.entities.AuthRequest;
import com.booking.entities.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.StaffAPI;
import com.booking.entities.Staff;

import retrofit2.Response;

import java.util.List;

@Service
public class StaffService implements IStaffService{
	
	private StaffAPI staffAPI;
	
	public StaffService() {
		staffAPI = APIClient.getClient().create(StaffAPI.class);
	}
	
	@Override
	public Staff create(Staff staff) {
		try {
			Response<Staff> response = staffAPI.create(staff).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public AuthResponse login(AuthRequest auth) {
		try {
			Response<AuthResponse> response = staffAPI.login(auth).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Staff> findAll() {
		try {
			Response<List<Staff>> response = staffAPI.findAllStaff().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
