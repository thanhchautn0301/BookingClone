package com.booking.entities;

public class City {
	private int id;
	private String name;
	private boolean status;

	private String image;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
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
	public City(int id, String name, boolean status, String image) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.image = image;
	}
	public City() {}
	
}
