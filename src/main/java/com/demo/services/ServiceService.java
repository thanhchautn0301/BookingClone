package com.demo.services;

import com.demo.entities.Accomodation;
import com.demo.entities.Service;
import com.demo.entities_api.ServiceApi;
import com.demo.repositories.AccomodationRepository;
import com.demo.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService implements IServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    
    @Autowired
    private AccomodationRepository accomodationRepository;
    
    @Override
    public List<ServiceApi> findall() {
        return serviceRepository.findAllService();
    }

    @Override
    public ServiceApi findServiceById(int serviceId) {
        return serviceRepository.findServiceById(serviceId);
    }

    @Override
    public ServiceApi create(ServiceApi serviceApi) {
        try {
        	Service service = new Service();
        	
        	Accomodation accomodation = accomodationRepository.findById(serviceApi.getAccomodation_id()).get();
        	service.setAccomodation(accomodation);
        	service.setName(serviceApi.getName());   	
        	service.setPrice(serviceApi.getPrice());
        	service.setIconCanvas(serviceApi.getIconCanvas());
        	
        	service.setStatus(serviceApi.isStatus());
        	
        	Service newService = serviceRepository.save(service);
        	serviceApi.setId(newService.getId());
            return serviceApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(ServiceApi serviceApi) {
       try {
           Service service = serviceRepository.findById(serviceApi.getId()).get();

           Accomodation accomodation = accomodationRepository.findById(serviceApi.getAccomodation_id()).get();
       		service.setAccomodation(accomodation);
       		service.setName(serviceApi.getName());   	
       		service.setPrice(serviceApi.getPrice());
       		service.setIconCanvas(serviceApi.getIconCanvas());
       	
       		service.setStatus(serviceApi.isStatus());

           return serviceRepository.save(service)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int serviceId) {
        try {
        	Service service = serviceRepository.findById(serviceId).get();
        		service.setStatus(false);

            return serviceRepository.save(service)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<ServiceApi> findallservicewithsort(String field) {
        return serviceRepository.findAllServiceSort(Sort.by(field));
    }

    @Override
    public List<ServiceApi> findallservicepaginate(int offset, int no) {
        return serviceRepository.findAllServicePagination(PageRequest.of(offset,no));
    }

    @Override
    public List<ServiceApi> findServiceByAccommodationId(Integer id) {
        return serviceRepository.findServiceByAccommodationId(id);
    }
}
