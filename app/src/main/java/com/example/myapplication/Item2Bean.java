package com.example.myapplication;


public class Item2Bean {
    private String school;
    private int imageResId;
    private String count;

    public Item2Bean(String school, int imageResId, String count) {
        this.school = school;
        this.imageResId = imageResId;
        this.count = count;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Item2Bean(String school, int imageResId) {
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
