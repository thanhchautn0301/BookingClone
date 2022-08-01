package com.demo.services;

import com.demo.entities.Accomodation;
import com.demo.entities.Voucher;
import com.demo.entities_api.VoucherApi;
import com.demo.repositories.AccomodationRepository;
import com.demo.repositories.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoucherService implements IVoucherService {
    @Autowired
    private VoucherRepository voucherRepository;
    
    @Autowired
    private AccomodationRepository accomodationRepository;
    
    @Override
    public List<VoucherApi> findall() {
        return voucherRepository.findAllVoucher();
    }

    @Override
    public VoucherApi findVoucherById(int voucherId) {
        return voucherRepository.findVoucherById(voucherId);
    }

    @Override
    public VoucherApi create(VoucherApi voucherApi) {
        try {
        	Voucher voucher = new Voucher();

            voucher.setName(voucherApi.getName());

        	voucher.setPriceDiscount(voucherApi.getPriceDiscount());
        	
        	Accomodation accomodation = accomodationRepository.findById(voucherApi.getAccomodation_id()).get();
        	voucher.setAccomodation(accomodation);
        	voucher.setExpDate(voucherApi.getExpDate());        	
        	voucher.setStatus(voucherApi.isStatus());
        	
        	Voucher newVoucher = voucherRepository.save(voucher);
        	voucherApi.setId(newVoucher.getId());
            return voucherApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(VoucherApi voucherApi) {
       try {
           Voucher voucher = voucherRepository.findById(voucherApi.getId()).get();

           voucher.setName(voucherApi.getName());

           voucher.setPriceDiscount(voucherApi.getPriceDiscount());
       	
	       	Accomodation accomodation = accomodationRepository.findById(voucherApi.getAccomodation_id()).get();
	       	voucher.setAccomodation(accomodation);
	       	voucher.setExpDate(voucherApi.getExpDate());        	
	       	voucher.setStatus(voucherApi.isStatus());

           return voucherRepository.save(voucher)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int voucherId) {
        try {
        	Voucher voucher = voucherRepository.findById(voucherId).get();
 	       	voucher.setStatus(false);

            return voucherRepository.save(voucher)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<VoucherApi> findallvoucherwithsort(String field) {
        return voucherRepository.findAllVoucherSort(Sort.by(field));
    }

    @Override
    public List<VoucherApi> findallvoucherpaginate(int offset, int no) {
        return voucherRepository.findAllVoucherPagination(PageRequest.of(offset,no));
    }

    @Override
    public List<VoucherApi> findallbyhostid(int id) {
        return voucherRepository.findAllVoucherByHostId(id);
    }
    
    @Override
    public VoucherApi findVoucherByName(String name) {
        try {
            return  voucherRepository.findVoucherByName(name);
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
