package com.demo.services;

import com.demo.entities_api.ServiceDetailApi;

import java.util.List;

public interface IServiceDetailService {
    public List<ServiceDetailApi> findall();
    public ServiceDetailApi findServiceDetailById(int serviceDetailId);
    public ServiceDetailApi create(ServiceDetailApi serviceDetailId);
    public boolean update(ServiceDetailApi serviceDetailId);
    public boolean delete(int serviceDetailId);
    public List<ServiceDetailApi> findallserviceDetailwithsort(String field);
    public List<ServiceDetailApi> findallserviceDetailpaginate(int offset, int no);
}
