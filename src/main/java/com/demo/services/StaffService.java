package com.demo.services;

import com.demo.entities.Role;
import com.demo.entities.Staff;
import com.demo.entities_api.RoleApi;
import com.demo.entities_api.StaffApi;
import com.demo.repositories.RoleRepository;
import com.demo.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService{
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<StaffApi> findAll() {
        return staffRepository.findAllStaff();
    }

    @Override
    public StaffApi findStaffById(int id) {
        return staffRepository.findStaffById(id);
    }

    @Override
    public StaffApi create(StaffApi staffApi) {
        try {
            // Tao moi 1 staff luu vao db
            Staff staff = new Staff();
            // Tao moi 1 role de luu cho staff
            Role role = roleRepository.findById(staffApi.getRole_id()).get();

            // Bat dau mang nhung value cua staffApi gan cho staff
            staff.setName(staffApi.getName());
            staff.setPhone(staffApi.getPhone());
            staff.setEmail(staffApi.getEmail());
            staff.setCivilIdentity(staffApi.getCivilIdentity());
            staff.setPassword(staffApi.getPassword());
            staff.setDob(staffApi.getDob());
            staff.setAddress(staffApi.getAddress());
            staff.setStatus(true);

            // Gan role cho staff
            staff.setRole(role);

            // Thuc hien luu vao db
            // Tao 1 bien staff hung lai ket qua obj tra ve tu repo va gan cho staffapi vua tao moi
            Staff newStaff = staffRepository.save(staff);
            staffApi.setId(newStaff.getId());
            return staffApi;
        } catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(StaffApi staffApi) {
        try {
            // Tim ve staff can cap nhat
            Staff staff = staffRepository.findById(staffApi.getId()).get();

            // Bat dau mang nhung value cua staffApi gan cho staff
            staff.setName(staffApi.getName());
            staff.setPhone(staffApi.getPhone());
            staff.setEmail(staffApi.getEmail());
            staff.setCivilIdentity(staffApi.getCivilIdentity());
            staff.setPassword(staffApi.getPassword());
            staff.setDob(staffApi.getDob());
            staff.setAddress(staffApi.getAddress());
            staff.setStatus(staffApi.getStatus());

            // Cap nhat role cho staff
            Role role = roleRepository.findById(staffApi.getRole_id()).get();

            // Cap nhat lai role moi cua staff
            staff.setRole(role);

            // Thuc hien luu cap nhat vao db
            staffRepository.save(staff);
            return true;
        } catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int staffApi_id) {
        try {
            staffRepository.deleteById(staffApi_id);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
