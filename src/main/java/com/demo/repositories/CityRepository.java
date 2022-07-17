package com.demo.repositories;

import com.demo.entities.City;
import com.demo.entities_api.CityApi;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    @Query("select new com.demo.entities_api.CityApi(id,name,status) from City where status = 1")
    public List<CityApi> findAllCity();

    @Query("select new com.demo.entities_api.CityApi(id,name,status) from City where status = 1")
    public List<CityApi> findAllCitySort(Sort sort);

    @Query("select new com.demo.entities_api.CityApi(id,name,status) from City where status = 1 ")
    public List<CityApi> findAllCityPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.CityApi(id,name,status) from City where id = :id ")
    public CityApi findCityById(@Param("id") int id);

}
