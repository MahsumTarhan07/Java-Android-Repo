package com.example.navigatorcompanet;

import java.io.Serializable;

public class Kisiler implements Serializable {
    private int kisi_no;
    private  String kisi_Ad;

    public Kisiler(int kisi_no, String kisi_Ad) {
        this.kisi_no = kisi_no;
        this.kisi_Ad = kisi_Ad;
    }

    public int getKisi_no() {
        return kisi_no;
    }

    public void setKisi_no(int kisi_no) {
        this.kisi_no = kisi_no;
    }

    public String getKisi_Ad() {
        return kisi_Ad;
    }

    public void setKisi_Ad(String kisi_Ad) {
        this.kisi_Ad = kisi_Ad;
    }
}
