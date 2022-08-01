package com.booking.helpers;

public class Filter {
    private String cityName;
    private Integer capacity;
    private Integer adult;
    private  Integer children;
    private String fromDate;
    private String toDate;

    public Filter() {
    }

    public Filter(String cityName, Integer capacity, Integer adult, Integer children, String fromDate, String toDate) {
        this.cityName = cityName;
        this.capacity = capacity;
        this.adult = adult;
        this.children = children;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getAdult() {
        return adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
