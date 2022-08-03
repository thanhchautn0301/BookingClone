package com.demo.services;

import java.util.List;

import com.demo.entities_api.AccommodationOfCityApi;
import com.demo.entities_api.CityApi;


public interface ICityService {
	    public List<CityApi> findAllCity();
	    public CityApi findCityById(int id);
	    public CityApi create(CityApi city);
	    public boolean update(CityApi city);
	    public boolean delete(int id);
	    public List<CityApi> findAllCityWithSort(String field);

	    public List<CityApi> findAllPaginate(int offset, int no);
	    public List<AccommodationOfCityApi> findAllAccommodationOfCity();
	    public List<AccommodationOfCityApi> findAllAccommodationOfCity2(String keyword);
	    public List<CityApi> findHomeCity();
}
