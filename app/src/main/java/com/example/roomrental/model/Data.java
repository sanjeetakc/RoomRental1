package com.example.roomrental.model;

import java.io.Serializable;

/**
 * Hold individual data of a room with its location
 */

public class Data implements Serializable {
    private String ownerName;
    private int room_image;
    private String location;
    private int profile;
    private double price;

    public Data(){}

    public Data(String ownerName, int room_image, String location, int profile, double price) {
        this.ownerName = ownerName;
        this.room_image = room_image;
        this.location = location;
        this.profile = profile;
        this.price = price;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getRoom_image() {
        return room_image;
    }

    public void setRoom_image(int room_image) {
        this.room_image = room_image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Data{" +
                "ownerName='" + ownerName + '\'' +
                ", room_image=" + room_image +
                ", location='" + location + '\'' +
                ", profile=" + profile +
                ", price=" + price +
                '}';
    }
}
