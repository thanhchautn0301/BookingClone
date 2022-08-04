package com.demo.services;

import com.demo.entities_api.DetailInvoiceApi;
import com.demo.entities_api.InvoiceApi;

import java.util.List;

public interface IInvoiceService {
    public List<InvoiceApi> findall();
    public InvoiceApi findInvoiceById(int invoiceId);
    public InvoiceApi create(InvoiceApi invoiceId);
    public boolean update(InvoiceApi invoiceId);
    public boolean delete(int invoiceId);
    public List<InvoiceApi> findallinvoicewithsort(String field);
    public List<InvoiceApi> findallinvoicepaginate(int offset, int no);
    public List<InvoiceApi> findallinvoicebycustomerid(int id);
    public DetailInvoiceApi findinvoicedetailbyid(int id);
}
