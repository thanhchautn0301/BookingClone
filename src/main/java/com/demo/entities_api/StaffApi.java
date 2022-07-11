package com.demo.entities_api;

import com.demo.entities.Role;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class StaffApi {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String civilIdentity;
    private String password;
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dob;
    private String address;
    private int role_id;
    private String role_name;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCivilIdentity() {
        return civilIdentity;
    }

    public void setCivilIdentity(String civilIdentity) {
        this.civilIdentity = civilIdentity;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public StaffApi() {
    }

    public StaffApi(int id, String name, String phone, String email, String civilIdentity, String password, Date dob, String address, int role_id, String role_name) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.civilIdentity = civilIdentity;
        this.password = password;
        this.dob = dob;
        this.address = address;
        this.role_id = role_id;
        this.role_name = role_name;
    }
}
