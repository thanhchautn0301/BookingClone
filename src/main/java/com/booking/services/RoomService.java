package com.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.RoomAPI;
import com.booking.entities.Room;

import retrofit2.Response;

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

}
