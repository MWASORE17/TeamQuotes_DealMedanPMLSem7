package com.example.dmv2.dealmedanv2final.model.entity;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by CM on 5/29/2017.
 */

public class Payment {
    private int id, order_id, payment_id;
    private double total;
    private Date date_insert;
    public static int _id = 1;
    private ArrayList<Payment> payments = new ArrayList<Payment>();

    public Payment(int order_id, int payment_id, double total, Date date_insert) {
        this.id = _id;
        this.order_id = order_id;
        this.total = total;
        this.date_insert = date_insert;
        _id++;
    }

    public int getId() {
        return this.id;
    }
    public int getOrder_id() {
        return this.order_id;
    }
    public int getPayment_id() {
        return this.payment_id;
    }
    public double getTotal() {
        return this.total;
    }
    public Date getDate_insert() {
        return this.date_insert;
    }
}
