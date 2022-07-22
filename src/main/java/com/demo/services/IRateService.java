package com.demo.services;

import java.util.List;

import com.demo.entities_api.CityApi;
import com.demo.entities_api.RateApi;


public interface IRateService {
	    public List<RateApi> findAllRate();
	    public RateApi findRateById(int id);
	    public boolean create(RateApi city);
	    public boolean update(RateApi city);
	    public boolean delete(int id);
	    public List<RateApi> findAllRateWithSort(String field);

	    public List<RateApi> findAllRatePaginate(int offset, int no);
}
