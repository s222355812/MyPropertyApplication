package com.example.mypropertyapplication;

public class Property {
    private String name;
    private String imageUrl;
    private String address;
    private String description;

    public Property(String name, String imageUrl, String address, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.address = address;
        this.description = description;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}