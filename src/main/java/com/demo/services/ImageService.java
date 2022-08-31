package com.demo.services;

import com.demo.entities.Image;
import com.demo.entities.Room;
import com.demo.entities.Accomodation;
import com.demo.entities_api.ImageApi;
import com.demo.helper.FileUpload;
import com.demo.repositories.ImageRepository;
import com.demo.repositories.RoomRepository;
import com.demo.repositories.AccomodationRepository;
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
    public ImageApi create(ImageApi imageApi) {
        try {
            System.out.println( "ten image:"+imageApi.getName());
        	Image image = new Image();

        	image.setName(imageApi.getName());
        	if(imageApi.getAccomodation_id() != 0) {
        		 Accomodation  accomodation = accomodationRepository.findById(imageApi.getAccomodation_id()).get();
                 image.setAccomodation(accomodation);
        	}
           
        	if(imageApi.getRoom_id() != 0) {
        		  Room room = roomRepository.findById(imageApi.getRoom_id()).get();
                  image.setRoom(room);
        	}

            System.out.println( "ten image:"+image.getName());
        	image.setStatus(true);
        	
        	Image newImage = imageRepository.save(image);
        	
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
	public String uploadImage(ServletContext servletContext, MultipartFile file) {
		try {
			String name =   FileUpload.upload(servletContext, file);

			return name;
		} catch (Exception e) {

			return "";
		}
	}

    @Override
    public List<String> findImageByAccommodationId(int accommodationId) {
        return imageRepository.findImageByAccommodationId(accommodationId);
    }

    @Override
	public void setServletContext(ServletContext servletContext) {
		// TODO Auto-generated method stub
		this.servletContext = servletContext;
	}

    @Override
    public List<String> findImageByRoomId(int roomId) {
        return imageRepository.findImageByRoomId(roomId);
    }
}
