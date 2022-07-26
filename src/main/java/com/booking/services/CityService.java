package com.booking.services;

import java.util.List;

import okhttp3.MultipartBody;
import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.CityAPI;
import com.booking.entities.City;

import retrofit2.Response;

@Service
public class CityService implements ICityService {
	
	private CityAPI cityAPI;
	
	
	
	public CityService() {
		cityAPI = APIClient.getClient().create(CityAPI.class);
	}



	@Override
	public City create(String name, String image) {
		City city = new City();
		city.setImage(image);
		city.setName(name);
		city.setStatus(true);
		try {
			Response<City> response = cityAPI.create(city).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
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
	public String uploadFile(MultipartBody.Part file) {
		try {
			Response<String> response = cityAPI.uploadImage(file).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
