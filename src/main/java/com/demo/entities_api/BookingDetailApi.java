package com.demo.entities_api;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class BookingDetailApi {
    private Integer id;
    private Integer bookingId;
    private Integer roomId;
    private Integer quantityAdult;
    private Integer quantityChildren;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date checkin;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date checkout;
    private boolean status;

    public Integer getId() {
        return id;
    }

    public BookingDetailApi(Integer id, Integer bookingId, Integer roomId, Integer quantityAdult, Integer quantityChildren, Date checkin, Date checkout, boolean status) {
        this.id = id;
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.quantityAdult = quantityAdult;
        this.quantityChildren = quantityChildren;
        this.checkin = checkin;
        this.checkout = checkout;
        this.status = status;
    }

    public BookingDetailApi() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
