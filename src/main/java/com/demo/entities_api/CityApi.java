package com.demo.entities_api;

public class CityApi {

	private int id;
	private String name;
	private boolean status;
	private String image;
	private boolean home;
	
	
	
	public CityApi(int id, String name, boolean status, String image, boolean home) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.image = image;
		this.home = home;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isHome() {
		return home;
	}

	public void setHome(boolean home) {
		this.home = home;
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
	
	public CityApi(int id, String name, boolean status, String image) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.image = image;
	}
	
	public CityApi(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CityApi() {
		super();
	}
	
	
}
