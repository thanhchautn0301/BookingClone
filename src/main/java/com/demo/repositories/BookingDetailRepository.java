package com.demo.repositories;

import com.demo.entities.Booking;
import com.demo.entities.BookingDetail;
import com.demo.entities_api.BookingApi;
import com.demo.entities_api.BookingDetailApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingDetailRepository extends JpaRepository<BookingDetail,Integer> {
    @Query("select new com.demo.entities_api.BookingDetailApi(id, booking.id, room.id, quantityAdult, quantityChildren, checkin, checkout, status) from BookingDetail where status =true")
    public List<BookingDetailApi> findAllBookingDetail();

    @Query("select new com.demo.entities_api.BookingDetailApi(id, booking.id, room.id, quantityAdult, quantityChildren, checkin, checkout, status) from BookingDetail where status =true")
    public List<BookingDetailApi> findAllBookingDetailSort(Sort sort);

    @Query("select new com.demo.entities_api.BookingDetailApi(id, booking.id, room.id, quantityAdult, quantityChildren, checkin, checkout, status) from BookingDetail where status =true")
    public List<BookingDetailApi> findAllBookingDetailPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.BookingDetailApi(id, booking.id, room.id, quantityAdult, quantityChildren, checkin, checkout, status) from BookingDetail where status =true and id=:id")
    public BookingDetailApi findBookingDetailById(@Param("id") int id);

}
