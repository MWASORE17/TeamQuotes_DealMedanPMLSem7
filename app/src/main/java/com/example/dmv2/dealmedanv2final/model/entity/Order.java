package com.example.dmv2.dealmedanv2final.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import static com.example.dmv2.dealmedanv2final.view.activity.ParentActivity.getIDRCurrency;

/**
 * Created by CM on 5/29/2017.
 */

public class Order implements Serializable{
    private int id, tipe, user_id, payment_method_id;
    private String code, sales_id;
//    private String nama, image, info, hl, code;
    private double total;
    private Date date_start, date_expired;
    private static int _id = 1;
    private int status, quantity;
    public static ArrayList<Order> orders= new ArrayList<>();
    public Order(int tipe, int user_id, double total, int status, int payment_method_id, Date date_start, Date date_expired, String code, String sales_id) {
        this.id = _id;
        this.user_id = user_id;
        this.tipe = tipe;
        this.total = total;
        this.date_start = date_start;
        this.date_expired = date_expired;
        this.code = code;
        this.status = status;
        this.sales_id = sales_id;
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
    public void setSalesId(String kode) {
        this.sales_id = kode;
    }
    public void setStatus(int val) {this.status = val;}
    public String getSalesId() {
        return this.sales_id;
    }
    public String getCodeConfirm() {
        return this.code;
    }
}
