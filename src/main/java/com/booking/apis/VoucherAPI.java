package com.booking.apis;

import java.util.List;

import com.booking.entities.Voucher;

import retrofit2.Call;
import retrofit2.http.*;

import com.booking.entities.Voucher;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

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

	@GET("voucher/findvoucherbyname")
	public Call<Voucher> findvoucherByName(@Query("name") String name,@Query("accomodation_id") int accomodation_id);

}
