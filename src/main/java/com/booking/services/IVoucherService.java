package com.booking.services;

import java.util.List;

import com.booking.entities.Voucher;

public interface IVoucherService {
	public Voucher create(Voucher voucher);
	public List<Voucher> findAll();
	public boolean update(Voucher city);
	public boolean delete(int id);
	public List<Voucher> findAllByHostId(int id);
}
