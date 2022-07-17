package com.demo.services;

import com.demo.entities.BookingDetail;
import com.demo.entities.Category;
import com.demo.entities.City;
import com.demo.entities.ServiceDetail;
import com.demo.entities.Staff;
import com.demo.entities_api.ServiceDetailApi;
import com.demo.repositories.ServiceDetailRepository;
import com.demo.repositories.ServiceRepository;
import com.demo.repositories.BookingDetailRepository;
import com.demo.repositories.CategoryRepository;
import com.demo.repositories.StaffRepository;
import com.demo.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDetailService implements IServiceDetailService {
	
    @Autowired
    private ServiceDetailRepository serviceDetailRepository;
    @Autowired
    private BookingDetailRepository bookingDetailRepository;
    @Autowired
    private ServiceRepository serviceRepository;
    @Autowired
    private CityRepository cityRepository;
    
    @Override
    public List<ServiceDetailApi> findall() {
        return serviceDetailRepository.findAllServiceDetail();
    }

    @Override
    public ServiceDetailApi findServiceDetailById(int serviceDetailId) {
        return serviceDetailRepository.findServiceDetailById(serviceDetailId);
    }

    @Override
    public ServiceDetailApi create(ServiceDetailApi serviceDetailApi) {
        try {
        	ServiceDetail serviceDetail = new ServiceDetail();

        	BookingDetail bookingDetail = bookingDetailRepository.findById(serviceDetailApi.getBookingDetail_id()).get();
            serviceDetail.setBookingDetail(bookingDetail);
            com.demo.entities.Service  service = serviceRepository.findById(serviceDetailApi.getBookingDetail_id()).get();
            serviceDetail.setService(service);
            serviceDetail.setQuantity(serviceDetailApi.getQuantity());
            serviceDetail.setDescription(serviceDetailApi.getDescription());
        	serviceDetail.setStatus(serviceDetailApi.isStatus());
        	
        	ServiceDetail newServiceDetail = serviceDetailRepository.save(serviceDetail);
        	serviceDetailApi.setId(newServiceDetail.getId());
            return serviceDetailApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(ServiceDetailApi serviceDetailApi) {
       try {
           ServiceDetail serviceDetail = serviceDetailRepository.findById(serviceDetailApi.getId()).get();

           BookingDetail bookingDetail = bookingDetailRepository.findById(serviceDetailApi.getBookingDetail_id()).get();
            serviceDetail.setBookingDetail(bookingDetail);
            com.demo.entities.Service  service = serviceRepository.findById(serviceDetailApi.getBookingDetail_id()).get();
            serviceDetail.setService(service);
            serviceDetail.setQuantity(serviceDetailApi.getQuantity());
            serviceDetail.setDescription(serviceDetailApi.getDescription());
        	serviceDetail.setStatus(serviceDetailApi.isStatus());

           return serviceDetailRepository.save(serviceDetail)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int serviceDetailId) {
        try {
        	ServiceDetail serviceDetail = serviceDetailRepository.findById(serviceDetailId).get();
        	serviceDetail.setStatus(false);
        	return serviceDetailRepository.save(serviceDetail)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<ServiceDetailApi> findallserviceDetailwithsort(String field) {
        return serviceDetailRepository.findAllServiceDetailSort(Sort.by(field));
    }

    @Override
    public List<ServiceDetailApi> findallserviceDetailpaginate(int offset, int no) {
        return serviceDetailRepository.findAllServiceDetailPagination(PageRequest.of(offset,no));
    }
}
