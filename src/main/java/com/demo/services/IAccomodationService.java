package com.demo.services;

import com.demo.entities_api.AccommodationDetail;
import com.demo.entities_api.AccomodationApi;

import java.util.List;

public interface IAccomodationService {
    public List<AccomodationApi> findall();
    public AccomodationApi findAccomodationById(int accomodationId);
    public AccomodationApi create(AccomodationApi accomodationId);
    public boolean update(AccomodationApi accomodationId);
    public boolean delete(int accomodationId);
    public List<AccomodationApi> findallaccomodationwithsort(String field);
    public List<AccomodationApi> findallaccomodationpaginate(int offset, int no);
    public List<AccomodationApi> findallaccomodationbyhost(int hostId);
    public List<AccomodationApi> findallaccomodationbycityid(int cityId);
    // loc_home_accomm_detail
    public AccomodationApi getAccommodationById(Integer id);
}
