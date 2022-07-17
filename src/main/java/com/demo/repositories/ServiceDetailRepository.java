package com.demo.repositories;

import com.demo.entities.ServiceDetail;
import com.demo.entities_api.ServiceDetailApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDetailRepository extends JpaRepository<ServiceDetail, Integer> {
    @Query("select new com.demo.entities_api.ServiceDetailApi(id, bookingDetail.id, service.id, quantity, description, status) from ServiceDetail where status =true")
    public List<ServiceDetailApi> findAllServiceDetail();

    @Query("select new com.demo.entities_api.ServiceDetailApi(id, bookingDetail.id, service.id, quantity, description, status) from ServiceDetail where status =true")
    public List<ServiceDetailApi> findAllServiceDetailSort(Sort sort);

    @Query("select new com.demo.entities_api.ServiceDetailApi(id, bookingDetail.id, service.id, quantity, description, status) from ServiceDetail where status =true")
    public List<ServiceDetailApi> findAllServiceDetailPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.ServiceDetailApi(id, bookingDetail.id, service.id, quantity, description, status) from ServiceDetail where status =true and id =:id")
    public ServiceDetailApi findServiceDetailById(@Param("id") int id);
}
