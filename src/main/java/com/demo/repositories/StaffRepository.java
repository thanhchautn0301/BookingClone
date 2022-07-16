package com.demo.repositories;


import com.demo.entities.Staff;
import com.demo.entities_api.StaffApi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffRepository extends CrudRepository<Staff,Integer> {
    @Query("select new com.demo.entities_api.StaffApi(id,name,phone,email,civilIdentity,password,dob,address,role.id,role.name,status,role.status) from Staff where status = true ")
    public List<StaffApi> findAllStaff();

    @Query("select new com.demo.entities_api.StaffApi(id,name,phone,email,civilIdentity,password,dob,address,role.id,role.name,status,role.status) from Staff where id= :id and status = true")
    public StaffApi findStaffById(@Param("id" )int id);
}
