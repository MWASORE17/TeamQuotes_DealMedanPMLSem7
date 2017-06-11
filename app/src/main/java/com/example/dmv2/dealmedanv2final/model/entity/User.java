package com.example.dmv2.dealmedanv2final.model.entity;

import java.util.ArrayList;
import static com.example.dmv2.dealmedanv2final.view.activity.ParentActivity.getIDRCurrency;
/**
 * Created by CM on 4/30/2017.
 */

public class User {
    private int id;
    private String name;
    private String email;
    private String bio;
    private String password;
    private static double wallet;

    public static int _id = 1;

    public static ArrayList<User> users = new ArrayList<>();

    public User() {}

    public User(String name, String email, String password, double wallet) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.wallet = wallet;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addWallet(double val) {
        this.wallet += val;
    }

    public void subWallet(double val) {
        this.wallet -= val;
    }

    public boolean validating_zero(double val) {
        if((this.wallet-val)<0) {
            return true;
        }
        return false;
    }

    public double getWallet() {
        return this.wallet;
    }

    public String getIDRWallet() {
        return getIDRCurrency(this.getWallet());
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
