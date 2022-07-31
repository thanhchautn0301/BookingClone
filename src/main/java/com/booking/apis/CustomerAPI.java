package com.booking.apis;

import com.booking.entities.Customer;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CustomerAPI {
	@GET("customer/findcustomerbyid/{id}")
	Call<Customer> findCustomerById(@Path("id") int id);
}
