package com.booking.services;

import com.booking.entities.AccommodationOfCity;
import com.booking.entities.City;
import com.booking.entities.Service;
import okhttp3.MultipartBody;

import java.util.List;

public interface IServiceService {
	public com.booking.entities.Service create(com.booking.entities.Service service);
}
