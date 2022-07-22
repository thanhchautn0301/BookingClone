package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.City;
import com.demo.entities_api.CityApi;
import com.demo.repositories.CityRepository;

@Service
public class CityService implements ICityService{
	
	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public CityApi create(CityApi cityApi) {
		try {
			City city = new City();
			city.setName(cityApi.getName());
			city.setStatus(true);
			cityApi.setId(cityRepository.save(city).getId());
			cityApi.setStatus(true);
			return cityApi;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<CityApi> findAll() {
		return cityRepository.findAllCity();
	}

	@Override
	public boolean update(CityApi cityApi) {
		try {
			City city = cityRepository.findById(cityApi.getId()).get();
			city.setName(cityApi.getName());
			return cityRepository.save(city)!=null;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public CityApi findById(int id) {
		return cityRepository.findCityById(id);
	}

	@Override
	public boolean delete(int id) {
		try {
			City city = cityRepository.findById(id).get();
			city.setStatus(false);
			return cityRepository.save(city)!=null;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
