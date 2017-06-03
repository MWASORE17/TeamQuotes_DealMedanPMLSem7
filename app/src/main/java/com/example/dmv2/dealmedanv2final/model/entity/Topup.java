package com.example.dmv2.dealmedanv2final.model.entity;

import java.util.ArrayList;

import static com.example.dmv2.dealmedanv2final.view.activity.ParentActivity.getIDRCurrency;

/**
 * Created by Adlin on 24/05/2017.
 */

public class Topup {
    private int id;
    private String name;
    private double price;
    private int count;

    public static int _id = 1;

    public static ArrayList<Topup> Topups = new ArrayList<>();

    public Topup() {}

    public Topup(String name, double price) {
        this.name = name;
        this.price = price;

        this.id = _id;
        _id++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getIDRPrice() {
        return getIDRCurrency(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
