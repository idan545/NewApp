package com.example.betateacher;

public class Teacher {
    private String FullName, SClass,Pic,Phone,uid,Experience,About;

    public Teacher(String Fullname, String uid){}
    public Teacher (String FullName,String Phone,String Experience,String About,String uid) {
        this.FullName=FullName;
        this.Phone=Phone;
        this.Experience=Experience;
        this.uid=uid;
        this.About=About;

    }
    public String getName() {
        return FullName;
    }

    public void setName(String FullName) {
        this.FullName=FullName;
    }
    public void setPhone(String phone) {
        this.Phone=phone;
    }
    public String getUid() {
        return uid;
    }
    public void setAbout(String About){
        this.About=About;
    }
    public String getAbout(){
        return About;
    }
    public void setExperience(String Experience){
        this.Experience=Experience;
    }
    public String getExperience(){
        return Experience;
    }

    public void setUid(String uid) {
        this.uid=uid;
    }

}