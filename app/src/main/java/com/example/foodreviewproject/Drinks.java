package com.example.foodreviewproject;

public class Drinks {

    String drinks_name, drinks_price, drinks_material, drinks_location, drinks_method;
    int imageId;
    double   locateX, locateY;

    public Drinks(String drinks_name, String drinks_price, String drinks_material, String drinks_location, String drinks_method, int imageId,double locateX,double locateY) {
        this.drinks_name = drinks_name;
        this.drinks_price = drinks_price;
        this.drinks_material = drinks_material;
        this.imageId = imageId;
        this.drinks_location = drinks_location;
        this.drinks_method = drinks_method;
        this.locateX = locateX;
        this.locateY = locateY;
    }
}
