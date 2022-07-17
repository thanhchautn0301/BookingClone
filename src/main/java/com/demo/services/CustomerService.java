package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.demo.entities.City;
import com.demo.entities.Customer;
import com.demo.entities_api.CityApi;
import com.demo.entities_api.CustomerApi;
import com.demo.helper.Encrypt;
import com.demo.repositories.CityRepository;
import com.demo.repositories.CustomerRepository;
@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<CustomerApi> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAllCustomer();
	}

	@Override
	public CustomerApi findCityById(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerById(id);
	}

	@Override
	public boolean create(CustomerApi customerApi) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName(customerApi.getName());
		customer.setEmail(customerApi.getEmail());
		customer.setPhone(customerApi.getPhone()); 
		customer.setDob(customerApi.getDob());
		customer.setPassword(Encrypt.Md5(customerApi.getPassword()));
		customer.setCivilIdentity(customerApi.getCivilIdentity());
		customer.setStatus(customerApi.isStatus());
		return customerRepository.save(customer) != null;
	}

	@Override
	public boolean update(CustomerApi customerApi) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(customerApi.getId()).get();
		customer.setName(customerApi.getName());
		customer.setEmail(customerApi.getEmail());
		customer.setPhone(customerApi.getPhone()); 
		customer.setDob(customerApi.getDob());
		customer.setPassword(Encrypt.Md5(customerApi.getPassword()));
		customer.setCivilIdentity(customerApi.getCivilIdentity());
		customer.setStatus(customerApi.isStatus());
		return customerRepository.save(customer) != null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		 try {
			 Customer customer = customerRepository.findById(id).get();
			 customer.setStatus(false);
			 customerRepository.save(customer);
	            return true;
	        } catch(Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	}

	@Override
	public List<CustomerApi> findAllCustomerWithSort(String field) {
		// TODO Auto-generated method stub
		return  customerRepository.findAllCustomerSort(Sort.by(field));
	}

	@Override
	public List<CustomerApi> findAllPaginate(int offset, int pageSize) {
		// TODO Auto-generated method stub
		return customerRepository.findAllCustomerPagination(PageRequest.of(offset,pageSize));
	}

	
	

}
