package com.example.foodreviewproject;

public class Foods {

    String foods_name, foods_price, foods_material, foods_method, foods_location;
    int imageId;
    double locateX,locateY;

    public Foods(String foods_name, String foods_price, String foods_material, String foods_method, String foods_location, int imageId, double locateX, double locateY) {
        this.foods_name = foods_name;
        this.foods_price = foods_price;
        this.foods_material = foods_material;
        this.foods_method = foods_method;
        this.foods_location = foods_location;
        this.imageId = imageId;
        this.locateX = locateX;
        this.locateY = locateY;
    }
}