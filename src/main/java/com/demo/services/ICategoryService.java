package com.demo.services;

import com.demo.entities_api.CategoryApi;

import java.util.List;

public interface ICategoryService {
    public List<CategoryApi> findall();
    public CategoryApi findCategoryById(int categoryId);
    public CategoryApi create(CategoryApi categoryId);
    public boolean update(CategoryApi categoryId);
    public boolean delete(int categoryId);
    public List<CategoryApi> findallcategorywithsort(String field);
    public List<CategoryApi> findallcategorypaginate(int offset, int no);
}
