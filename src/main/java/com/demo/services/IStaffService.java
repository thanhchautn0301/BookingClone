package com.demo.services;

import com.demo.entities_api.StaffApi;

import java.util.List;

public interface IStaffService {
    public List<StaffApi> findAll();
    public StaffApi findStaffById(int id);
    public StaffApi create(StaffApi staffApi);
    public boolean update(StaffApi staffApi);
    public boolean delete(int staffApi_id);
    public StaffApi findStaffByEmail(String email);
}
