package com.example.dmv2.dealmedanv2final.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static com.example.dmv2.dealmedanv2final.view.activity.ParentActivity.getIDRCurrency;

/**
 * Created by CM on 5/29/2017.
 */

public class Dealitem implements Serializable{
    private int id, diskon;
    private String nama, tempat, info, hl, code, kategori;
    private double harga;
    private Date date_start, date_expired;
    public static int _id = 1;
    public int image;
    private int stock;
    public static ArrayList<Dealitem> dealitems = new ArrayList<>();

    public Dealitem(String nama, String tempat,
                    double harga, int diskon,
                    int image, int stock, String code,
                    Date date_start, Date date_expired,
                    String info, String hl, String kategori) {
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
        this.date_start = date_start;
        this.date_expired = date_expired;
        this.code = code;
        this.kategori = kategori;
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
    public String getIDRHarga() {
        return  getIDRCurrency(this.harga);
    }
    public double getHargaDiskon() {
        double dblDiskon = Double.parseDouble(String.valueOf(this.diskon)) / 100;
        return this.harga - (this.harga * dblDiskon);
    }
    public String getIDRHargaDiskon() {
        return  getIDRCurrency(getHargaDiskon());
    }
    public int getDiskon() {
        return this.diskon;
    }
    public int getImage() {
        return this.image;
    }
    public String getInfo() {
        return this.info;
    }
    public String getHl() {
        return this.hl;
    }
    public int getStock() {
        return this.stock;
    }
    public void subStock(int val) { this.stock-= val;}
    public Date getDate_expired() {
        return this.date_expired;
    }
    public Date getDate_start() {
        return this.date_start;
    }
    public String getKategori() {return this.kategori;}
    public void setName(String name) {this.nama = name;}

    public static ArrayList<Double> getCollectHarga(){
        ArrayList<Double> list = new ArrayList<Double>();
        for (Dealitem d : dealitems) {
            list.add(d.harga);
        }
        return list;
    }

    public static Double getMin (ArrayList<Double> list){
        return Math.floor(Collections.<Double>min(list));
    }

    public static Double getMax (ArrayList<Double> list){
        return Math.ceil(Collections.<Double>max(list));
    }


}
