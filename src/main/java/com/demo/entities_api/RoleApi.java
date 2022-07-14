package com.demo.entities_api;

public class RoleApi {
    private Integer id;
    private String name;
    private Boolean status;

    public Integer getId() {
        return id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public RoleApi() {
    }

    public RoleApi(Integer id, String name,Boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
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
