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
            accomodation.setDescription(accomodationApi.getDescription());
        	
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
    public AccomodationApi getAccommodationById(Integer id){
        Accomodation accomodation = accomodationRepository.getById(id);
        AccomodationApi accomodationApi = new AccomodationApi();
        accomodationApi.setId(accomodation.getId());
        accomodationApi.setCategory_id(accomodation.getCategory().getId());
        accomodationApi.setCategory_name(accomodation.getCategory().getName());
        accomodationApi.setCity_id(accomodation.getCity().getId());
        accomodationApi.setCity_name(accomodation.getCity().getName());
        accomodationApi.setStaff_id(accomodation.getStaff().getId());
        accomodationApi.setName(accomodation.getName());
        accomodationApi.setStatus(true);
        accomodationApi.setImage(null);
        accomodationApi.setDescription(accomodation.getDescription());
       return accomodationApi;
    }


    @Override
    public List<AccomodationApi> findallaccomodationbycityname(String cityName) {
        return accomodationRepository.findAllAccomodationByCityName(cityName);
    }



}
