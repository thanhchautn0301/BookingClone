package com.booking.services;

import java.util.List;

import com.booking.entities.AccommodationOfCity;
import com.booking.entities.City;
import okhttp3.MultipartBody;

public interface ICityService {
	public City create(String name, String image, boolean isHome);
	public List<City> findAll();
	public boolean update(City city);
	public boolean delete(int id);

	public String uploadFile(MultipartBody.Part file) ;
	public List<AccommodationOfCity> findAllAccommodationOfCity();
	public List<City> findAllWithHome();
	public List<AccommodationOfCity> findHome();
}
