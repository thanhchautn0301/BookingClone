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
	}
	
	@Override
	public Staff create(Staff staff) {
		try {
			staffAPI = APIClient.getClient().create(StaffAPI.class);
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
			staffAPI = APIClient.getClient().create(StaffAPI.class);
			Response<AuthResponse> response = staffAPI.login(auth).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer activate(int id) {
		try {
			staffAPI = APIClient.getClient().create(StaffAPI.class);
			Response<Integer> response = staffAPI.activate(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public Integer resetpw(int id, String password) {
		try {
			staffAPI = APIClient.getClient().create(StaffAPI.class);
			Response<Integer> response = staffAPI.resetpw(id,password).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public List<Staff> findAll() {
		try {
			staffAPI = APIClient.getClient().create(StaffAPI.class);
			Response<List<Staff>> response = staffAPI.findAllStaff().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public AuthResponse forgotPw(String email) {
		try {
			staffAPI = APIClient.getClient().create(StaffAPI.class);
			Response<AuthResponse> response = staffAPI.forgotPw(email).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
