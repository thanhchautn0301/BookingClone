package com.booking.services;

import java.util.List;

import com.booking.entities.Category;
import okhttp3.MultipartBody;

public interface ICategoryService {
	public Category create(String name,String image);
	public List<Category> findAll();
	public boolean update(Category Category);
	public boolean delete(int id);

	public String uploadFile(MultipartBody.Part file) ;
}
