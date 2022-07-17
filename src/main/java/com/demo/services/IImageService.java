package com.demo.services;

import com.demo.entities_api.ImageApi;

import java.util.List;

public interface IImageService {
    public List<ImageApi> findall();
    public ImageApi findImageById(int imageId);
    public ImageApi create(ImageApi imageId);
    public boolean update(ImageApi imageId);
    public boolean delete(int imageId);
    public List<ImageApi> findallimagewithsort(String field);
    public List<ImageApi> findallimagepaginate(int offset, int no);
}
