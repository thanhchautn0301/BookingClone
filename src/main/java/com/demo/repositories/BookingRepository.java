package com.demo.repositories;

import com.demo.entities.Booking;
import com.demo.entities_api.BookingApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {
    @Query("select new com.demo.entities_api.BookingApi(id, customer.id, dateBooking, payment, status) from Booking where status =true")
    public List<BookingApi> findAllBooking();

    @Query("select new com.demo.entities_api.BookingApi(id, customer.id, dateBooking, payment, status) from Booking where status =true")
    public List<BookingApi> findAllBookingSort(Sort sort);

    @Query("select new com.demo.entities_api.BookingApi(id, customer.id, dateBooking, payment, status) from Booking where status =true")
    public List<BookingApi> findAllBookingPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.BookingApi(id, customer.id, dateBooking, payment, status) from Booking where status =true and id=:id")
    public BookingApi findBookingById(@Param("id") int id);

}
