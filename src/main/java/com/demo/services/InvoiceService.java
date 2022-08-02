package com.demo.services;

import com.demo.entities.Invoice;
import com.demo.entities.Booking;
import com.demo.entities.Voucher;
import com.demo.entities_api.InvoiceApi;
import com.demo.repositories.InvoiceRepository;
import com.demo.repositories.BookingRepository;
import com.demo.repositories.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService implements IInvoiceService {
	
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private VoucherRepository voucherRepository;
    
    @Override
    public List<InvoiceApi> findall() {
        return invoiceRepository.findAllInvoice();
    }

    @Override
    public InvoiceApi findInvoiceById(int invoiceId) {
        return invoiceRepository.findInvoiceById(invoiceId);
    }

    @Override
    public InvoiceApi create(InvoiceApi invoiceApi) {
        try {
        	Invoice invoice = new Invoice();
        	
            Booking booking = bookingRepository.findById(invoiceApi.getBooking_id()).get();
            invoice.setBooking(booking);
            if(invoiceApi.getVoucher_id() !=null) {
                Voucher voucher = voucherRepository.findById(invoiceApi.getVoucher_id()).get();
                invoice.setVoucher(voucher);
            }
            invoice.setDeposit(invoiceApi.getDeposit());
            invoice.setOweMoney(invoiceApi.getOweMoney());            
        	invoice.setStatus(invoiceApi.getStatus());
            invoice.setTotal(invoiceApi.getTotal());
        	Invoice newInvoice = invoiceRepository.save(invoice);
        	invoiceApi.setId(newInvoice.getId());
            return invoiceApi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean update(InvoiceApi invoiceApi) {
       try {
           Invoice invoice = invoiceRepository.findById(invoiceApi.getId()).get();

           Booking booking = bookingRepository.findById(invoiceApi.getBooking_id()).get();
            invoice.setBooking(booking);
            Voucher voucher = voucherRepository.findById(invoiceApi.getVoucher_id()).get();
            invoice.setVoucher(voucher);
            invoice.setTotal(invoiceApi.getTotal());
            invoice.setDeposit(invoiceApi.getDeposit());
            invoice.setOweMoney(invoiceApi.getOweMoney());            
        	invoice.setStatus(invoiceApi.getStatus());

           return invoiceRepository.save(invoice)!=null;
       } catch(Exception e) {
           e.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean delete(int invoiceId) {
        try {
        	Invoice invoice = invoiceRepository.findById(invoiceId).get();
        	invoice.setStatus(false);
        	return invoiceRepository.save(invoice)!=null;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<InvoiceApi> findallinvoicewithsort(String field) {
        return invoiceRepository.findAllInvoiceSort(Sort.by(field));
    }

    @Override
    public List<InvoiceApi> findallinvoicepaginate(int offset, int no) {
        return invoiceRepository.findAllInvoicePagination(PageRequest.of(offset,no));
    }

    @Override
    public List<InvoiceApi> findallinvoicebycustomerid(int id) {
        return invoiceRepository.findAllInvoiceByCustomerId(id);
    }
}
