package com.booking.services;

import java.util.List;

import com.booking.entities.RoomDetail;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.booking.entities.Room;

import okhttp3.MultipartBody;
import retrofit2.http.Multipart;

public interface IRoomService {
	public Room create(Room room);
	public List<Room> findAllByHostId(int hostId);
	public boolean update(Room room);
	public boolean delete(int id);
	public List<RoomDetail> findroombycitydaterequest(String name,String dateRange,int capacity,int childrenQuantity,int adultQuantity);
}
