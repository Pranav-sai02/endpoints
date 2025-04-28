package com.neoteric.endpoints.company;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String state;
    private String street;
    private String houseNumber;
    private String empId;




    public Address() {
    }

    public Address(String state, String street, String houseNumber, String empId) {
        this.state = state;
        this.street = street;
        this.houseNumber = houseNumber;
        this.empId = empId;
    }
}
