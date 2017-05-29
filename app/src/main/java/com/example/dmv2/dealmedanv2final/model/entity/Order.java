package com.example.dmv2.dealmedanv2final.model.entity;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by CM on 5/29/2017.
 */

public class Order {
    private int id, tipe, quantity, status, payment_method_id;
    private String code;
//    private String nama, image, info, hl, code;
    private double sub_total, total;
    private Date date_start, date_expired;
    public static int _id = 1;
    private ArrayList<Order> orders= new ArrayList<Order>();
    public Order(int tipe, double sub_total, double total, int quantity, int status, int payment_method_id, Date date_start, Date date_expired, String code) {
        this.id = _id;
        this.tipe = tipe;
        this.sub_total = sub_total;
        this.total = total;
        this.quantity = quantity;
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
    public double getSub_total() {
        return this.sub_total;
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
}
