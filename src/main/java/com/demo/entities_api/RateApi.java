package com.demo.entities_api;

public class RateApi {
	private int id;
	private int point;
	private boolean status;
	
	public RateApi(int id, int point, boolean status) {
		super();
		this.id = id;
		this.point = point;
		this.status = status;
	}
	
	public RateApi(int id, int point) {
		super();
		this.id = id;
		this.point = point;
		
	}
	public RateApi() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
