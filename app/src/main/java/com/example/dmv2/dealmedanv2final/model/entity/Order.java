package com.example.dmv2.dealmedanv2final.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import static com.example.dmv2.dealmedanv2final.view.activity.ParentActivity.getIDRCurrency;

/**
 * Created by CM on 5/29/2017.
 */

public class Order implements Serializable{
    private int id, tipe, user_id, quantity, status, payment_method_id;
    private String code;
//    private String nama, image, info, hl, code;
    private double total;
    private Date date_start, date_expired;
    public static int _id = 1;
    public static ArrayList<Order> orders= new ArrayList<>();
    public Order(int tipe, int user_id, double total, int status, int payment_method_id, Date date_start, Date date_expired, String code) {
        this.id = _id;
        this.user_id = user_id;
        this.tipe = tipe;
        this.total = total;
        this.date_start = date_start;
        this.date_expired = date_expired;
        this.code = code;
        this.status = status;
        this.payment_method_id = payment_method_id;
        _id++;
    }

    public int getId() {
        return this.id;
    }
    public int getTipe() {
        return this.tipe;
    }
    public double getTotal() {
        return this.total;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public int getStatus() {
        return this.status;
    }
    public int getPayment_method_id() {
        return this.payment_method_id;
    }
    public Date getDate_expired() {
        return this.date_expired;
    }
    public Date getDate_start() {
        return this.date_start;
    }
    public String getTotalIdr() {
        return getIDRCurrency(getTotal());
    }
}
