package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.demo.entities.Customer;
import com.demo.entities_api.CustomerApi;
import com.demo.helper.Encrypt;
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
	public CustomerApi findCustomerById(int id) {
		// TODO Auto-generated method stub
			return customerRepository.findCustomerById(id);
	}

	@Override
	public CustomerApi findByEmail(String email) {
		return customerRepository.findCustomerApiByEmail(email).get();
	}

	@Override
	public boolean create(CustomerApi customerApi) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName(null);
		customer.setEmail(customerApi.getEmail());
		customer.setPhone(null);
		customer.setDob(null);
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPw = passwordEncoder.encode(customerApi.getPassword());
		customer.setPassword(hashedPw);
		customer.setCivilIdentity(null);
		customer.setStatus(false);
		return customerRepository.save(customer) != null;
	}

	@Override
	public int activateAccount(int id) {
		try {
			return customerRepository.activateAccount(id);
		} catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public boolean update(CustomerApi customerApi) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.findById(customerApi.getId()).get();
		customer.setName(customerApi.getName());
		customer.setEmail(customerApi.getEmail());
		customer.setPhone(customerApi.getPhone()); 
		customer.setDob(customerApi.getDob());
		customer.setPassword(Encrypt.BcryptPass(customerApi.getPassword()));
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

	@Override
	public int resetPassword(int id, String password) {
		try {
			return customerRepository.resetPassword(id, Encrypt.BcryptPass(password));
		} catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

}
