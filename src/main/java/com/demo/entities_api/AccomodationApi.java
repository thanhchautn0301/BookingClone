package com.demo.entities_api;

import com.demo.entities.Category;
import com.demo.entities.City;
import com.demo.entities.Staff;

public class AccomodationApi {
    private Integer id;
    private Integer category_id;
    private Integer city_id;
    private Integer staff_id;
    private String name;
    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
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

    public AccomodationApi() {
    }

    public AccomodationApi(Integer id, Integer category_id, Integer city_id, Integer staff_id, String name, boolean status) {
        this.id = id;
        this.category_id = category_id;
        this.city_id = city_id;
        this.staff_id = staff_id;
        this.name = name;
        this.status = status;
    }
}
