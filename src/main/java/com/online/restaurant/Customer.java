package com.online.restaurant;

public class Customer {
    //To declare a variable
    //datatype variablename;
    private String name;//instance variable
    private String address;//instance variable
    private long phoneNumber;//instance variable
    private String city;//instance variable
    private String state;//instance variable
    private String emailid;//instance variable

    public String getName(){
        return name;
    }

    //getters
    //to get the value of a variable
    //setters
    //to set the value of a variable


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}