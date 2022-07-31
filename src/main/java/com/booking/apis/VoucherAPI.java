package com.booking.apis;



import java.util.List;

import com.booking.entities.Voucher;

import retrofit2.Call;
import retrofit2.http.*;

public interface VoucherAPI {
	@POST("voucher/create")
	public Call<Voucher> create(@Body Voucher voucher);
	
	@PUT("voucher/update")
	public Call<Boolean> update(@Body Voucher voucher);
	
	@DELETE("voucher/delete/{id}")
	public Call<Boolean> delete(@Path("id") int id);
	
	@GET("voucher/findall")
	public Call<List<Voucher>> findall();
	
	@GET("voucher/findVoucherById/{id}")
	public Call<Voucher> findVoucherById(@Path("id") int id);

	@GET("voucher/findallbyhostid/{id}")
	public Call<List<Voucher>> findAllByHostId(@Path("id") int id);
}
