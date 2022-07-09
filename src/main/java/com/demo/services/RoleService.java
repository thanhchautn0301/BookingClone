package com.demo.services;

import com.demo.entities_api.RoleApi;
import com.demo.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
}
