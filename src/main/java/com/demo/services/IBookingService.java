package com.demo.services;

import com.demo.entities_api.BookingApi;
import com.demo.entities_api.RoleApi;

import java.util.List;

public interface IBookingService {
    public List<BookingApi> findaAll();
    public BookingApi findByBookingId(int bookingApi_id);
    public boolean create(BookingApi bookingApi);
    public boolean update(BookingApi bookingApi);
    public boolean delete(Integer id);
    public List<BookingApi> findAllBookingWithSort(String field);

    public List<BookingApi> findAllPaginate(int offset, int no);
}
