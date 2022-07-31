package com.booking.services;

import com.booking.entities.Voucher;

public interface IVoucherService {
    public Voucher findVoucherByName(String name);
}
