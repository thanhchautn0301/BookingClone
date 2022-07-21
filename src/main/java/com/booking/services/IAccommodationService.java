package com.booking.services;

import java.util.List;

import com.booking.entities.Accommodation;

public interface IAccommodationService {
	public List<Accommodation> findAll();
	public List<Accommodation> findAllByHostId(int id);
	public boolean update(Accommodation accommodation);
	public boolean delete(int id);
	public Accommodation create(Accommodation accommodation);
}
