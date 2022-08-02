package com.demo.services;

import java.util.List;

import com.demo.entities_api.CityApi;
import com.demo.entities_api.CustomerApi;


public interface ICustomerService {
	    public List<CustomerApi> findAllCustomer();
	    public CustomerApi findCustomerById(int id);
		public CustomerApi findByEmail(String email);
	    public boolean create(CustomerApi city);
	    public boolean update(CustomerApi city);
	    public boolean delete(int id);
	    public List<CustomerApi> findAllCustomerWithSort(String field);

	    public List<CustomerApi> findAllPaginate(int offset, int no);
		// kich hoat tai khoan xac nhan qua email
		public int activateAccount(int id);
		public int resetPassword(int id, String password);
		public int resetEmail(int id, String email);
		public int resetPhone(int id, String phone);
}
