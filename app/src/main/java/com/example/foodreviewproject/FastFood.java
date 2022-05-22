package com.example.foodreviewproject;

public class FastFood {
    String ff_name, ff_price, ff_material, ff_method, ff_location;
    int imageId;
    double   locateX, locateY;


    public FastFood(String ff_name, String ff_price, String ff_material, String ff_method, String ff_location, int imageId, double locateX, double locateY) {
        this.ff_name = ff_name;
        this.ff_price = ff_price;
        this.ff_material = ff_material;
        this.ff_method = ff_method;
        this.ff_location = ff_location;
        this.imageId = imageId;
        this.locateX = locateX;
        this.locateY = locateY;
    }
}
