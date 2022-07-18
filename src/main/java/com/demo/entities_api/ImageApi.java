package com.demo.entities_api;

public class ImageApi {
    private int id;
	private int accomodation_id;
	private int room_id;
	private String name;
	private boolean status;

    public ImageApi(int id, int accomodation_id, int room_id, String name, boolean status) {
        this.id = id;
        this.accomodation_id = accomodation_id;
        this.room_id = room_id;
        this.name = name;
        this.status = status;
    }

    public ImageApi() {
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

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
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
