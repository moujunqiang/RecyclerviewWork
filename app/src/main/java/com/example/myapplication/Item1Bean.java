package com.example.myapplication;


public class Item1Bean {
    private String school;
    private int imageResId;

    public Item1Bean(String school, int imageResId) {
        this.school = school;
        this.imageResId = imageResId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
