package com.demo.repositories;

import com.demo.entities.Voucher;
import com.demo.entities_api.VoucherApi;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Integer> {
    @Query("select new com.demo.entities_api.VoucherApi(id, accomodation.id, priceDiscount, expDate, status,name) from Voucher where status =true")
    public List<VoucherApi> findAllVoucher();

    @Query("select new com.demo.entities_api.VoucherApi(id, accomodation.id, priceDiscount, expDate, status,name) from Voucher where status =true")
    public List<VoucherApi> findAllVoucherSort(Sort sort);

    @Query("select new com.demo.entities_api.VoucherApi(id, accomodation.id, priceDiscount, expDate, status,name) from Voucher where status =true")
    public List<VoucherApi> findAllVoucherPagination(Pageable pageable);

    @Query("select new com.demo.entities_api.VoucherApi(id, accomodation.id, priceDiscount, expDate, status,name) from Voucher where status =true and id =:id")
    public VoucherApi findVoucherById(@Param("id") int id);

    @Query("select new com.demo.entities_api.VoucherApi(V.id, V.accomodation.id, A.name, V.name, V.priceDiscount, V.expDate, V.status) " + 
    "from Voucher V LEFT OUTER JOIN Accomodation A " +
    "on V.accomodation.id = A.id "+ 
    "where V.status = true and A.staff.id =:id")
    public List<VoucherApi> findAllVoucherByHostId(@Param("id") int id);
    
    @Query("select new com.demo.entities_api.VoucherApi(id, accomodation.id, priceDiscount, expDate, status,name) from Voucher where status =true and name =:name")
    public VoucherApi findVoucherByName(@Param("name") String name);
}
