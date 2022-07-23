package com.demo.services;

import java.util.List;

import com.demo.entities_api.CityApi;
import com.demo.entities_api.CustomerApi;


public interface ICustomerService {
	    public List<CustomerApi> findAllCustomer();
	    public CustomerApi findCityById(int id);
	    public boolean create(CustomerApi city);
	    public boolean update(CustomerApi city);
	    public boolean delete(int id);
	    public List<CustomerApi> findAllCustomerWithSort(String field);

	    public List<CustomerApi> findAllPaginate(int offset, int no);
}
