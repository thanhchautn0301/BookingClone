package com.booking.apis;

import com.booking.entities.Invoice;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface InvoiceAPI {
	@POST("invoice/create")
	Call<Invoice> create(@Body Invoice invoice);
}
