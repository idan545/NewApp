package com.example.betateacher;

public class Student {
    private String name, SClass,Phone,uid;

    public Student(){}
    public Student (String FullName, String SClass,String Phone,String uid) {
        this.name=FullName;
        this.SClass=SClass;
        this.Phone=Phone;
        this.uid=uid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setPhone(String phone) {
        this.Phone=phone;
    }
    public String getPhone() {
        return Phone;
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
    public void setStudentClass(){
        this.SClass=SClass;
    }

}