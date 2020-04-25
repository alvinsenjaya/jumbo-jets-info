package com.alvin.jumbojetsinfo.model;

import java.io.Serializable;

public class Aircraft {
    private String name;
    private String detail;
    private int photo;
    private String manufacturer;
    private String country;
    private String price;
    private String seats;
    private String engine;
    private String maxCruiseSpeed;
    private String TravelRange;

    public String getMaxCruiseSpeed() {
        return maxCruiseSpeed;
    }

    public void setMaxCruiseSpeed(String maxCruiseSpeed) {
        this.maxCruiseSpeed = maxCruiseSpeed;
    }

    public String getTravelRange() {
        return TravelRange;
    }

    public void setTravelRange(String travelRange) {
        TravelRange = travelRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

}
