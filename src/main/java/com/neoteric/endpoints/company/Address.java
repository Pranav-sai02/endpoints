package com.neoteric.endpoints.company;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String state;
    private String street;
    private String houseNumber;





    public Address() {
    }

    public Address(String state, String street, String houseNumber) {
        this.state = state;
        this.street = street;
        this.houseNumber = houseNumber;
    }
}
