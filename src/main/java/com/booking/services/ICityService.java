package com.booking.services;

import java.util.List;

import com.booking.entities.City;

public interface ICityService {
	public City create(String name);
	public List<City> findAll();
	public boolean update(City city);
	public boolean delete(int id);
}
