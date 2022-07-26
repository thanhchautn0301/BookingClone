package com.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.CategoryAPI;
import com.booking.entities.AccommodationOfCategory;
import com.booking.entities.Category;

import retrofit2.Response;

@Service
public class CategoryService implements ICategoryService {
	
	private CategoryAPI categoryAPI;
	
	public CategoryService() {
		categoryAPI = APIClient.getClient().create(CategoryAPI.class);
	}
	
	@Override
	public Category create(String name) {
		try {
			Category category = new Category();
			category.setName(name);
			category.setStatus(true);
			Response<Category> response = categoryAPI.create(category).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Category> findAll() {
		try {
			Response<List<Category>> response = categoryAPI.findall().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean update(Category category) {
		try {
			Response<Boolean> response = categoryAPI.update(category).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		try {
			Response<Boolean> response = categoryAPI.delete(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<AccommodationOfCategory> findAllAccommodationOfCategory() {
		try {
			Response<List<AccommodationOfCategory>> response = categoryAPI.findAllAccommodationOfCategory().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
