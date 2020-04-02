package com.example.betateacher;

public class Student {
    private String FullName, SClass,Phone,uid;

    public Student(String Fullname, String uid){}
    public Student (String FullName, String SClass,String Phone,String uid) {
        this.FullName=FullName;
        this.SClass=SClass;
        this.Phone=Phone;
        this.uid=uid;
    }
    public String getName() {
        return FullName;
    }

    public void setName(String name) {
        this.FullName=FullName;
    }
    public void setPhone(String phone) {
        this.Phone=phone;
    }
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid=uid;
    }
    public String getStudentClass(){
        return SClass;
    }

}