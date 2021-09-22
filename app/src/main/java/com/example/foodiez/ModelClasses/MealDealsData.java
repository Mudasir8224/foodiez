package com.example.foodiez.ModelClasses;

public class MealDealsData {

    String foodName;
    String imgUrl = "";

    public MealDealsData(String foodName, String imgUrl) {
        this.foodName = foodName;
        this.imgUrl = imgUrl;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
