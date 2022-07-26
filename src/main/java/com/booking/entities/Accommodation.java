package com.booking.entities;

public class Accommodation {
	private Integer id;
	private Integer category_id;
	private String category_name;
	private Integer city_id;
	private String city_name;
	private Integer staff_id;
	private String name;
	private boolean status;
	private String image;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Integer getCity_id() {
		return city_id;
	}
	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public Integer getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
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
	public Accommodation(Integer id, Integer category_id, String category_name, Integer city_id, String city_name,
						   Integer staff_id, String name, boolean status, String image, String description) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.category_name = category_name;
		this.city_id = city_id;
		this.city_name = city_name;
		this.staff_id = staff_id;
		this.name = name;
		this.status = status;
		this.image = image;
		this.description = description;
	}

	public Accommodation(Integer id,String category_name, String city_name, String name, boolean status, String image, String description) {
		super();
		this.id = id;
		this.category_name = category_name;
		this.city_name = city_name;
		this.name = name;
		this.status = status;
		this.image = image;
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Accommodation() {

	}

}
