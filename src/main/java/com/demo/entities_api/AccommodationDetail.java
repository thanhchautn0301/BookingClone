package com.demo.entities_api;

import java.util.List;

public class AccommodationDetail {
    private List<RoomDetail> rooms;

    private List<ServiceApi> services;

    private List<String> images;

    private AccomodationApi accommodation;

    public AccommodationDetail() {
    }

    public AccommodationDetail(List<RoomDetail> rooms, List<ServiceApi> services, List<String> images, AccomodationApi accommodation) {
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

    public List<ServiceApi> getServices() {
        return services;
    }

    public void setServices(List<ServiceApi> services) {
        this.services = services;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public AccomodationApi getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(AccomodationApi accommodation) {
        this.accommodation = accommodation;
    }
}
