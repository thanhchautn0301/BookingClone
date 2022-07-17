package com.demo.repositories;


import com.demo.entities.Rate;
import com.demo.entities_api.RateApi;

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
public interface RateRepository extends JpaRepository<Rate,Integer> {
    @Query("select new com.demo.entities_api.RateApi(id,point,status) from Rate where status = 1")
    public List<RateApi> findAllRate();

    @Query("select new com.demo.entities_api.RateApi(id,point,status) from Rate where status = 1")
    public List<RateApi> findAllRateSort();

    @Query("select new com.demo.entities_api.RateApi(id,point,status) from Rate where status = 1")
    public List<RateApi> findAllRatePagination(Pageable pageable);

    @Query("select new com.demo.entities_api.RateApi(id,point,status) from Rate where id = :id ")
    public RateApi findRateById(@Param("id") int id);

}
