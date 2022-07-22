package com.demo.services;

import com.demo.entities.Image;
import com.demo.entities.Room;
import com.demo.entities.Accomodation;
import com.demo.entities.Category;
import com.demo.entities.City;
import com.demo.entities.Staff;
import com.demo.entities_api.ImageApi;
import com.demo.helper.FileUpload;
import com.demo.repositories.ImageRepository;
import com.demo.repositories.RoomRepository;
import com.demo.repositories.AccomodationRepository;
import com.demo.repositories.CategoryRepository;
import com.demo.repositories.StaffRepository;
import com.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.servlet.ServletContext;

@Service
public class ImageService implements IImageService, ServletContextAware {
	
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private AccomodationRepository accomodationRepository;
    @Autowired
    private RoomRepository roomRepository;
    
    private ServletContext servletContext;
    
    @Override
    public List<ImageApi> findall() {
        return imageRepository.findAllImage();
    }

    @Override
    public ImageApi findImageById(int imageId) {
        return imageRepository.findImageById(imageId);
    }

    @Override
    public ImageApi create(ImageApi imageApi, MultipartFile multipartFile) {
        try {
        	Image image = new Image();

        	image.setName(imageApi.getName());
        	
            Accomodation  accomodation = accomodationRepository.findById(imageApi.getAccomodation_id()).get();
            image.setAccomodation(accomodation);
            Room room = roomRepository.findById(imageApi.getRoom_id()).get();
            image.setRoom(room);
        	image.setStatus(imageApi.isStatus());
        	
        	Image newImage = imageRepository.save(image);
        	
        	if(newImage != null) {
        		FileUpload.upload(servletContext, multipartFile);
        	}
        	
        	
        	imageApi.setId(newImage.getId());
            return imageApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(ImageApi imageApi) {
       try {
           Image image = imageRepository.findById(imageApi.getId()).get();

           image.setName(imageApi.getName());
        	
            Accomodation  accomodation = accomodationRepository.findById(imageApi.getAccomodation_id()).get();
            image.setAccomodation(accomodation);
            Room room = roomRepository.findById(imageApi.getRoom_id()).get();
            image.setRoom(room);
            image.setStatus(imageApi.isStatus());

           return imageRepository.save(image)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int imageId) {
        try {
        	Image image = imageRepository.findById(imageId).get();
        	image.setStatus(false);
        	return imageRepository.save(image)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<ImageApi> findallimagewithsort(String field) {
        return imageRepository.findAllImageSort(Sort.by(field));
    }

    @Override
    public List<ImageApi> findallimagepaginate(int offset, int no) {
        return imageRepository.findAllImagePagination(PageRequest.of(offset,no));
    }

	@Override
	public void setServletContext(ServletContext servletContext) {
		// TODO Auto-generated method stub
		this.servletContext = servletContext;
	}
}
