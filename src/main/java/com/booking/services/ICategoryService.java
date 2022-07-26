package com.booking.services;

import java.util.List;

import com.booking.entities.AccommodationOfCategory;
import com.booking.entities.Category;

public interface ICategoryService {
	public Category create(String name);
	public List<Category> findAll();
	public boolean update(Category Category);
	public boolean delete(int id);
	public List<AccommodationOfCategory> findAllAccommodationOfCategory();
}
