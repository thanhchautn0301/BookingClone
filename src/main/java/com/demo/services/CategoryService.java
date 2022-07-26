package com.demo.services;

import com.demo.entities.Category;
import com.demo.entities_api.AccommodationOfCategoryApi;
import com.demo.entities_api.CategoryApi;
import com.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<CategoryApi> findall() {
        return categoryRepository.findAllCategory();
    }

    @Override
    public CategoryApi findCategoryById(int categoryId) {
        return categoryRepository.findCategoryById(categoryId);
    }

    @Override
    public CategoryApi create(CategoryApi categoryApi) {
        try {
        	Category category = new Category();
            category.setImage(categoryApi.getImage());
        	category.setName(categoryApi.getName());
        	category.setStatus(categoryApi.isStatus());
        	
        	Category newCategory = categoryRepository.save(category);
        	categoryApi.setId(newCategory.getId());
            return categoryApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(CategoryApi categoryApi) {
       try {
           Category category = categoryRepository.findById(categoryApi.getId()).get();

           category.setName(categoryApi.getName());
           category.setStatus(categoryApi.isStatus());

           return categoryRepository.save(category)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int categoryId) {
        try {
        	Category category = categoryRepository.findById(categoryId).get();

            category.setStatus(false);

            return categoryRepository.save(category)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CategoryApi> findallcategorywithsort(String field) {
        return categoryRepository.findAllCategorySort(Sort.by(field));
    }

    @Override
    public List<CategoryApi> findallcategorypaginate(int offset, int no) {
        return categoryRepository.findAllCategoryPagination(PageRequest.of(offset,no));
    }

    @Override
    public List<AccommodationOfCategoryApi> findAllAccommodationOfCategory() {
        return categoryRepository.findAllCategoryWithAccommodation();
    }
}
