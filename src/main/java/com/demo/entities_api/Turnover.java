package com.demo.entities_api;

import java.util.Date;

public class Turnover {
    private Integer nameInvoice;
    private String nameRoom;
    private String nameAccommodation;
    private Double price;
    private Date dateBooking;

    public Turnover(Integer nameInvoice, String nameRoom, String nameAccommodation, Double price, Date dateBooking) {
        this.nameInvoice = nameInvoice;
        this.nameRoom = nameRoom;
        this.nameAccommodation = nameAccommodation;
        this.price = price;
        this.dateBooking = dateBooking;
    }

    public Turnover() {
    }

    public Integer getNameInvoice() {
        return nameInvoice;
    }

    public void setNameInvoice(Integer nameInvoice) {
        this.nameInvoice = nameInvoice;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getNameAccommodation() {
        return nameAccommodation;
    }

    public void setNameAccommodation(String nameAccommodation) {
        this.nameAccommodation = nameAccommodation;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(Date dateBooking) {
        this.dateBooking = dateBooking;
    }
}
