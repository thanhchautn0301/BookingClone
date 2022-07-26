package com.booking.services;

import com.booking.entities.AuthRequest;
import com.booking.entities.AuthResponse;
import com.booking.entities.Staff;

import java.util.List;

public interface IStaffService {
	public Staff create(Staff staff);

	public AuthResponse login(AuthRequest auth);

	public Integer activate(int id);

	public Integer resetpw(int id, String password);

	public List<Staff> findAll();

	public AuthResponse forgotPw(String email);
}
