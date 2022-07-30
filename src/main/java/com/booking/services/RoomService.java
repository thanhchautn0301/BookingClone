package com.booking.services;

import java.util.List;

import com.booking.entities.AccommodationDetail;
import com.booking.entities.RoomDetail;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.booking.apis.APIClient;
import com.booking.apis.RoomAPI;
import com.booking.entities.Room;

import okhttp3.MultipartBody;
import retrofit2.Response;
import retrofit2.http.Multipart;

@Service
public class RoomService implements IRoomService{
	
	private RoomAPI roomAPI;
	
	public RoomService() {
		roomAPI = APIClient.getClient().create(RoomAPI.class);
	}
	
	@Override
	public Room create(Room room) {
		try {
			room.setStatus(true);
			Response<Room> response = roomAPI.create(room).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public List<Room> findAllByHostId(int hostId) {
		Response<List<Room>> response ;
		try {
			response = roomAPI.findAllByHostId(hostId).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean update(Room room) {
		Response<Boolean> response;
		try {
			room.setStatus(true);
			response = roomAPI.update(room).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		Response<Boolean> response;
		try {
			response = roomAPI.delete(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<RoomDetail> findroombycitydaterequest(String name, String dateRange, int capacity, int childrenQuantity, int adultQuantity) {
		Response<List<RoomDetail>> response ;
		try {
			response = roomAPI.findRoomByCityDate(name,dateRange,capacity,childrenQuantity,adultQuantity).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
