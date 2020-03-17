package com.example.betateacher;

public class Order {
    private String orderLocation, time, date;
    private Student student;
    private LessonOffer lo;

    public Order() {
    }

    public Order(String orderLocation, String date, Student student, LessonOffer lo) {

        this.orderLocation = orderLocation;
        this.date = date;
        this.student = student;
        this.lo = lo;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setorderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    public String getdate() {
        return date;
    }

    public void setdate(String orderLocaion) {
        this.date = date;
    }




}