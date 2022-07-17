package com.demo.entities_api;

import com.demo.entities.Customer;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class BookingApi {
    private Integer id;

    public BookingApi(Integer id, Integer customer_id, Date dateBooking, String payment, boolean status) {
        this.id = id;
        this.customer_id = customer_id;
        this.dateBooking = dateBooking;
        this.payment = payment;
        this.status = status;
    }

    private Integer customer_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Date getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(Date dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BookingApi() {
    }
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateBooking;
    private String payment;
    private boolean status;
}
