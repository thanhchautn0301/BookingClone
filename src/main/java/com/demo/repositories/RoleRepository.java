package com.demo.repositories;

import com.demo.entities.Role;
import com.demo.entities_api.RoleApi;
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
public interface RoleRepository extends JpaRepository<Role,Integer> {
    @Query("select new com.demo.entities_api.RoleApi(id,name,status) from Role where status =true")
    public List<RoleApi> findAllRole();

    @Query("select new com.demo.entities_api.RoleApi(id,name,status) from Role where status =true ")
    public List<RoleApi> findAllRoleSort(Sort sort);

    @Query("select new com.demo.entities_api.RoleApi(id,name,status) from Role where status =true ")
    public List<RoleApi> findAllRolePagination(Pageable pageable);

    @Query("select new com.demo.entities_api.RoleApi(id,name,status) from Role where id = :id and status = true ")
    public RoleApi findRoleById(@Param("id") int id);

}
