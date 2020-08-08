package com.example.tourguide;

public class UsersData {
    private String userId;
    private String username;
    private String email;
    private String userType;
    private String mobile;
    private String imageURL;

    public UsersData(String userId, String username, String email, String userType, String mobile, String imageURL) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.userType = userType;
        this.mobile = mobile;
        this.imageURL = imageURL;
    }

    public UsersData() {
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public String getMobile() {
        return mobile;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}
