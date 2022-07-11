package com.demo.repositories;

import com.demo.entities.Role;
import com.demo.entities_api.RoleApi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role,Integer> {
    @Query("select new com.demo.entities_api.RoleApi(id,name) from Role ")
    public List<RoleApi> findAllRole();

    @Query("select new com.demo.entities_api.RoleApi(id,name) from Role where id = :id ")
    public RoleApi findRoleById(@Param("id") int id);

}
