package com.booking.entities;

public class AccommodationOfCity {

	private int id;
	private String name;
	private boolean status;
	private long numberOfAccommodation;
	private String image;

	
	public AccommodationOfCity() {
	}
	public AccommodationOfCity(int id, String name, boolean status, long numberOfAccommodation, String image) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.numberOfAccommodation = numberOfAccommodation;
		this.image = image;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
