package com.neoteric.endpoints.springdemo;

public class Address {


    String state;
    String street;
    String roadnumber;

    public Address(){

    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRoadnumber() {
        return roadnumber;
    }

    public void setRoadnumber(String roadnumber) {
        this.roadnumber = roadnumber;
    }

    public Address(String state, String street, String roadnumber) {
        this.state = state;
        this.street = street;
        this.roadnumber = roadnumber;
    }
}
