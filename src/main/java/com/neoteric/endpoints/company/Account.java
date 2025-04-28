package com.neoteric.endpoints.company;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    String accountType;

    String accountNumber;

    public Account(){

    }

    public Account(String accountType, String accountNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }
}
