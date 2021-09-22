package com.example.foodiez.ModelClasses;

public class MostPopularData {

    String hotelName;
    String imgUrl = "";

    public MostPopularData(String hotelName, String imgUrl) {
        this.hotelName = hotelName;
        this.imgUrl = imgUrl;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
