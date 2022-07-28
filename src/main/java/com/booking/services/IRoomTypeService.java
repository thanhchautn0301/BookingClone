package com.booking.services;

import java.util.List;

import com.booking.entities.RoomType;

public interface IRoomTypeService {
	public List<RoomType> findAllByHostId(int id);
	public RoomType create(RoomType roomType);
	public boolean update(RoomType roomType);
	public boolean delete(int id);
}
