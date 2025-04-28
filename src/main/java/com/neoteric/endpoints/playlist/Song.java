package com.neoteric.endpoints.playlist;

import java.util.List;

public class Song {

    String band;

    String song;

    List<Singer> members ;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public List<Singer> getMembers() {
        return members;
    }

    public void setMembers(List<Singer> members) {
        this.members = members;
    }
}

