package com.demo.services;

import com.demo.entities.Role;
import com.demo.entities_api.RoleApi;
import com.demo.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService implements IRoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<RoleApi> findall() {
        return roleRepository.findAllRole();
    }

    @Override
    public RoleApi findByRoleId(int roleApi_id) {
        return roleRepository.findRoleById(roleApi_id);
    }

    @Override
    public boolean create(RoleApi roleApi) {
        // Tao moi 1 role de luu xuong csdl
        Role role = new Role();
        role.setName(roleApi.getName());
        role.setStatus(true);
        return roleRepository.save(role) != null;
    }

    @Override
    public boolean update(RoleApi roleApi) {
        Role role = roleRepository.findById(roleApi.getId()).get();
        role.setName(roleApi.getName());
        role.setStatus(roleApi.getStatus());
        return roleRepository.save(role) != null;
    }

    @Override
    public boolean delete(Integer roleApi_id) {
        try {
            roleRepository.deleteById(roleApi_id);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<RoleApi> findallrolewithsort(String field) {
        return roleRepository.findAllRoleSort(Sort.by(field));
    }

    @Override
    public List<RoleApi> findallpaginate(int offset, int pagesize) {
        List<RoleApi> roles = roleRepository.findAllRolePagination(PageRequest.of(offset,pagesize));
        return roles;
    }
}
