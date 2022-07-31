package com.demo.services;

import com.demo.entities_api.VoucherApi;

import java.util.List;

public interface IVoucherService {
    public List<VoucherApi> findall();
    public VoucherApi findVoucherById(int voucherId);
    public VoucherApi create(VoucherApi voucherId);
    public boolean update(VoucherApi voucherId);
    public boolean delete(int voucherId);
    public List<VoucherApi> findallvoucherwithsort(String field);
    public List<VoucherApi> findallvoucherpaginate(int offset, int no);
    public List<VoucherApi> findallbyhostid(int id);
}
