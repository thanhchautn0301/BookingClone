package com.demo.entities_api;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class CustomerApi implements UserDetails {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    @JsonFormat(pattern = "dd/MM/yyyy",timezone = "Asia/Ho_Chi_Minh")
    private Date dob;
    private String password;
    private String civilIdentity;
    private boolean status;

    public CustomerApi() {
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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        System.out.println("role_name: "+role_name);
        SimpleGrantedAuthority sGA = new SimpleGrantedAuthority("ROLE_CUSTOMER");
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

    public CustomerApi(Integer id, String name, String email, String phone, Date dob, String password, String civilIdentity, boolean status) {
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
