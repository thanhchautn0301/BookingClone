package com.demo.repositories;

import com.demo.entities.Role;
import com.demo.entities_api.CustomerApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Role,Integer> {
    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where status =true")
    public List<CustomerApi> findAllCustomer();

    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where status =true")
    public List<CustomerApi> findAllCustomerSort(Sort sort);

    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where status =true")
    public List<CustomerApi> findAllCustomerPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where status =true and id=:id")
    public CustomerApi findCustomerById(@Param("id") int id);

}
