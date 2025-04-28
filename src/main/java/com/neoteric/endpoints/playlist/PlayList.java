package com.neoteric.endpoints.playlist;

public class PlayList {

    String volume;

    Song current;

    Song next;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Song getCurrent() {
        return current;
    }

    public void setCurrent(Song current) {
        this.current = current;
    }

    public Song getNext() {
        return next;
    }

    public void setNext(Song next) {
        this.next = next;
    }
}
