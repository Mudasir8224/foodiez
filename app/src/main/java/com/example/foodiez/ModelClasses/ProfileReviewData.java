package com.example.foodiez.ModelClasses;

public class ProfileReviewData {

    String profileName;
    String imgUrl = "";

    public ProfileReviewData(String profileName, String imgUrl) {
        this.profileName = profileName;
        this.imgUrl = imgUrl;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
