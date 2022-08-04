package com.demo.repositories;

import com.demo.entities.Invoice;
import com.demo.entities_api.DetailInvoiceApi;
import com.demo.entities_api.InvoiceApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
    @Query("select new com.demo.entities_api.InvoiceApi(id, booking.id, voucher.id, total, deposit, status, oweMoney) from Invoice where status =true")
    public List<InvoiceApi> findAllInvoice();

    @Query("select new com.demo.entities_api.InvoiceApi(id, booking.id, voucher.id, total, deposit, status, oweMoney) from Invoice where status =true")
    public List<InvoiceApi> findAllInvoiceSort(Sort sort);

    @Query("select new com.demo.entities_api.InvoiceApi(id, booking.id, voucher.id, total, deposit, status, oweMoney) from Invoice where status =true")
    public List<InvoiceApi> findAllInvoicePagination(Pageable pageable);

    @Query("select new com.demo.entities_api.InvoiceApi(id, booking.id, voucher.id, total, deposit, status, oweMoney) from Invoice where status =true and id =:id")
    public InvoiceApi findInvoiceById(@Param("id") int id);

    @Query("select new com.demo.entities_api.InvoiceApi(Inv.id, B.dateBooking, Inv.total, Inv.total, Inv.oweMoney, B.payment, V.name) " +
            "from Invoice Inv, Booking B,Customer C LEFT OUTER JOIN Voucher V " +
            "ON Inv.voucher.id = V.id " +
            "where Inv.booking.id = B.id and B.customer.id = C.id " +
            "and Inv.status = true and C.id = :id")
    public List<InvoiceApi> findAllInvoiceByCustomerId(@Param("id") int id);

    // Xem chi tiet cua hoa don
    @Query("select new com.demo.entities_api.DetailInvoiceApi(BD.checkin, BD.checkout, BD.quantityAdult, BD.quantityChildren, R.name, A.name) " +
            "from Invoice Inv, Booking B, BookingDetail BD, Room R, Accomodation  A " +
            "where Inv.booking.id = B.id and B.id = BD.booking.id and Inv.id = :id " +
            "and BD.room.id = R.id and R.accomodation.id = A.id" )
    public DetailInvoiceApi findDetailInvoiceByInvoiceId(@Param("id") int id);
}
