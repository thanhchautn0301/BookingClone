package com.demo.repositories;

import com.demo.entities.Category;
import com.demo.entities_api.CategoryApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("select new com.demo.entities_api.CategoryApi(id,name, status, image) from Category where status =true")
    public List<CategoryApi> findAllCategory();

    @Query("select new com.demo.entities_api.CategoryApi(id,name, status, image) from Category where status =true")
    public List<CategoryApi> findAllCategorySort(Sort sort);

    @Query("select new com.demo.entities_api.CategoryApi(id,name, status, image) from Category where status =true")
    public List<CategoryApi> findAllCategoryPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.CategoryApi(id,name, status, image) from Category where status =true and id =:id")
    public CategoryApi findCategoryById(@Param("id") int id);
}
