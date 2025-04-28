package com.neoteric.endpoints.company;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email {


    private String email;

    public Email(){

    }

    public Email(String email) {
        this.email = email;
    }
}
