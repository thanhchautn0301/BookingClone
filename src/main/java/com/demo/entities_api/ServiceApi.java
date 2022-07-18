package com.demo.entities_api;


public class ServiceApi {
	private int id;
	private int accomodation_id;
	private String name;
	private double price;
	private String iconCanvas;
	private boolean status;
	public ServiceApi(int id, int accomodation_id, String name, double price, String iconCanvas, boolean status) {
		super();
		this.id = id;
		this.accomodation_id = accomodation_id;
		this.name = name;
		this.price = price;
		this.iconCanvas = iconCanvas;
		this.status = status;
	}
	public ServiceApi() {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getIconCanvas() {
		return iconCanvas;
	}
	public void setIconCanvas(String iconCanvas) {
		this.iconCanvas = iconCanvas;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
