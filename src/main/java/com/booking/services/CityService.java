package com.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.CityAPI;
import com.booking.entities.AccommodationOfCity;
import com.booking.entities.City;

import retrofit2.Response;

@Service
public class CityService implements ICityService {
	
	private CityAPI cityAPI;
	
	
	
	public CityService() {
		cityAPI = APIClient.getClient().create(CityAPI.class);
	}



	@Override
	public boolean create(String name) {
		City city = new City();
		city.setName(name);
		try {
			Response<Boolean> response = cityAPI.create(city).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public List<City> findAll() {
		try {
			Response<List<City>> response = cityAPI.findall().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}



	@Override
	public boolean update(City city) {
		try {
			System.out.println("City id : " + city.getId() + "\n Name: " + city.getName());
			Response<Boolean> response = cityAPI.update(city).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean delete(int id) {
		try {
			Response<Boolean> response = cityAPI.delete(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public List<AccommodationOfCity> findAllAccommodationOfCity() {
		try {
			Response<List<AccommodationOfCity>> response = cityAPI.findAllAccommodationOfCity().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
