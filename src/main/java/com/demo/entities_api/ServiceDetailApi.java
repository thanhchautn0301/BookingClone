package com.demo.entities_api;

public class ServiceDetailApi {
    private int id;
	private int bookingDetail_id;
	private int service_id;
	private int quantity;
	private String description;
	private boolean status;
    public ServiceDetailApi(int id, int bookingDetail_id, int service_id, int quantity, String description,
            boolean status) {
        this.id = id;
        this.bookingDetail_id = bookingDetail_id;
        this.service_id = service_id;
        this.quantity = quantity;
        this.description = description;
        this.status = status;
    }
    public ServiceDetailApi() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBookingDetail_id() {
        return bookingDetail_id;
    }
    public void setBookingDetail_id(int bookingDetail_id) {
        this.bookingDetail_id = bookingDetail_id;
    }
    public int getService_id() {
        return service_id;
    }
    public void setService_id(int service_id) {
        this.service_id = service_id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
