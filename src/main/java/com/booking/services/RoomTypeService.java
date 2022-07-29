package com.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.RoomTypeAPI;
import com.booking.entities.RoomType;

import retrofit2.Response;

@Service
public class RoomTypeService implements IRoomTypeService {
	
	private RoomTypeAPI roomTypeAPI;
	
	public RoomTypeService() {
		roomTypeAPI = APIClient.getClient().create(RoomTypeAPI.class);
	}
	
	@Override
	public List<RoomType> findAllByHostId(int id) {
		Response<List<RoomType>> response;
		try {
			response = roomTypeAPI.findAllByHostId(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public RoomType create(RoomType roomType) {
		Response<RoomType> response;
		try {
			roomType.setStatus(true);
			response = roomTypeAPI.create(roomType).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean update(RoomType roomType) {
		Response<Boolean> response;
		try {
			roomType.setStatus(true);
			response = roomTypeAPI.update(roomType).execute();
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
			response = roomTypeAPI.delete(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
