package com.example.dmv2.dealmedanv2final.model.entity;

import java.util.ArrayList;

/**
 * Created by CM on 5/29/2017.
 */

public class PaymentMethod {
    private int id;
    private String name_method;
    private ArrayList<PaymentMethod> paymentMethods= new ArrayList<PaymentMethod>();

    public PaymentMethod(int id, String name_method) {
        this.id = id;
        this.name_method = name_method;
    }
    public int getId() {
        return this.id;
    }
    public String getName_method() {
        return this.name_method;
    }
}
