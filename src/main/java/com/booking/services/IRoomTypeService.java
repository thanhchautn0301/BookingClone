package com.booking.services;

import java.util.List;

import com.booking.entities.RoomType;

public interface IRoomTypeService {
	public List<RoomType> findAllByHostId(int id);
}
