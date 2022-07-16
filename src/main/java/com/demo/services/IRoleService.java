package com.demo.services;

import com.demo.entities_api.RoleApi;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IRoleService {
    public List<RoleApi> findAll();
    public RoleApi findByRoleId(int roleApi_id);
    public boolean create(RoleApi roleApi);
    public boolean update(RoleApi roleApi);
    public boolean delete(Integer id);
    public List<RoleApi> findAllRoleWithSort(String field);

    public List<RoleApi> findallpaginate(int offset, int no);
}
