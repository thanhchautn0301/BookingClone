package com.demo.services;

import com.demo.entities.Booking;
import com.demo.entities.Customer;
import com.demo.entities.Role;
import com.demo.entities_api.BookingApi;
import com.demo.entities_api.CustomerApi;
import com.demo.entities_api.RoleApi;
import com.demo.repositories.BookingRepository;
import com.demo.repositories.CustomerRepository;
import com.demo.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements IBookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<BookingApi> findAll() {
        return bookingRepository.findAllBooking();
    }

    @Override
    public BookingApi findByBookingId(int bookingApi_id) {
        return bookingRepository.findBookingById(bookingApi_id);
    }

    @Override
    public BookingApi create(BookingApi bookingApi) {
        try {
            // Tao moi 1 role de luu xuong csdl
            Booking booking = new Booking();
            booking.setDateBooking(bookingApi.getDateBooking());
            booking.setStatus(bookingApi.isStatus());

            Customer customer = customerRepository.findById(bookingApi.getCustomer_id()).get();
            booking.setCustomer(customer);
            booking.setPayment(bookingApi.getPayment());

            Booking newBooking = bookingRepository.save(booking);
            bookingApi.setId(newBooking.getId());
            return bookingApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(BookingApi bookingApi) {
        try {
            Booking booking = bookingRepository.findById(bookingApi.getId()).get();
            booking.setDateBooking(bookingApi.getDateBooking());
            booking.setStatus(bookingApi.isStatus());

            Customer customer = customerRepository.findById(bookingApi.getCustomer_id()).get();
            booking.setCustomer(customer);
            booking.setPayment(bookingApi.getPayment());

            return bookingRepository.save(booking)!=null;

        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Integer bookingApi_Id) {
        try {
            bookingRepository.deleteById(bookingApi_Id);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<BookingApi> findAllBookingWithSort(String field) {
        return bookingRepository.findAllBookingSort(Sort.by(field));
    }

    @Override
    public List<BookingApi> findAllPaginate(int offset, int pagesize) {
        List<BookingApi> bookings = bookingRepository.findAllBookingPagination(PageRequest.of(offset,pagesize));
        return bookings;
    }
}
