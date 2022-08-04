package com.demo.entities_api;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class DetailInvoiceApi {
    @JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Ho_Chi_Minh")
    private Date checkin;
    @JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Ho_Chi_Minh")
    private Date checkout;
    private int adultQuantity;
    private int childrenQuantity;
    private String roomName;
    private String accomName;

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int getAdultQuantity() {
        return adultQuantity;
    }

    public void setAdultQuantity(int adultQuantity) {
        this.adultQuantity = adultQuantity;
    }

    public int getChildrenQuantity() {
        return childrenQuantity;
    }

    public void setChildrenQuantity(int childrenQuantity) {
        this.childrenQuantity = childrenQuantity;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getAccomName() {
        return accomName;
    }

    public void setAccomName(String accomName) {
        this.accomName = accomName;
    }

    public DetailInvoiceApi(Date checkin, Date checkout, int adultQuantity, int childrenQuantity, String roomName, String accomName) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.adultQuantity = adultQuantity;
        this.childrenQuantity = childrenQuantity;
        this.roomName = roomName;
        this.accomName = accomName;
    }

    public DetailInvoiceApi() {
        super();
    }
}
