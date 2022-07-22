package com.demo.services;

import java.util.List;

import com.demo.entities.City;
import com.demo.entities_api.CityApi;

public interface ICityService {
	public CityApi create(CityApi cityApi);
	public List<CityApi> findAll();
	public boolean update(CityApi cityApi);
	public boolean delete(int id);
	public CityApi findById(int id);
}
