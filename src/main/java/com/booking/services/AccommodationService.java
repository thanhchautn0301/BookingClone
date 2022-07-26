package com.booking.services;

import java.io.IOException;
import java.util.List;

import com.booking.entities.SearchAccommodation;
import okhttp3.MultipartBody;
import com.booking.helpers.TokenReader;
import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.AccommodationAPI;
import com.booking.entities.Accommodation;

import retrofit2.Response;

@Service
public class AccommodationService implements IAccommodationService {
	
	private AccommodationAPI accommodationAPI;
	
	public AccommodationService() {
		accommodationAPI = APIClient.getClient().create(AccommodationAPI.class);
	}
	
	@Override
	public List<Accommodation> findAll() {
		Response<List<Accommodation>> response;
		try {
			response = accommodationAPI.findall().execute();
			return response.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}	
	}

	@Override
	public List<Accommodation> findAllByHostId(int id) {
		Response<List<Accommodation>> response;
		try {
			response = accommodationAPI.findByHostId(id).execute();
			return response.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}	
	}

	@Override
	public SearchAccommodation findAllByCityId(int id) {
		Response<SearchAccommodation> response;
		try {
			response = accommodationAPI.findByCityId(id).execute();
			return response.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean update(Accommodation accommodation) {
		
		try {
			accommodation.setStatus(true);
			Response<Boolean> response = accommodationAPI.update(accommodation).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Accommodation create(Accommodation accommodation) {
		Response<Accommodation> response;
		try {
			accommodation.setStatus(true);
			response = accommodationAPI.create(accommodation).execute();
			return response.body();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}	
	}

	@Override
	public boolean delete(int id) {
		try {
			Response<Boolean> response = accommodationAPI.delete(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public String uploadFile(MultipartBody.Part file) {
		try {
			Response<String> response = accommodationAPI.uploadImage(file).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
