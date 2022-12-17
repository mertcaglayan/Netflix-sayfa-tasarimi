package com.example.netflix;

import java.io.Serializable;

public class Filmler implements Serializable {
    private int id;
    private String ad;
    private String resimad;

    public Filmler(int id, String ad, String resimad) {
        this.id = id;
        this.ad = ad;
        this.resimad = resimad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getResimad() {
        return resimad;
    }

    public void setResimad(String resimad) {
        this.resimad = resimad;
    }
}
