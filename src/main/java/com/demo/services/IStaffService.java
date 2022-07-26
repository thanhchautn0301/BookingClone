package com.demo.services;

import com.demo.entities_api.StaffApi;

import java.util.List;
import java.util.Optional;

public interface IStaffService {
    public List<StaffApi> findAll();
    public StaffApi findStaffById(int id);
    public Optional<StaffApi> findStaffApiByEmail(String email);
    public StaffApi create(StaffApi staffApi);
    public boolean update(StaffApi staffApi);
    public boolean delete(int staffApi_id);
    // kich hoat tai khoan xac nhan qua email
    public int activateAccount(int id);
    // dat lai mat khau xac nhan qua email
    public int resetPassword(int id, String password);
}
