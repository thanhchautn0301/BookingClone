package com.booking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.StaffAPI;
import com.booking.entities.Staff;

import retrofit2.Response;

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
	
	
}
