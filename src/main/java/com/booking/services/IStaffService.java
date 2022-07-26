package com.booking.services;

import com.booking.entities.AuthRequest;
import com.booking.entities.AuthResponse;
import com.booking.entities.Staff;

import java.util.List;

public interface IStaffService {
	public Staff create(Staff staff);

	public AuthResponse login(AuthRequest auth);

	public List<Staff> findAll();
}
