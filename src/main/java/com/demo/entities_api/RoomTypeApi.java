package com.demo.entities_api;

public class RoomTypeApi {
    private Integer id;
    private String name;
    private Integer capacity;
    private Integer quantityAdult;
    private Integer quantityChildren;
    private String description;
    private boolean status;
    private int staffId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getQuantityAdult() {
        return quantityAdult;
    }

    public void setQuantityAdult(Integer quantityAdult) {
        this.quantityAdult = quantityAdult;
    }

    public Integer getQuantityChildren() {
        return quantityChildren;
    }

    public void setQuantityChildren(Integer quantityChildren) {
        this.quantityChildren = quantityChildren;
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

    public int getStaffId() {
        return staffId;
    }

    public RoomTypeApi(Integer id, String name, Integer capacity, Integer quantityAdult, Integer quantityChildren, String description, boolean status, int staffId) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.quantityAdult = quantityAdult;
        this.quantityChildren = quantityChildren;
        this.description = description;
        this.status = status;
        this.staffId = staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public RoomTypeApi() {
    }
}
