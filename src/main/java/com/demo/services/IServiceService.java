package com.demo.services;

import com.demo.entities_api.ServiceApi;

import java.util.List;

public interface IServiceService {
    public List<ServiceApi> findall();
    public ServiceApi findServiceById(int serviceId);
    public ServiceApi create(ServiceApi serviceId);
    public boolean update(ServiceApi serviceId);
    public boolean delete(int serviceId);
    public List<ServiceApi> findallservicewithsort(String field);
    public List<ServiceApi> findallservicepaginate(int offset, int no);
}
