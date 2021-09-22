package com.example.foodiez.ModelClasses;

public class PhotoData {

    String foodCategory;
    String imgUrl = "";

    public PhotoData(String foodCategory, String imgUrl) {
        this.foodCategory = foodCategory;
        this.imgUrl = imgUrl;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
