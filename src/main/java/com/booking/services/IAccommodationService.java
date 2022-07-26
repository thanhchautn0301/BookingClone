package com.booking.services;

import java.util.List;

import com.booking.entities.Accommodation;
import com.booking.entities.SearchAccommodation;

public interface IAccommodationService {
	public List<Accommodation> findAll();
	public List<Accommodation> findAllByHostId(int id);
	public SearchAccommodation findAllByCityId(int id);
	public boolean update(Accommodation accommodation);
	public boolean delete(int id);
	public Accommodation create(Accommodation accommodation);
}
