package com.demo.services;

import com.demo.entities.Booking;
import com.demo.entities.BookingDetail;
import com.demo.entities.Customer;
import com.demo.entities.Room;
import com.demo.entities_api.BookingApi;
import com.demo.entities_api.BookingDetailApi;
import com.demo.repositories.BookingDetailRepository;
import com.demo.repositories.BookingRepository;
import com.demo.repositories.CustomerRepository;
import com.demo.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingDetailService implements IBookingDetailService {
    @Autowired
    private BookingDetailRepository bookingDetailRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<BookingDetailApi> findAll() {
        return bookingDetailRepository.findAllBookingDetail();
    }

    @Override
    public BookingDetailApi findByBookingDetailId(int bookingApi_id) {
        return bookingDetailRepository.findBookingDetailById(bookingApi_id);
    }

    @Override
    public boolean create(BookingDetailApi bookingDetailApi) {
        try {
            // Tao moi 1 role de luu xuong csdl
            BookingDetail bookingDetail = new BookingDetail();

            Booking booking = bookingRepository.findById(bookingDetailApi.getBookingId()).get();

            bookingDetail.setBooking(booking);
            bookingDetail.setCheckin(bookingDetailApi.getCheckin());
            bookingDetail.setCheckout(bookingDetailApi.getCheckout());
            bookingDetail.setStatus(bookingDetailApi.isStatus());
            bookingDetail.setQuantityAdult(bookingDetailApi.getQuantityAdult());
            bookingDetail.setQuantityChildren(bookingDetailApi.getQuantityChildren());

            Room room = roomRepository.findById(bookingDetailApi.getRoomId()).get();
            bookingDetail.setRoom(room);

            return bookingDetailRepository.save(bookingDetail)!=null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(BookingDetailApi bookingDetailApi) {
        try {
            BookingDetail bookingDetail = bookingDetailRepository.findById(bookingDetailApi.getId()).get();
            Booking booking = bookingRepository.findById(bookingDetailApi.getBookingId()).get();

            bookingDetail.setBooking(booking);
            bookingDetail.setCheckin(bookingDetailApi.getCheckin());
            bookingDetail.setCheckout(bookingDetailApi.getCheckout());
            bookingDetail.setStatus(bookingDetailApi.isStatus());
            bookingDetail.setQuantityAdult(bookingDetailApi.getQuantityAdult());
            bookingDetail.setQuantityChildren(bookingDetailApi.getQuantityChildren());

            Room room = roomRepository.findById(bookingDetailApi.getRoomId()).get();
            bookingDetail.setRoom(room);

            return bookingDetailRepository.save(bookingDetail)!=null;

        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Integer bookingDetailApi_Id) {
        try {
            bookingDetailRepository.deleteById(bookingDetailApi_Id);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<BookingDetailApi> findAllBookingDetailWithSort(String field) {
        return bookingDetailRepository.findAllBookingDetailSort(Sort.by(field));
    }

    @Override
    public List<BookingDetailApi> findAllDetailPaginate(int offset, int pagesize) {
        List<BookingDetailApi> bookingDetails = bookingDetailRepository.findAllBookingDetailPagination(PageRequest.of(offset,pagesize));
        return bookingDetails;
    }
}
