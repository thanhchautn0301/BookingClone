package com.demo.repositories;

import com.demo.entities.Category;
import com.demo.entities_api.AccommodationOfCategoryApi;
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

    @Query("select new com.demo.entities_api.AccommodationOfCategoryApi(c.id,c.name,c.status, count(a.id), c.image) " + 
        "from Accomodation as a, Category as c where c.status = true and a.status = true and a.category.id = c.id " + 
        "group by c.id")
    public List<AccommodationOfCategoryApi> findAllCategoryWithAccommodation();
}
