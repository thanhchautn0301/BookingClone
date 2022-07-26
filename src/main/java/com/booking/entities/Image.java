package com.booking.entities;



public class Image {
	private Integer id;
	private Integer accomodation_id;
	private Integer room_id;
	private String name;
	private boolean status;
	
	
	
	
	public Image() {
		super();
	}
	public Image(Integer id, Integer accomodation_id, Integer room_id, String name, boolean status) {
		super();
		this.id = id;
		this.accomodation_id = accomodation_id;
		this.room_id = room_id;
		this.name = name;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccommodation_id() {
		return accomodation_id;
	}
	public void setAccommodation_id(Integer accommodation_id) {
		this.accomodation_id = accommodation_id;
	}
	public Integer getRoom_id() {
		return room_id;
	}
	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
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
	
	
	
}
