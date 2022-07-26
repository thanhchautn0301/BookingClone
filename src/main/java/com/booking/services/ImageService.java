package com.booking.services;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.ImageAPI;
import com.booking.apis.RoomAPI;
import com.booking.entities.Image;
import com.booking.entities.Room;

import okhttp3.MultipartBody;
import okhttp3.MultipartBody.Part;
import retrofit2.Response;
@Service
public class ImageService implements IImageService {

	private ImageAPI imageAPI;
	
	public ImageService() {
		imageAPI = APIClient.getClient().create(ImageAPI.class);
	}
	
	@Override
	public Image create(Image image) {
		try {
			Response<Image> response = imageAPI.create(image).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String uploadFile(MultipartBody.Part file) {
		try {
			Response<String> response = imageAPI.uploadImage(file).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
