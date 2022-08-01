package com.demo.repositories;

import com.demo.entities.Customer;
import com.demo.entities.Role;
import com.demo.entities_api.CustomerApi;
import com.demo.entities_api.StaffApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where status =true")
    public List<CustomerApi> findAllCustomer();

    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where status =true")
    public List<CustomerApi> findAllCustomerSort(Sort sort);

    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where status =true")
    public List<CustomerApi> findAllCustomerPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where id=:id")
    public CustomerApi findCustomerById(@Param("id") int id);

    @Query("select new com.demo.entities_api.CustomerApi(id, name, email, phone, dob, password, civilIdentity, status) from Customer where email = :email")
    public Optional<CustomerApi> findCustomerApiByEmail(@Param("email" )String email);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Customer c set c.status = true where c.id = :id")
    public int activateAccount(@Param("id" ) int id);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Customer c set c.password = :password where c.id = :id")
    public int resetPassword(@Param("id" ) int id, @Param("password") String password);

}
