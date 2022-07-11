package com.demo.services;

import com.demo.entities.Role;
import com.demo.entities_api.RoleApi;

import java.util.List;

public interface IRoleService {
    public List<RoleApi> findall();
    public RoleApi findByRoleId(int roleApi_id);
    public boolean create(RoleApi roleApi);
    public boolean update(RoleApi roleApi);
    public boolean delete(Integer id);
}
