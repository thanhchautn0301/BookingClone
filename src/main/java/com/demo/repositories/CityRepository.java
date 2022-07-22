package com.demo.repositories;

import com.demo.entities.City;
import com.demo.entities_api.CityApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	@Query("select new com.demo.entities_api.CityApi(id,name,status) from City where status = true")
	public List<CityApi> findAllCity();
	
	@Query("select new com.demo.entities_api.CityApi(id,name,status) from City where status = true and id = :id")
	public CityApi findCityById(int id);
}
