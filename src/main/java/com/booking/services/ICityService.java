package com.booking.services;

import java.util.List;

import com.booking.entities.AccommodationOfCity;
import com.booking.entities.City;

public interface ICityService {
	public boolean create(String name);
	public List<City> findAll();
	public boolean update(City city);
	public boolean delete(int id);
	public List<AccommodationOfCity> findAllAccommodationOfCity();
}
