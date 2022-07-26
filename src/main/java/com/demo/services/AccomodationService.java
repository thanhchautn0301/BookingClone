package com.demo.services;

import com.demo.entities.Accomodation;
import com.demo.entities.Category;
import com.demo.entities.City;
import com.demo.entities.Staff;
import com.demo.entities_api.*;
import com.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AccomodationService implements IAccomodationService {
	
    @Autowired
    private AccomodationRepository accomodationRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomTypeRepository roomTypeRepository;



    @Override
    public List<AccomodationApi> findall() {
        return accomodationRepository.findAllAccomodation();
    }

    @Override
    public AccomodationApi findAccomodationById(int accomodationId) {
        return accomodationRepository.findAccomodationById(accomodationId);
    }

    @Override
    public AccomodationApi create(AccomodationApi accomodationApi) {
        try {
        	Accomodation accomodation = new Accomodation();

        	accomodation.setName(accomodationApi.getName());
        	
        	Category category = categoryRepository.findById(accomodationApi.getCategory_id()).get();
        	accomodation.setCategory(category);
        	City city = cityRepository.findById(accomodationApi.getCity_id()).get();
        	accomodation.setCity(city);
        	Staff staff = staffRepository.findById(accomodationApi.getStaff_id()).get();
        	accomodation.setStaff(staff);     	
        	accomodation.setStatus(accomodationApi.isStatus());
        	
        	Accomodation newAccomodation = accomodationRepository.save(accomodation);
        	accomodationApi.setId(newAccomodation.getId());
            return accomodationApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(AccomodationApi accomodationApi) {
       try {
           Accomodation accomodation = accomodationRepository.findById(accomodationApi.getId()).get();

           accomodation.setName(accomodationApi.getName());
       	
	       	Category category = categoryRepository.findById(accomodationApi.getCategory_id()).get();
	       	accomodation.setCategory(category);
	       	City city = cityRepository.findById(accomodationApi.getCity_id()).get();
	       	accomodation.setCity(city);
	       	Staff staff = staffRepository.findById(accomodationApi.getStaff_id()).get();
	       	accomodation.setStaff(staff);     	
	       	accomodation.setStatus(accomodationApi.isStatus());

           return accomodationRepository.save(accomodation)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int accomodationId) {
        try {
        	Accomodation accomodation = accomodationRepository.findById(accomodationId).get();
        	accomodation.setStatus(false);
        	return accomodationRepository.save(accomodation)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<AccomodationApi> findallaccomodationwithsort(String field) {
        return accomodationRepository.findAllAccomodationSort(Sort.by(field));
    }

    @Override
    public List<AccomodationApi> findallaccomodationpaginate(int offset, int no) {
        return accomodationRepository.findAllAccomodationPagination(PageRequest.of(offset,no));
    }

    @Override
    public List<AccomodationApi> findallaccomodationbyhost(int hostId) {
        return accomodationRepository.findAllAccomodationByHostId(hostId);
    }

    @Override
    public List<AccomodationApi> findallaccomodationbycityid(int cityId) {
        return accomodationRepository.findAllAccomodationByCityId(cityId);
    }

    @Override
    public AccommodationDetail getAccommodationDetail(Integer accommodationId) {
        if(accommodationId != null) {
            List<RoomDetail> roomDetails = new ArrayList<RoomDetail>();


            List<ServiceApi> services = new ArrayList<ServiceApi>();

            List<String> images = new ArrayList<String>();

            AccomodationApi accommodation = new AccomodationApi();

            roomDetails = roomRepository.findRoomByAccommodationId(accommodationId);




        }


        return null;
    }
}
