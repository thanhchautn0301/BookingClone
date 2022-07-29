package com.booking.entities;

public class RoomDetail {

    private Integer id;
    private Integer accomodationId;
    private String accomodationName;

    private Integer staff_id;
    private String nameRoom;
    private String descriptionRoom;
    // room type
    private Integer roomTypeId;
    private String nameRoomType;
    private Integer capacity;
    private Integer quantityAdult;
    private Integer quantityChildren;
    private String descriptionRoomType;

    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public RoomDetail() {
    }

    public RoomDetail(Integer id, Integer accomodationId, String accomodationName, Integer staff_id, String nameRoom, String descriptionRoom, Integer roomTypeId, String nameRoomType, Integer capacity, Integer quantityAdult, Integer quantityChildren, String descriptionRoomType, Double price) {
        this.id = id;
        this.accomodationId = accomodationId;
        this.accomodationName = accomodationName;
        this.staff_id = staff_id;
        this.nameRoom = nameRoom;
        this.descriptionRoom = descriptionRoom;
        //
        this.roomTypeId = roomTypeId;
        this.nameRoomType = nameRoomType;
        this.capacity = capacity;
        this.quantityAdult = quantityAdult;
        this.quantityChildren = quantityChildren;
        this.descriptionRoomType = descriptionRoomType;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccomodationId() {
        return accomodationId;
    }

    public void setAccomodationId(Integer accomodationId) {
        this.accomodationId = accomodationId;
    }

    public String getAccomodationName() {
        return accomodationName;
    }

    public void setAccomodationName(String accomodationName) {
        this.accomodationName = accomodationName;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getDescriptionRoom() {
        return descriptionRoom;
    }

    public void setDescriptionRoom(String descriptionRoom) {
        this.descriptionRoom = descriptionRoom;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getNameRoomType() {
        return nameRoomType;
    }

    public void setNameRoomType(String nameRoomType) {
        this.nameRoomType = nameRoomType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getQuantityAdult() {
        return quantityAdult;
    }

    public void setQuantityAdult(Integer quantityAdult) {
        this.quantityAdult = quantityAdult;
    }

    public Integer getQuantityChildren() {
        return quantityChildren;
    }

    public void setQuantityChildren(Integer quantityChildren) {
        this.quantityChildren = quantityChildren;
    }

    public String getDescriptionRoomType() {
        return descriptionRoomType;
    }

    public void setDescriptionRoomType(String descriptionRoomType) {
        this.descriptionRoomType = descriptionRoomType;
    }
}
