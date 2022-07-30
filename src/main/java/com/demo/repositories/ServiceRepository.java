package com.demo.repositories;

import com.demo.entities.Service;
import com.demo.entities_api.ServiceApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    @Query("select new com.demo.entities_api.ServiceApi(id, accomodation.id, name, price, iconCanvas, status) from Service where status =true")
    public List<ServiceApi> findAllService();

    @Query("select new com.demo.entities_api.ServiceApi(id, accomodation.id, name, price, iconCanvas, status) from Service where status =true")
    public List<ServiceApi> findAllServiceSort(Sort sort);

    @Query("select new com.demo.entities_api.ServiceApi(id, accomodation.id, name, price, iconCanvas, status) from Service where status =true")
    public List<ServiceApi> findAllServicePagination(Pageable pageable);

    @Query("select new com.demo.entities_api.ServiceApi(id, accomodation.id, name, price, iconCanvas, status) from Service where status =true and id =:id")
    public ServiceApi findServiceById(@Param("id") int id);

    @Query("select new com.demo.entities_api.ServiceApi(id, accomodation.id, name, price, iconCanvas, status) from Service where status =true and accomodation.id =:id")
    public List<ServiceApi> findServiceByAccommodationId(@Param("id") int id);
}
