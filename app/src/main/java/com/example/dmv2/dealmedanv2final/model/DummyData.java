package com.example.dmv2.dealmedanv2final.model;

import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Topup;
import com.example.dmv2.dealmedanv2final.model.entity.User;

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
        dealitems.add(
            new Dealitem(
                "Ayam Penyet Ria",
                "Jalan Suhendar no. 213 Medan Selayang, Medan",
                198000,
                31,
                "image",
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
                "Voucher berlaku mulai dari tanggal 29 Mei 2017 s/d 24 Juni 2017.",
                26,
                "1"
            )
        );

        Dealitem b = new Dealitem("nama dua", "tempat dua", 680000, 35, "image", "info dua", "hl1", 26, "2");
        Dealitem c = new Dealitem("nama tiga", "tempat tiga", 2010000, 25, "image", "info tiga", "hl1", 26, "3");
        Dealitem d = new Dealitem("nama empat", "tempat empat", 130000, 20, "image", "info empat", "hl1", 26, "4");
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
