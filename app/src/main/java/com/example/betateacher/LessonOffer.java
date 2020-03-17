package com.example.betateacher;

public class LessonOffer {
    private String Location, Subject, price, Date;


    public LessonOffer() {
    }

    public LessonOffer(String Location, String Subject, String price) {
        this.Location = Location;
        this.Subject = Subject;
        this.price = price;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public String getprice() {
        return price;
    }

    public void setprice(String price) {
        this.price = price;
    }
}