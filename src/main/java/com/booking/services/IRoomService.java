package com.booking.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.booking.entities.Room;

import okhttp3.MultipartBody;
import retrofit2.http.Multipart;

public interface IRoomService {
	public Room create(Room room);
	public List<Room> findAllByHostId(int hostId);
	public boolean update(Room room);
	public boolean delete(int id);
	public Room findRoomById(int id);
	public double findPriceByRoomId(int id);
}
