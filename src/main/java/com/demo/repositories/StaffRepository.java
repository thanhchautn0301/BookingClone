package com.demo.repositories;


import com.demo.entities.Staff;
import com.demo.entities_api.StaffApi;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface StaffRepository extends CrudRepository<Staff,Integer> {
    @Query("select new com.demo.entities_api.StaffApi(id,name,phone,email,civilIdentity,password,dob,address,role.id,role.name,status,role.status) from Staff where status = true and role.name = 'ROLE_HOST'")
    public List<StaffApi> findAllStaff();

    @Query("select new com.demo.entities_api.StaffApi(id,name,phone,email,civilIdentity,password,dob,address,role.id,role.name,status,role.status) from Staff where id= :id")
    public StaffApi findStaffById(@Param("id" )int id);

    @Query("select new com.demo.entities_api.StaffApi(id,name,phone,email,civilIdentity,password,dob,address,role.id,role.name,status,role.status) from Staff where email = :email")
    public Optional<StaffApi> findStaffApiByEmail(@Param("email" )String email);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Staff s set s.status = true where s.id = :id")
    public int activateAccount(@Param("id" ) int id);

    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("update Staff s set s.password = :password where s.id = :id")
    public int resetPassword(@Param("id" ) int id, @Param("password") String password);
}
