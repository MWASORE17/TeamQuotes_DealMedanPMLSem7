package com.example.dmv2.dealmedanv2final.model;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Topup;
import com.example.dmv2.dealmedanv2final.model.entity.User;

import java.util.Date;

import static android.R.attr.format;
import static com.example.dmv2.dealmedanv2final.model.entity.Topup.Topups;
import static com.example.dmv2.dealmedanv2final.model.entity.Dealitem.dealitems;
import static com.example.dmv2.dealmedanv2final.model.entity.User.*;

/**
 * Created by Adlin on 27/05/2017.
 */

public class DummyData {
    public static void initDataUser(){
        if(!users.isEmpty())
            users.clear();
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
        if(!dealitems.isEmpty())
            dealitems.clear();
        //Dealitem (nama, tempat, harga, diskon, image, stock, code, info, hl)
        dealitems.add( new Dealitem( "Ayam Penyet Spesial","Ayam Penyet Ria", 25000, 15, R.drawable.ayam_penyet_ria, 26,"AYAMENAK",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),
                        "• Voucher seharga Rp 228.000,- nett/orang Ramadhan Buka Puasa Buffet.\n" +
                        "Harga Normal: Rp 285.000,-\n" +
                        "\n\n\n" +
                        "• Voucher seharga Rp 208.000,- nett/orang Ramadhan Buka Puasa Buffet ( Untuk Pembelian 10 pax )\n" +
                        "Harga Normal: Rp 285.000,-\n" +
                        "\n\n\n" +
                        "• Voucher seharga Rp 198.000,- nett/orang Ramadhan Buka Puasa Buffet ( Untuk Pembelian 20 pax )\n" +
                        "Harga Normal: Rp 285.000,-\n" +
                        "\n\n" +
                        "Note :\n" +
                        "\n" +
                        "Diwajibkan menghubungi Marriott Cafe JW Marriott Hotel Medan terlebih dahulu sebelum melakukan transaksi untuk mengetahui status ketersediaan tempat di nomor 061 - 4553 333.\n" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Selasa tanggal 20 Juni 2017",
                        "Tahun ini Marriott Café menggelar prasmanan Iftar termewah dan terbesar di kota Medan dengan lebih dari 10 \"live cooking station\" yang lezat dengan tema Alladine's Magic Carpet. Rasakan masakan otentik dari seluruh dunia seperti Turki, Jepang, Singapura, India, Cina, Spanyol, Italia, dan Indonesia yang dimasak oleh chef - chef professional.\n" +
                                "\n" +
                                "Cocok disantap bersama keluarga, sahabat atau teman kantor.\n" +
                                "Beragam masakan sudah termasuk Appetizer, Main Course, Soup, Drink and dessert.\n" +
                                "Tema Buffet makanan “Around the World”\n" +
                                "Disajikan fresh oleh Chef Profesional.\n" +
                                "\n\n" +
                                "Voucher berlaku mulai dari tanggal 29 Mei 2017 s/d 24 Juni 2017."
                        )
        );
        dealitems.add( new Dealitem("Brownies Cokelat original","Brownies Amanda", 45000, 20, R.drawable.browniesamanda,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),"",""));
        dealitems.add( new Dealitem("Chinese Red Crab (2 Org)","Red Capit", 150000, 15, R.drawable.chinese_red_crab,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),"",""));
        dealitems.add( new Dealitem("Dimsum Packet 5 person","Nelayan Sun Plaza", 250000, 25, R.drawable.dimsum_packet_5person,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),"",""));
        dealitems.add( new Dealitem("Strawberry Waffle","Fountain Ice Cream Medan Fair", 20000, 10, R.drawable.fountain_strawberry_waffle,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),"",""));
//        dealitems.add( new Dealitem("Bento Set","Ginza Resto", 25000, 15, R.drawable.ginzo_bento_set,20,"ABC","",""));
//        dealitems.add( new Dealitem("Beef Steak","Grand Italy Resto", 80000, 15, R.drawable.grand_italy_steak,20,"ABC","",""));
//        dealitems.add( new Dealitem("Seafood All You Can Eat","Grand Maxxim", 70000, 10, R.drawable.grand_maxxim_all_you_can_eat,20,"ABC","",""));
//        dealitems.add( new Dealitem("June Cake Chocolate","Dulcet Cake and Pastry", 120000, 12, R.drawable.junecake,20,"ABC","",""));
//        dealitems.add( new Dealitem("Salt and Sour Ramen","Muramasa", 35000, 15, R.drawable.muramasa_ramen,20,"ABC","",""));
//        dealitems.add( new Dealitem("Pattaya Friend Rice","Thai Resto", 25000, 10, R.drawable.pataya_land_fried_rice,20,"ABC","",""));
//        dealitems.add( new Dealitem("Red Lobster","Red Capit", 120000, 25, R.drawable.red_lobster,20,"ABC","",""));
//        dealitems.add( new Dealitem("Shrimp and Beacon Packet","Chinatown Food", 75000, 22, R.drawable.shrimp_and_beacon,20,"ABC","",""));
//        dealitems.add( new Dealitem("Wedding Cake","Dulcet Cake and Pastry", 350000, 20, R.drawable.weddingcake,20,"ABC","",""));


    }



    public static void initDataTopup()
    {
        if(!Topups.isEmpty())
            Topups.clear();
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
