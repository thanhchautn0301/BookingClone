package com.demo.entities_api;

public class AccommodationOfCityApi {

	private int id;
	private String name;
	private boolean status;
	private long numberOfAccommodation;

	
	public AccommodationOfCityApi(int id, String name, boolean status, long numberOfAccommodation) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.numberOfAccommodation = numberOfAccommodation;
	}
	
	public AccommodationOfCityApi() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public long getNumberOfAccommodation() {
		return numberOfAccommodation;
	}
	public void setNumberOfAccommodation(long numberOfAccommodation) {
		this.numberOfAccommodation = numberOfAccommodation;
	}
	
	
	
	
}
