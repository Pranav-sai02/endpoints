package com.neoteric.endpoints.company;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Certificates {

    private String certificate;

    public Certificates(){

    }

    public Certificates(String certificate) {
        this.certificate = certificate;
    }
}
