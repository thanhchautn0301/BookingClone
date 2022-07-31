package com.booking.entities;

import java.util.List;

public class AccommodationDetail {
    private List<RoomDetail> rooms;

    private List<Service> services;

    private List<String> images;

    private Accommodation accommodation;

    public AccommodationDetail() {
    }

    public AccommodationDetail(List<RoomDetail> rooms, List<Service> services, List<String> images, Accommodation accommodation) {
        this.rooms = rooms;
        this.services = services;
        this.images = images;
        this.accommodation = accommodation;
    }

    public List<RoomDetail> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomDetail> rooms) {
        this.rooms = rooms;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }
}
