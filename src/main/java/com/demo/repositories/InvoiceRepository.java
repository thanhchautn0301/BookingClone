package com.demo.repositories;

import com.demo.entities.Invoice;
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
}
