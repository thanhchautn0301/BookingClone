package com.booking.services;

import org.springframework.stereotype.Service;

import com.booking.apis.APIClient;
import com.booking.apis.InvoiceAPI;
import com.booking.entities.Invoice;

import retrofit2.Response;

@Service
public class InvoiceService implements IInvoiceService {
	
	private InvoiceAPI invoiceAPI;
	
	public InvoiceService() {
		invoiceAPI = APIClient.getClient().create(InvoiceAPI.class);
	}
	
	@Override
	public Invoice create(Invoice invoice) {
		Response<Invoice> response;
		try {
			invoice.setStatus(true);
			response = invoiceAPI.create(invoice).execute();
			return response.body();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
