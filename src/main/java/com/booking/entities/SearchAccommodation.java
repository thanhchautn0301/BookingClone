package com.booking.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchAccommodation {
    @SerializedName("accomodationQuantity")
    private int result;
    @SerializedName("accomodations")
    private List<Accommodation> accommodations;

    public SearchAccommodation(int accommodationQuantity, List<Accommodation> accommodations) {
        this.result = accommodationQuantity;
        this.accommodations = accommodations;
    }

    public SearchAccommodation() {
    }

    public int getAccommodationQuantity() {
        return result;
    }

    public void setAccommodationQuantity(int accommodationQuantity) {
        this.result = accommodationQuantity;
    }

    public List<Accommodation> getAccommodations() {
        return accommodations;
    }

    public void setAccommodations(List<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }
}
