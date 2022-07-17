package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.demo.entities.City;
import com.demo.entities.Rate;
import com.demo.entities_api.CityApi;
import com.demo.entities_api.RateApi;
import com.demo.entities_api.RoleApi;
import com.demo.repositories.CityRepository;
import com.demo.repositories.RateRepository;
@Service
public class RateService implements IRateService {

	@Autowired
	private RateRepository rateRepository;

	@Override
	public List<RateApi> findAllRate() {
		// TODO Auto-generated method stub
		return rateRepository.findAllRate();
	}

	@Override
	public RateApi findRateById(int id) {
		// TODO Auto-generated method stub
		return rateRepository.findRateById(id);
	}

	@Override
	public boolean create(RateApi rateApi) {
		// TODO Auto-generated method stub
		Rate rate = new Rate();
		rate.setPoint(rateApi.getPoint());
		rate.setStatus(true);
		return rateRepository.save(rate) != null;
	}

	@Override
	public boolean update(RateApi rateApi) {
		// TODO Auto-generated method stub
		Rate rate = rateRepository.findById(rateApi.getId()).get();
		rate.setPoint(rateApi.getPoint());
		return rateRepository.save(rate) != null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
	    try {
	    	Rate rate = rateRepository.findById(id).get();
			rate.setStatus(false);
	    	rateRepository.save(rate);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
	}

	@Override
	public List<RateApi> findAllRateWithSort(String field) {
		// TODO Auto-generated method stub
		return rateRepository.findAllRateSort();
	}

	@Override
	public List<RateApi> findAllRatePaginate(int offset, int pagesize) {
		// TODO Auto-generated method stub
		 List<RateApi> rates = rateRepository.findAllRatePagination(PageRequest.of(offset,pagesize));
	     return rates;
	}
	
	

}
