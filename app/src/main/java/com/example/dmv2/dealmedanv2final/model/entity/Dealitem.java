package com.example.dmv2.dealmedanv2final.model.entity;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by CM on 5/29/2017.
 */

public class Dealitem {
    private int id, diskon, stock;
    private String nama, tempat, image, info, hl, code;
    private double harga;
    private Date date_start, date_expired;
    public static int _id = 1;
    public static ArrayList<Dealitem> dealitems = new ArrayList<>();
    public Dealitem() {

    }
    public Dealitem(String nama, String tempat,  double harga, int diskon, String image, String info, String hl, int stock, String code) {
    //public Dealitem(String nama, String tempat,  double harga, int diskon, String image, String info, String hl, int stock, Date date_start, Date date_expired, String code) {
        this.id = _id;
        this.nama = nama;
        this.tempat = tempat;
        this.harga = harga;
        this.diskon = diskon;
        this.image = image;
        this.info = info;
        this.hl = hl;
        this.stock = stock;
//        this.date_start = date_start;
//        this.date_expired = date_expired;
        this.code = code;
        _id++;
    }

    public int getId() {
        return this.id;
    }
    public String getNama() {
        return this.nama;
    }
    public String getTempat() {
        return this.tempat;
    }
    public double getHarga() {
        return this.harga;
    }
    public double getHargaDiskon() {
        return this.harga - (this.getHarga() * this.diskon);
    }
    public int getDiskon() {
        return this.diskon;
    }
    public String getImage() {
        return this.image;
    }
    public String getInfo() {
        return this.info;
    }
    public String hl() {
        return this.hl;
    }
    public int getStock() {
        return this.stock;
    }
    public Date getDate_expired() {
        return this.date_expired;
    }
    public Date getDate_start() {
        return this.date_start;
    }


}
