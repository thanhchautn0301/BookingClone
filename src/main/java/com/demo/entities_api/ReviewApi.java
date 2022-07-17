package com.demo.entities_api;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ReviewApi {
    private int id;
	private int customer_id;
	private int rate_id;
	private int room_id;
	private String content;
    @JsonFormat(pattern="dd/MM/yyyy")
	private Date ondate;
	private boolean status;
    public ReviewApi(int id, int customer_id, int rate_id, int room_id, String content, Date ondate, boolean status) {
        this.id = id;
        this.customer_id = customer_id;
        this.rate_id = rate_id;
        this.room_id = room_id;
        this.content = content;
        this.ondate = ondate;
        this.status = status;
    }
    public ReviewApi() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public int getRate_id() {
        return rate_id;
    }
    public void setRate_id(int rate_id) {
        this.rate_id = rate_id;
    }
    public int getRoom_id() {
        return room_id;
    }
    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getOndate() {
        return ondate;
    }
    public void setOndate(Date ondate) {
        this.ondate = ondate;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
