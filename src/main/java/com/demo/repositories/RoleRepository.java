package com.demo.repositories;

import com.demo.entities.Role;
import com.demo.entities_api.RoleApi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<Role,Integer> {
    @Query("select new com.demo.entities_api.RoleApi(id,name) from Role ")
    public List<RoleApi> findAllRole();
}
