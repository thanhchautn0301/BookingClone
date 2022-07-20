package com.demo.repositories;

import com.demo.entities.Invoice;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TurnoverRepository extends JpaRepository<Invoice, Integer> {
    @Query("SELECT SUM(I.total) FROM Invoice AS I, BookingDetail BD " +
    "LEFT JOIN I.booking AS B " +
    "LEFT JOIN BD.room AS R " +
    "LEFT JOIN R.accomodation AS A " +
    "WHERE A.staff.id = ?1 AND (A.id = ?2 OR 0 = ?2) AND B.dateBooking >= ?3 AND B.dateBooking <= ?4  AND BD.booking.id = B.id AND A.status = true " + 
    "ORDER BY A.staff.id")
    public double sumTotal(
        @Param("hostId" )int hostId, @Param("accomodationId" )int accomodationId, @Param("fromDate" )Date fromDate,
        @Param("untilDate" )Date untilDate);
}
