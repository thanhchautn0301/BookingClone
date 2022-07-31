package com.booking.services;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.CustomerAPI;
import com.booking.entities.Customer;

import retrofit2.Response;

@Service
public class CustomerService implements ICustomerService {
	
	private CustomerAPI customerAPI;
	
	public CustomerService() {
		customerAPI = APIClient.getClient().create(CustomerAPI.class);
	}
	
	@Override
	public Customer findCustomerById(int id) {
		Response<Customer> response;
		try {
			response = customerAPI.findCustomerById(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
