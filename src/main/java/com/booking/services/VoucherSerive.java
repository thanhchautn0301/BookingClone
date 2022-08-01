package com.booking.services;

import com.booking.apis.APIClient;
import com.booking.apis.StaffAPI;
import com.booking.apis.VoucherAPI;
import com.booking.entities.Voucher;
import org.springframework.stereotype.Service;
import retrofit2.Response;

@Service
public class VoucherSerive implements IVoucherService {
    private VoucherAPI voucherAPI;
    @Override
    public Voucher findVoucherByName(String name,int accomodation_id) {
        try {
            voucherAPI = APIClient.getClient().create(VoucherAPI.class);
            Response<Voucher> response = voucherAPI.findvoucherByName(name,accomodation_id).execute();
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
