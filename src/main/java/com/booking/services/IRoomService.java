package com.booking.services;

import java.util.List;

import com.booking.entities.Room;

public interface IRoomService {
	public Room create(Room room);
	public List<Room> findAllByHostId(int hostId);
	public boolean update(Room room);
	public boolean delete(int id);
}
