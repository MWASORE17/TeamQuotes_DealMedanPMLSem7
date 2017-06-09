package com.example.dmv2.dealmedanv2final.model.entity;

import java.util.Date;

import static com.example.dmv2.dealmedanv2final.model.entity.Topup.Topups;
import static com.example.dmv2.dealmedanv2final.model.entity.Dealitem.dealitems;
import static com.example.dmv2.dealmedanv2final.model.entity.User.*;

/**
 * Created by Adlin on 27/05/2017.
 */

public class DummyData {
    public static void initDataUser(){
        User a = new User("STMIK - Mikroskil Medan", "a@mobile.id", "password");
        User b = new User("Kampus A", "b@mobile.id", "password");
        User c = new User("Kampus B", "c@mobile.id", "password");
        User d = new User("Kampus C", "d@mobile.id", "password");
        User e = new User("Kampus D - Thamrin Plaza", "e@mobile.id", "password");
        User f = new User("f", "f@mobile.id", "password");
        User g = new User("g", "g@mobile.id", "password");
        User h = new User("h", "h@mobile.id", "password");
        User i = new User("i", "i@mobile.id", "password");
        User j = new User("j", "j@mobile.id", "password");
        User k = new User("k", "k@mobile.id", "password");
        User l = new User("l", "l@mobile.id", "password");
        users.add(b);
        users.add(b);
        users.add(c);
        users.add(d);
        users.add(e);
        users.add(f);
        users.add(g);
        users.add(h);
        users.add(i);
        users.add(j);
        users.add(k);
        users.add(l);
    }

    public static void initDataDealItem() {
        //Dealitem (nama, tempat, harga, diskon, image, String info, hl, stock, code)
        Dealitem a = new Dealitem("nama satu", "tempat satu", 50000, 20, "image", "info satu", "hl1", 26, "1");
        Dealitem b = new Dealitem("nama dua", "tempat dua", 680000, 35, "image", "info dua", "hl1", 26, "2");
        Dealitem c = new Dealitem("nama tiga", "tempat tiga", 2010000, 25, "image", "info tiga", "hl1", 26, "3");
        Dealitem d = new Dealitem("nama empat", "tempat empat", 130000, 20, "image", "info empat", "hl1", 26, "4");
        dealitems.add(a);
        dealitems.add(b);
        dealitems.add(c);
        dealitems.add(d);
    }



    public static void initDataTopup(){

        Topup a = new Topup("Top Up Package 1",100000);
        Topups.add(a);
        Topup b = new Topup("Top Up Package 2",200000);
        Topups.add(b);
        Topup c = new Topup("Top Up Package 3",500000);
        Topups.add(c);
        Topup d = new Topup("Top Up Package 4",1000000);
        Topups.add(d);
    }
}
