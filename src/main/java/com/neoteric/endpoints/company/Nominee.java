package com.neoteric.endpoints.company;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Nominee {

    private String nomineeName;
    private int nomineeAge;
    private long nomineeNumber;
    private String relationToEmployee;

    public Nominee(){

    }

    public Nominee(String nomineeName, int nomineeAge, long nomineeNumber, String relationToEmployee) {
        this.nomineeName = nomineeName;
        this.nomineeAge = nomineeAge;
        this.nomineeNumber = nomineeNumber;
        this.relationToEmployee = relationToEmployee;
    }

}
