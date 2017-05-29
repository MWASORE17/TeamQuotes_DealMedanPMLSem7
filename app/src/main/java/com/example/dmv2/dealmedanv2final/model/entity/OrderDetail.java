package com.example.dmv2.dealmedanv2final.model.entity;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by CM on 5/29/2017.
 */

public class OrderDetail{
    private int id, order_id, deal_id, topup_id;
    private double sub_total;

    private ArrayList<OrderDetail> orders_detail = new ArrayList<OrderDetail>();
    public static int _id = 1;
    public OrderDetail(int order_id, int deal_id, int topup_id, double sub_total) {
        this.id = _id;
        this.order_id = order_id;
        this.deal_id = deal_id;
        this.topup_id = topup_id;
        this.sub_total = sub_total;
        _id++;
    }

    public int getId() {
        return this.id;
    }
    public int getOrder_id() {
        return this.order_id;
    }
    public int getDeal_id() {
        return this.deal_id;
    }
    public int getTopup_id() {
        return this.topup_id;
    }
    public double getSub_total() {
        return this.sub_total;
    }
}