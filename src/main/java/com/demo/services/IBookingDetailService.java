package com.demo.services;

import com.demo.entities_api.BookingApi;
import com.demo.entities_api.BookingDetailApi;

import java.util.List;

public interface IBookingDetailService {
    public List<BookingDetailApi> findAll();
    public BookingDetailApi findByBookingDetailId(int bookingApi_id);
    public BookingDetailApi create(BookingDetailApi bookingDetailApi);
    public boolean update(BookingDetailApi bookingDetailApi);
    public boolean delete(Integer id);
    public List<BookingDetailApi> findAllBookingDetailWithSort(String field);

    public List<BookingDetailApi> findAllDetailPaginate(int offset, int no);
}
