package com.demo.entities_api;

import com.demo.entities.Staff;

import java.util.List;

public class RoleApi {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public RoleApi() {
    }

    public RoleApi(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
