package com.booking.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Customer {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    @JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Ho_Chi_Minh")
    private Date dob;
    private String password;
    private String civilIdentity;
    private boolean status;

    public Customer() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCivilIdentity() {
        return civilIdentity;
    }

    public void setCivilIdentity(String civilIdentity) {
        this.civilIdentity = civilIdentity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Customer(Integer id, String name, String email, String phone, Date dob, String password, String civilIdentity, boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.password = password;
        this.civilIdentity = civilIdentity;
        this.status = status;
    }

    
}
