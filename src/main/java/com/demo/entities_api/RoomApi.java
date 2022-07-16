package com.demo.entities_api;

import com.demo.entities.Accomodation;
import com.demo.entities.RoomType;

public class RoomApi {
    private Integer id;

    public RoomApi(Integer id, Integer accomodation_id, Integer roomType_id, String name, String description, boolean status, double price) {
        this.id = id;
        this.accomodation_id = accomodation_id;
        this.roomType_id = roomType_id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.price = price;
    }

    private Integer accomodation_id;
    private Integer roomType_id;
    private String name;
    private String description;

    public RoomApi() {
    }

    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccomodation_id() {
        return accomodation_id;
    }

    public void setAccomodation_id(Integer accomodation_id) {
        this.accomodation_id = accomodation_id;
    }

    public Integer getRoomType_id() {
        return roomType_id;
    }

    public void setRoomType_id(Integer roomType_id) {
        this.roomType_id = roomType_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
}
