package com.example.dmv2.dealmedanv2final.model;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.DealProduct;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Topup;
import com.example.dmv2.dealmedanv2final.model.entity.User;

import java.util.Date;

import static android.R.attr.format;
import static com.example.dmv2.dealmedanv2final.model.entity.DealProduct.dealProducts;
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
        //Dealitem (nama, tempat, harga, diskon, image, stock, code, info, hl)
        dealitems.add( new Dealitem( "Ayam Penyet Spesial","Ayam Penyet Ria", 25000, 15, R.drawable.ayam_penyet_ria, 26,"AYAMENAK",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),
                        "• Voucher seharga Rp 21.250,- nett/orang Ramadhan Buka Puasa\n" +
                        "Harga Normal: Rp 25.000,-\n" +
                        "Note :\n" +
                        "Diwajibkan untuk melakukan pemesanan 2 hari sebelumnya" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                                "• Voucher berlaku Setiap hari.\n" +
                                "• Voucher tidak berlaku untuk hari libur nasional.\n" +
                                "• Voucher sudah termasuk tax dan service.\n" +
                                "• Voucher hanya berlaku untuk makan ditempat.\n" +
                                "• Voucher berlaku mulai dari tanggal 10 Juni 2017 s/d 30 Juni 2017.\n" +
                                "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan."
                        )
        );
        dealitems.add( new Dealitem("Brownies Cokelat original","Brownies Amanda", 45000, 20, R.drawable.browniesamanda,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),
                "• Voucher seharga Rp 36.000,- nett\n" +
                        "Harga Normal: Rp 45.000,-\n" +
                        "Note :\n" +
                        "Diwajibkan untuk melakukan pemesanan 2 hari sebelumnya" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "• Voucher berlaku Setiap hari.\n" +
                        "• Voucher tidak berlaku untuk hari libur nasional.\n" +
                        "• Voucher sudah termasuk tax dan service.\n" +
                        "• Voucher hanya berlaku untuk makan ditempat.\n" +
                        "• Voucher berlaku mulai dari tanggal 10 Juni 2017 s/d 30 Juni 2017.\n" +
                        "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan."));
        dealitems.add( new Dealitem("Chinese Red Crab (2 Org)","Red Capit", 150000, 15, R.drawable.chinese_red_crab,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),
                "• Voucher seharga Rp 127.500,- nett (Paket 2 orang)\n" +
                        "Harga Normal: Rp 150.000,-\n" +
                        "Note :\n" +
                        "Diwajibkan untuk melakukan pemesanan 2 hari sebelumnya" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "• Voucher berlaku Setiap hari.\n" +
                        "• Voucher tidak berlaku untuk hari libur nasional.\n" +
                        "• Voucher sudah termasuk tax dan service.\n" +
                        "• Voucher hanya berlaku untuk makan ditempat.\n" +
                        "• Voucher berlaku mulai dari tanggal 10 Juni 2017 s/d 30 Juni 2017.\n" +
                        "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan."));
        dealitems.add( new Dealitem("Dimsum Packet 5 person","Nelayan Sun Plaza", 250000, 25, R.drawable.dimsum_packet_5person,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),
                "• Voucher seharga Rp 187.500,- nett (Packet 5 Orang)\n" +
                        "Harga Normal: Rp 250.000,-\n" +
                        "Note :\n" +
                        "Diwajibkan untuk melakukan pemesanan 2 hari sebelumnya" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "• Voucher berlaku Setiap hari.\n" +
                        "• Voucher tidak berlaku untuk hari libur nasional.\n" +
                        "• Voucher sudah termasuk tax dan service.\n" +
                        "• Voucher hanya berlaku untuk makan ditempat.\n" +
                        "• Voucher berlaku mulai dari tanggal 10 Juni 2017 s/d 30 Juni 2017.\n" +
                        "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan."));
        dealitems.add( new Dealitem("Strawberry Waffle","Fountain Ice Cream Medan Fair", 20000, 10, R.drawable.fountain_strawberry_waffle,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),
                "• Voucher seharga Rp 18.000,- nett/orang Ramadhan Buka Puasa\n" +
                        "Harga Normal: Rp 20.000,-\n" +
                        "Note :\n" +
                        "Diwajibkan untuk melakukan pemesanan 2 hari sebelumnya" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "• Voucher berlaku Setiap hari.\n" +
                        "• Voucher tidak berlaku untuk hari libur nasional.\n" +
                        "• Voucher sudah termasuk tax dan service.\n" +
                        "• Voucher hanya berlaku untuk makan ditempat.\n" +
                        "• Voucher berlaku mulai dari tanggal 10 Juni 2017 s/d 30 Juni 2017.\n" +
                        "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan."));
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

    public  static  void initDataDealProduct(){
        dealProducts.add( new DealProduct("Bumper Case Iphone 6","Central Com", 50000, 10, R.drawable.bumper_case_iphone_,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),

                "• 1 Pc Bumper Case Iphone 6 seharga Rp 45.000,- nett\n" +
                        "Harga Normal: Rp 50.000,-\n" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak."));

        dealProducts.add( new DealProduct("Cable OTG","Central Com", 25000, 10, R.drawable.cable_otg,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),

                "• 1 Pc Bumper Case Iphone 6 seharga Rp 45.000,- nett\n" +
                        "Harga Normal: Rp 50.000,-\n" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak."));

        dealProducts.add( new DealProduct("Fidget Spinner Glow","Super Fidget", 50000, 15, R.drawable.fidget_spinner_glow,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),

                "• 1 Pc Fidget Spinner Glow in the dark Rp 42.500,- nett\n" +
                        "Harga Normal: Rp 50.000,-\n" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak."));

        dealProducts.add( new DealProduct("Fidget Spinner Polos","Super Fidget", 35000, 15, R.drawable.fidget_spinner_polos,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),

                "• 1 Pc Fidget Spinner Polos seharga Rp 29.750,- nett\n" +
                        "Harga Normal: Rp 35.000,-\n" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak."));

        dealProducts.add( new DealProduct("Headset Beats","Komputer Medan", 220000, 20, R.drawable.bumper_case_iphone_,20,"ABC",new java.sql.Date(2017,6,6),new java.sql.Date(2017,6,2),

                "• 1 Pc Headset Beats seharga Rp 176.000,- nett\n" +
                        "Harga Normal: Rp 220.000,-\n" +
                        "\n\n" +
                        "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak."));
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
