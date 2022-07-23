package com.demo.entities_api;

import com.demo.entities.Accomodation;
import com.demo.entities.RoomType;

public class RoomApi {
    private Integer id;
    private Integer accomodation_id;
    private String accomodation_name;
    private Integer roomType_id;
    private String roomType_name;
    private Integer staff_id;
    private String name;
    private String description;

    public RoomApi() {
    }

    private boolean status;

    
  

	public RoomApi(Integer id, Integer accomodation_id, String accomodation_name, Integer roomType_id,
			String roomType_name, Integer staff_id, String name, String description, boolean status, double price) {
		super();
		this.id = id;
		this.accomodation_id = accomodation_id;
		this.accomodation_name = accomodation_name;
		this.roomType_id = roomType_id;
		this.roomType_name = roomType_name;
		this.staff_id = staff_id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.price = price;
	}

	public String getAccomodation_name() {
		return accomodation_name;
	}

	public void setAccomodation_name(String accomodation_name) {
		this.accomodation_name = accomodation_name;
	}

	public String getRoomType_name() {
		return roomType_name;
	}

	public void setRoomType_name(String roomType_name) {
		this.roomType_name = roomType_name;
	}

	public Integer getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccomodation_id() {
        return accomodation_id;
    }

    public void setAccomodation_id(Integer accomodation_id) {
        this.accomodation_id = accomodation_id;
    }

    public Integer getRoomType_id() {
        return roomType_id;
    }

    public void setRoomType_id(Integer roomType_id) {
        this.roomType_id = roomType_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
}
