package com.demo.services;

import com.demo.entities_api.ImageApi;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    public List<ImageApi> findall();
    public ImageApi findImageById(int imageId);
    public ImageApi create(ImageApi imageId);
    public boolean update(ImageApi imageId);
    public boolean delete(int imageId);
    public List<ImageApi> findallimagewithsort(String field);
    public List<ImageApi> findallimagepaginate(int offset, int no);
    public String uploadImage(ServletContext servletContext,MultipartFile file);

    public List<String> findImageByAccommodationId(int accommodationId);
    public List<String> findImageByRoomId(int roomId);
    public boolean deleteByRoomId(int roomId);
}
