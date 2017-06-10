package com.example.dmv2.dealmedanv2final.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by CM on 5/29/2017.
 */

public class OrderDetail implements Serializable {
    private int id, order_id, deal_id, quantity;
    private double sub_total;

    public static ArrayList<OrderDetail> orders_detail = new ArrayList<OrderDetail>();
    public static int _id = 1;
    public OrderDetail(int order_id, int deal_id, int quantity, double sub_total) {
        this.id = _id;
        this.order_id = order_id;
        //Quantity Should get a number
        this.quantity = quantity;
        this.deal_id = deal_id;
        this.sub_total = sub_total;
        _id++;
    }

    public int getId() {
        return this.id;
    }
    public int getOrder_id() {
        return this.order_id;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public int getDeal_id() {
        return this.deal_id;
    }
    public double getSub_total() {
        return this.sub_total;
    }
}