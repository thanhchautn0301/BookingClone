package com.booking.services;

import com.booking.entities.Image;

import okhttp3.MultipartBody;

public interface IImageService {

	public Image create(Image image);
	public String uploadFile(MultipartBody.Part file) ;
}
