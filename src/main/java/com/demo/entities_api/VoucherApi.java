package com.demo.entities_api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class VoucherApi {
	
	private int id;
	private int accomodation_id;
	private String name;
	private Double priceDiscount;
	@JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Ho_Chi_Minh")
	private Date expDate;
	private boolean status;
	public VoucherApi(int id, int accomodation_id, Double priceDiscount, Date expDate, boolean status,String name) {
		super();
		this.id = id;
		this.accomodation_id = accomodation_id;
		this.priceDiscount = priceDiscount;
		this.expDate = expDate;
		this.status = status;
		this.name = name;
	}
	public VoucherApi() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccomodation_id() {
		return accomodation_id;
	}
	public void setAccomodation_id(int accomodation_id) {
		this.accomodation_id = accomodation_id;
	}
	public Double getPriceDiscount() {
		return priceDiscount;
	}
	public void setPriceDiscount(Double priceDiscount) {
		this.priceDiscount = priceDiscount;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
