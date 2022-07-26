package com.demo.entities_api;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class StaffApi implements UserDetails {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String civilIdentity;
    private String password;
    @JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Ho_Chi_Minh")
    private Date dob;
    private String address;
    private int role_id;
    private String role_name;
    private Boolean role_status;

    private Boolean status;

    public Boolean getRole_status() {
        return role_status;
    }

    public void setRole_status(Boolean role_status) {
        this.role_status = role_status;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        System.out.println("role_name: "+role_name);
        SimpleGrantedAuthority sGA = new SimpleGrantedAuthority(role_name);
        authorities.add(sGA);
//        System.out.println("Simple granted authority la: "+authorities.get(0).getAuthority().toString());
        return authorities;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
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

    public StaffApi(int id, String name, String phone, String email, String civilIdentity, String password, Date dob, String address, int role_id, String role_name, Boolean status, Boolean role_status) {
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
        this.status = status;
        this.role_status = role_status;
    }
}
