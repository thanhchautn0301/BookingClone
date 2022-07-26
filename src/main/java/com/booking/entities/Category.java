package com.booking.entities;



public class Category {
    private int id;

    public Category(int id, String name, boolean status, String image) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.image = image;
    }

    
    private String name;

    public Category() {
    }

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
}
