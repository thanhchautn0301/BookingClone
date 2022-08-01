package com.booking.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.VoucherAPI;
import com.booking.entities.Voucher;

import retrofit2.Response;

@Service
public class VoucherService implements IVoucherService {
	
	private VoucherAPI voucherAPI;
	
	
	
	public VoucherService() {
		voucherAPI = APIClient.getClient().create(VoucherAPI.class);
	}



	@Override
	public Voucher create(Voucher voucher) {
		try {
			Response<Voucher> response = voucherAPI.create(voucher).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}



	@Override
	public List<Voucher> findAll() {
		try {
			Response<List<Voucher>> response = voucherAPI.findall().execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}



	@Override
	public boolean update(Voucher voucher) {
		try {
			//System.out.println("Voucher id : " + voucher.getId() + "\n Name: " + voucher.getName());
			Response<Boolean> response = voucherAPI.update(voucher).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean delete(int id) {
		try {
			Response<Boolean> response = voucherAPI.delete(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public List<Voucher> findAllByHostId(int id) {
		try {
			Response<List<Voucher>> response = voucherAPI.findAllByHostId(id).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}



	@Override
	public Voucher findVoucherByName(String name) {
        try {
            voucherAPI = APIClient.getClient().create(VoucherAPI.class);
            Response<Voucher> response = voucherAPI.findvoucherByName(name).execute();
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
}
