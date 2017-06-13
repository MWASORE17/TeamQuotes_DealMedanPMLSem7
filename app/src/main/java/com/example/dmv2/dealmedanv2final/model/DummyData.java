package com.example.dmv2.dealmedanv2final.model;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Topup;
import com.example.dmv2.dealmedanv2final.model.entity.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

import static android.R.attr.format;
import static com.example.dmv2.dealmedanv2final.model.entity.Topup.Topups;
import static com.example.dmv2.dealmedanv2final.model.entity.Dealitem.dealitems;
import static com.example.dmv2.dealmedanv2final.model.entity.User.*;

/**
 * Created by Adlin on 27/05/2017.
 */

public class DummyData {
    public static void initDataUser(){
        if(users.isEmpty()) {
            User a = new User("STMIK - Mikroskil Medan", "a@mobile.id", "password", 0);
            User b = new User("Kampus A", "b@mobile.id", "password", 30000);
            User c = new User("Kampus B", "c@mobile.id", "password", 0);
            User d = new User("Kampus C", "d@mobile.id", "password", 0);
            User e = new User("Kampus D - Thamrin Plaza", "e@mobile.id", "password", 0);
            User f = new User("f", "f@mobile.id", "password", 0);
            User g = new User("g", "g@mobile.id", "password", 0);
            User h = new User("h", "h@mobile.id", "password", 0);
            User i = new User("i", "i@mobile.id", "password", 0);
            User j = new User("j", "j@mobile.id", "password", 0);
            User k = new User("k", "k@mobile.id", "password", 0);
            User l = new User("l", "l@mobile.id", "password", 0);
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
    }

    public static void initDataDealItem() {
        if (dealitems.isEmpty()) {
            //Dealitem (nama, tempat, harga, diskon, image, stock, code, info, hl, kategori)
            dealitems.add(new Dealitem("Ayam Penyet Spesial", "Ayam Penyet Ria", 25000, 15, R.drawable.ayam_penyet_ria, 5, "AYAMENAK", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),
                    "• Voucher seharga Rp 228.000,- nett/orang Ramadhan Buka Puasa Buffet.\n" +
                            "Harga Normal: Rp 285.000,-\n" +
                            "\n\n\n" +
                            "• Voucher seharga Rp 208.000,- nett/orang Ramadhan Buka Puasa Buffet ( Untuk Pembelian 10 pax )\n" +
                            "Harga Normal: Rp 285.000,-\n" +
                            "\n\n\n" +
                            "• Voucher seharga Rp 198.000,- nett/orang Ramadhan Buka Puasa Buffet ( Untuk Pembelian 20 pax )\n" +
                            "Harga Normal: Rp 285.000,-\n", "", "makan"));
            dealitems.add(new Dealitem("Brownies Cokelat original", "Brownies Amanda", 45000, 20, R.drawable.browniesamanda, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),
                    "• Voucher seharga Rp 36.000,- nett\n" +
                            "Harga Normal: Rp 45.000,-\n" +
                            "Note :\n" +
                            "Diwajibkan untuk melakukan pemesanan 2 hari sebelumnya" +
                            "\n\n" +
                            "Konfirmasi pembayaran akhir paling lambat hari Selasa tanggal 20 Juni 2017",
                    "Tahun ini Marriott Café menggelar prasmanan Iftar termewah dan terbesar di kota Medan dengan lebih dari 10 \"live cooking station\" yang lezat dengan tema Alladine's Magic Carpet. Rasakan masakan otentik dari seluruh dunia seperti Turki, Jepang, Singapura, India, Cina, Spanyol, Italia, dan Indonesia yang dimasak oleh chef - chef professional.\n" +
                            "\n" +
                            "Cocok disantap bersama keluarga, sahabat atau teman kantor.\n" +
                            "Beragam masakan sudah termasuk Appetizer, Main Course, Soup, Drink and dessert.\n" +
                            "Tema Buffet makanan “Around the World”\n" +
                            "Disajikan fresh oleh Chef Profesional.\n" +
                            "\n\n" +
                            "Voucher berlaku mulai dari tanggal 29 Mei 2017 s/d 24 Juni 2017.", "makan"));
            dealitems.add(new Dealitem("Strawberry Waffle", "Fountain Ice Cream Medan Fair", 20000, 10, R.drawable.fountain_strawberry_waffle, 25, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),
                    "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                    "• Voucher berlaku Setiap hari.\n" +
                            "• Voucher tidak berlaku untuk hari libur nasional.\n" +
                            "• Voucher sudah termasuk tax dan service.\n" +
                            "• Voucher hanya berlaku untuk makan ditempat.\n" +
                            "• Voucher berlaku mulai dari tanggal 10 Juni 2017 s/d 30 Juni 2017.\n" +
                            "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.", "makan"));
            dealitems.add(new Dealitem("Chinese Red Crab (2 Org)", "Red Capit", 150000, 15, R.drawable.chinese_red_crab, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),
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
                            "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.", "makan"));
            dealitems.add(new Dealitem("Dimsum Packet 5 person", "Nelayan Sun Plaza", 250000, 25, R.drawable.dimsum_packet_5person, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),
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
                            "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.", "makan"));
            dealitems.add(new Dealitem("Strawberry Waffle", "Fountain Ice Cream Medan Fair", 20000, 10, R.drawable.fountain_strawberry_waffle, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),
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
                            "• Voucher yang sudah dibeli tidak dapat direfund, diextend masa berlakunya, ditukar ataupun diuangkan.", "makan"));
        dealitems.add( new Dealitem("Bento Set","Ginza Resto", 25000, 15, R.drawable.ginzo_bento_set,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                ,"•  Voucher seharga Rp 35.000,- net untuk Paket 1 (1 Nasi Ayam Andaliman + Hot/Iced tea/Lemon tea)\n" +
                "Harga Normal: Rp 55,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 49.000,- net untuk Paket 2 Premium (1 Nasi Soto Madura + Bakwan Jagung + Hot/Iced Thai tea)\n" +
                "Harga Normal: Rp 79,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 79.000,- net untuk Paket 3 (2 Main Courses + 2 Drinks)\n" +
                "Harga Normal: Rp 110,000,-\n" +
                "\n" +
                "Pilihan Menu : \n" +
                "\n" +
                "Lontong Pecal\n" +
                "Mie Sop/Mie Kangkung Belacan\n" +
                "Hot/Iced tea/Lemon tea\n" +
                "\n" +
                "•  Voucher seharga Rp 99.000,- net untuk Paket 4 Premium (2 Main Courses + 2 Drinks + Snack)\n" +
                "Harga Normal: Rp 147,000,-\n" +
                "\n" +
                "Pilihan Menu :\n" +
                "\n" +
                "Nasi Rica-Rica/Bumbu Bali\n" +
                "Nasi Goreng Tom Yam/Nasi Goreng Andaliman\n" +
                "Bakwan Jagung\n" +
                "Hot/Iced tea/Lemon tea"
                ,"Manna House kini menghadirkan menu-menu baru yang begitu spesial dengan citarasa nusantara, tidak hanya itu saja Manna House terkenal akan suasana tempat yang strategis dan nyaman. Sehingga sangat cocok dijadikan tempat berkumpul bersama teman.\n" +
                "\n" +
                "Pelayanan yang memuaskan.\n" +
                "Intrerior yang santai dan nyaman.\n" +
                "Tersedia smoking area.\n" +
                " \n" +
                "\n" +
                "Voucher berlaku mulai dari tanggal 12 Juni 2017 s/d 23 Juli 2017.", "makan"));

        dealitems.add( new Dealitem("Beef Steak","Grand Italy Resto", 80000, 15, R.drawable.grand_italy_steak,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                ,"•  Voucher seharga Rp 140.000,- net untuk Cake Edition Lebaran - 16 cm\n" +
                "Harga Normal: Rp 200,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 165.000,- net untuk Cake Edition Lebaran - 20 cm\n" +
                "Harga Normal: Rp 270,000,-\n" +
                "\n" +
                "Pilihan Rasa Cake :\n" +
                "\n" +
                "Black Forest\n" +
                "Chocolate indulgence\n" +
                "Fruit cream\n" +
                "Moccha\n" +
                "\n" +
                "•  Voucher seharga Rp 125.000,- net untuk 3 pcs Cookies (Nastar, Kacang, Dark Chocolate)\n" +
                "Harga Normal: Rp 180,000,-\n" +
                "\n" +
                "* cookies tidak dapat di mix, cookies @500gr"
                ,"Delicious Cafe & Pastry merupakan tempat makan yang cukup terkenal di kota Medan. Namun saat ini Delicious Cafe & Pastry menghadirkan promo cake khusus buat kamu. Dengan 2 pilihan ukuran cake yang berbeda, sangat cocok sebagai pelengkap hadiah ulang tahun, anniversary, arisan, atau dinikmati bersama keluarga dan sahabat.\n" +
                "\n" +
                "Fresh from the oven.\n" +
                "Menggunakan bahan yang berkualitas.\n" +
                "Belum termasuk lilin angka maupun lilin magic.\n" +
                "Diolah oleh Chef Pastry handal dengan bahan-bahan alami dan dihias indah.\n" +
                "Memberikan pelayanan delivery, dengan biaya sesuai jarak jauh lokasi (mulai dari Rp 10.000,-)\n" +
                " \n" +
                "\n" +
                "Voucher berlaku mulai dari tanggal 14 Juni 2017 s/d 07 Juli 2017.", "makan"));

        dealitems.add( new Dealitem("Seafood All You Can Eat","Grand Maxxim", 70000, 10, R.drawable.grand_maxxim_all_you_can_eat,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                ,"•  Voucher seharga Rp 42.000,- net untuk 2 Main Courses + 2 Ice tea.\n" +
                "Harga Normal: Rp 65,000,-\n" +
                "\n" +
                "Pilihan Main Course :\n" +
                "\n" +
                "Nasi Thu Gha (Nasi Babi Kecap)\n" +
                "Nasi Babi Goreng Thailand\n" +
                "Nasi Lemak\n" +
                "Kua Jhai Pui\n" +
                "Kue Tiau Goreng Seafood\n" +
                " \n" +
                "\n" +
                "Note :\n" +
                "\n" +
                "Voucher tidak berlaku pada tanggal 27 Juni s/d 03 Juli 2017 (Libur Lebaran)."
                ,"Rumah Makan Sedap 168 adalah rumah makan yang menyajikan menu non-halal. Dengan citarasa yang berkualitas sehingga cocok untuk di kunjungi bersama keluarga.\n" +
                "\n" +
                "Makanan Non-Halal.\n" +
                "Lokasi di Jl. Thamrin no. 56 (Depan Restoran Grand Kowloon).\n" +
                " \n" +
                "\n" +
                "Voucher berlaku mulai dari tanggal 12 Juni 2017 s/d 17 Juli 2017.", "makan"));

        dealitems.add( new Dealitem("June Cake Chocolate","Dulcet Cake and Pastry", 120000, 12, R.drawable.junecake,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                ,"•  Voucher seharga Rp 18.000,- net untuk 1 Pax Ayam Penyet Kalasan Komplit.\n" +
                "Harga Normal: Rp 26,000,-\n" +
                "\n" +
                "\n" +
                "•  Voucher seharga Rp 31.900,- net untuk 2 Pax Ayam Penyet Kalasan Komplit.\n" +
                "Harga Normal: Rp 52,000,-\n" +
                "\n" +
                "Note :\n" +
                "\n" +
                "Free Delivery untuk area Medan (Minimal 2 Pax)\n" +
                "Wilayah delivery diluar kota Medan diharapkan untuk melakukan konfirmasi ke pihak Nasi ayam Kalasan Terlebih dahulu sebelum pembelian.\n" +
                " \n" +
                "\n" +
                "Konfirmasi pembayaran akhir paling lambat hari Minggu tanggal 25 Juni 2017 pukul 23.59 WIB."
                ,"Diolah secara bersih dan higienis.\n" +
                "Menu makan yang disajikan fresh dan dibuat oleh Chef Profesional.\n" +
                "Free delivery untuk daerah Medan (konfirmasi untuk daerah Anda)\n" +
                "Disarankan untuk konfirmasi wilayah free delivery terlebih dahulu sebelum pembelian voucher.\n" +
                " \n" +
                "Voucher berlaku mulai dari tanggal 13 Juni 2017 s/d 05 Juli 2017.", "makan"));

        dealitems.add( new Dealitem("Salt and Sour Ramen","Muramasa", 35000, 15, R.drawable.muramasa_ramen,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                ,"•  Voucher seharga Rp 35.000,- net untuk 1 Nasi Sayur + 1 Ayam Goreng/Ayam Rendang + 1 Teh Manis + Takjil Special\n" +
                "Harga Normal: Rp 52,000,-\n" +
                "\n" +
                " \n" +
                "\n" +
                "•  Voucher seharga Rp 88.000,- net untuk Paket Ber-dua\n" +
                "Harga Normal: Rp 188,000,-\n" +
                "\n" +
                "Menu Paket Ber-dua :\n" +
                "\n" +
                "1 Ikan Bawal Steam\n" +
                "1 Pilihan Sayur Daun Ubi\n" +
                "1 Sayur Tauco\n" +
                "1/2 Ayam Goreng Cabe Ijo/Ayam Special Dapur Bintang\n" +
                "1 Fuyunghai\n" +
                "1 Sambal Tempe\n" +
                "2 Nasi Putih\n" +
                "2 Teh Panas/Dingin\n" +
                "Takjil (of the day)"
                ,"DapurBintang merupakan resto baru di kota Medan, dan saat ini sedang memberikan promo di dealmedan.com memberikan paket makan hemat berdua, berempat dan berdelapan khusus untuk kamu.\n" +
                "\n" +
                "Dengan rasa yang khas nusantara sangat menggugah selera makan kamu bersama keluarga.\n" +
                "\n" +
                "Menggunakan rempah-rempah pilihan.\n" +
                "Pelayanan yang memuaskan.\n" +
                "Lokasi yang strategis tepatnya di Jalan Kejaksaan No. 10 D E F.\n" +
                " \n" +
                "\n" +
                "Voucher berlaku mulai dari tanggal 10 Juni 2017 s/d 30 Juni 2017.", "makan"));
        dealitems.add( new Dealitem("Pattaya Friend Rice","Thai Resto", 25000, 10, R.drawable.pataya_land_fried_rice,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                ,""
                ,"", "makan"));

//        dealitems.add( new Dealitem("Red Lobster","Red Capit", 120000, 25, R.drawable.red_lobster,20,"ABC","",""));
//        dealitems.add( new Dealitem("Shrimp and Beacon Packet","Chinatown Food", 75000, 22, R.drawable.shrimp_and_beacon,20,"ABC","",""));
//        dealitems.add( new Dealitem("Wedding Cake","Dulcet Cake and Pastry", 350000, 20, R.drawable.weddingcake,20,"ABC","",""));

            dealitems.add(new Dealitem("Bumper Case Iphone 6", "Central Com", 50000, 10, R.drawable.bumper_case_iphone_, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),

                    "• 1 Pc Bumper Case Iphone 6 seharga Rp 45.000,- nett\n" +
                            "Harga Normal: Rp 50.000,-\n" +
                            "\n\n" +
                            "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                    "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak.", "barang"));

            dealitems.add(new Dealitem("Cable OTG", "Central Com", 25000, 10, R.drawable.cable_otg, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),

                    "• 1 Pc Bumper Case Iphone 6 seharga Rp 45.000,- nett\n" +
                            "Harga Normal: Rp 50.000,-\n" +
                            "\n\n" +
                            "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                    "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak.", "barang"));

            dealitems.add(new Dealitem("Fidget Spinner Glow", "Super Fidget", 50000, 15, R.drawable.fidget_spinner_glow, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),

                    "• 1 Pc Fidget Spinner Glow in the dark Rp 42.500,- nett\n" +
                            "Harga Normal: Rp 50.000,-\n" +
                            "\n\n" +
                            "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                    "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak.", "barang"));

            dealitems.add(new Dealitem("Fidget Spinner Polos", "Super Fidget", 35000, 15, R.drawable.fidget_spinner_polos, 20, "ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2),

                    "• 1 Pc Fidget Spinner Polos seharga Rp 29.750,- nett\n" +
                            "Harga Normal: Rp 35.000,-\n" +
                            "\n\n" +
                            "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 24 Juni 2017",
                    "Barang yang sudah dibeli tidak dapat ditukar atau dikembalikan, kecuali barang yang diterima dalam kondisi rusak.", "barang"));



            dealitems.add( new Dealitem("Keyboard Gaming Armaggedon","MedanKomputer", 150000, 12, R.drawable.keyboard_armagedon,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"•  1 pc Real You Whitening Teeth Sticker seharga Rp. 18.000,- net\n" +
                    "Harga Normal: Rp. 50,000,-\n" +
                    "\n" +
                    "•  2 pc Real You Whitening Teeth Sticker seharga Rp. 28.000,- net\n" +
                    "Harga Normal: Rp. 100,000,-\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Note : 1pc berisi 1 pasang sticker untuk gigi atas dan bawah\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Kamis tanggal 06 Juli 2017 pukul 23.59 WIB."
                    ,"Real You Whitening Teeth Sticker bekerja hanya membutuhkan waktu 1 jam memutihkan enamel gigi kuning anda dan hasil nya gigi langsung lebih putih permanent setiap kali sesudah pemakaian.\n" +
                    "\n" +
                    "CARA PAKAI\n" +
                    "- Tempelkan di gigi ( kalau bisa sebelum sikat gigi karena gigi lebih licin dan moist)\n" +
                    "- Diamkan sticker di gigi 1 jam lalu copot sticker dan hasil langsung nampak di gigi lebih putih secara permanent\n" +
                    "\n" +
                    "NB : Hasil putihnya setiap orang berbeda-beda tergantung kadar kekuningan gigi dan kerusakan enamel gigi yang diakibatkan merokok aktif dan gemar meminum kopi", "barang"));

            dealitems.add( new Dealitem("Keyboard Gaming Rexus K9","MedanKomputer", 270000, 20, R.drawable.keyboard_rexus,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"• 1 pc Fleecy Bangle Tea seharga Rp 70.000,- net\n" +
                    "Harga Normal: Rp 110.000,-\n" +
                    "\n" +
                    "• 2 pcs Fleecy Bangle Tea seharga Rp 128.000,- net\n" +
                    "Harga Normal: Rp 220.000,-\n" +
                    "\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Sabtu tanggal 08 Juli 2017 pukul 23.59 WIB."
                    ,"Fleecy bangle tea yang mampu menurunkan berat badan secara alami  dengan pemakaian teratur serta dibarengi olahraga yang rutin.\n" +
                    "\n" +
                    "Fleecy bangle tea merupakan teh herbal yang terbuat dari teh hijau, rimpang bangle, daun jati belanda dan kayu manis yang menghasilkan minuman kesehatan bagi kamu dan keluarga.\n" +
                    "\n" +
                    "Isi 25 sachet / @ 2g\n" +
                    "Baik dikonsumsi sebelum 10/10/2018", "barang"));
            dealitems.add( new Dealitem("Kipas Portable","Super Accessories", 30000, 15, R.drawable.kipas_portablel,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"•  1 pc Power Bank Romoss 10.000mAh ACE Series seharga Rp. 268.000,- net\n" +
                    "Harga Normal: Rp. 320,000,-\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Rabu tanggal 12 Juli 2017 pukul 23.59 WIB."
                    ,"Romoss Powerbank ACE10 - 10000mAh kini hadir lagi dengan tampilan terbarunya yang lebih mini dengan kualitas Double OUTPUT dan INPUT.\n" +
                    "\n" +
                    "INTEGRAL ALUMINIUM ALLOY CASING\n" +
                    "Memiliki satu komponen yang sama seperti MACbook yaitu perpaduan yang terpisahkan antara paduan casing dengan presisi tinggi menggunakan mesin CNC\n" +
                    "\n" +
                    "KAPASITAS BESAR 10000mAh\n" +
                    "Dengan kapasitas yang besar 10000mAh, Powerbank ACE10 dapat digunakan untuk charge handphone sebanyak 4 kali  jika kapasitas baterai Handphnone anda sebesar 2500mAh. Banyak pengecasan tergantung dari kapasitas baterai Handphone anda.", "barang"));
            dealitems.add( new Dealitem("Kipas USB Mini","Super Accessories", 25000, 10, R.drawable.kipas_usb_mini,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"• 1 pc Skinfood Sugar Stick Cheek seharga Rp 109.000,- nett\n" +
                    "Harga Normal: Rp 280.000,-\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Minggu tanggal 02 Juli 2017 pukul 23.59 WIB."
                    ,"Seperti blush on, Sugar Stick Cheek memberikan warna alami pada pipi sekaligus menutrisi kulit wajah dan memberi efek melembabkan.\n" +
                    "Teksturnya lembut dan mudah diratakan bahkan dengan jari\n" +
                    "Membuat anda tampil lebih percaya diri\n" +
                    "Membuat kulit pipi terasa halus dan lembut\n" +
                    "Warna yang tahan lama\n" +
                    "Terdapat pilihan warna nomor 1, 2, dan 3", "barang"));
            dealitems.add( new Dealitem("Power Bank Samsung 5000 mAh","Central Com", 150000, 17, R.drawable.power_bank_samsung,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"•  1 pc Headset Remax RM-502 seharga Rp. 59.000,- net\n" +
                    "Harga Normal: Rp. 80,000,-\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Rabu tanggal 12 Juli 2017 pukul 23.59 WIB."
                    ,"REMAX CRAZY ROBOT RM-502 In-ear Earphone\n" +
                    "\n" +
                    "Earphone dari remax ini hadir dengan design colorful. Memiliki microphone untuk menjawab panggilan telpon langsung dari earphone ini. Tombol jawab panggilan telpon pun dapat berfungsi juga untuk next musik / pause.\n" +
                    "\n" +
                    "Earbuds di design agar nyaman digunakan terutama saat bergerak, headset ini tidak mudah terjatuh dan tetap menempel dengan stabil ditelinga Anda.", "barang"));
            dealitems.add( new Dealitem("Power Bank Sony 5000 mAH","Central Com", 180000, 13, R.drawable.power_bank_sony,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"• 1 pc Dompet Koin Silikon seharga Rp 28.000,- net\n" +
                    "Harga Normal: Rp 50.000,-\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Minggu tanggal 09 Juli 2017 pukul 23.59 WIB."
                    ,"Dompet Koin yang sangat berguna untuk menyimpan koin agar tidak tercecer. Selain sebagai penyimpanan koin, juga cocok untuk menyimpan benda-benda dalam ukuran kecil seperti peniti, anting-anting, dan aksesoris lainnya.\n" +
                    "\n" +
                    "Ukuran 9x8.5cm\n" +
                    "Bahan silikon\n" +
                    "Tersedia pilihan motif :\n" +
                    "Sally\n" +
                    "Anggora\n" +
                    "Panda\n" +
                    "Frog\n" +
                    "Owl\n" +
                    "Hello Kitty\n" +
                    "Bird", "barang"));
            dealitems.add( new Dealitem("Power Bank Xiaomi 5000 mAh","Central Com", 130000, 15, R.drawable.power_bank_xiaomil,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"•  1 pc Speaker Bluetooth JC-180 seharga Rp. 150.000,- net\n" +
                    "Harga Normal: Rp. 200,000,-\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Rabu tanggal 12 Juli 2017 pukul 23.59 WIB."
                    ,"BT Version: V3.0 + EDR\n" +
                    "Transimission distance: 10m\n" +
                    "Output Power: 4 3W*2\n" +
                    "Playtime: 2-4 hours\n" +
                    "S/N: >85dB\n" +
                    "Distortion: <0.5%\n" +
                    "Battery Capacity: 1800mA\n" +
                    "Charging time: 2-4 hours\n" +
                    "Ukuran : 16 x 5cm ", "barang"));
            dealitems.add( new Dealitem("Xiaomi Charger Adapter","Central Com", 75000, 10, R.drawable.xiaomi_charger,20,"ABC", new java.sql.Date(2017, 6, 6), new java.sql.Date(2017, 6, 2)
                    ,"•  1 pc Fidget Spinner Glow In The Dark seharga Rp. 49.000,- net\n" +
                    "Harga Normal: Rp. 110,000,-\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Konfirmasi pembayaran akhir paling lambat hari Senin tanggal 10 Juli 2017 pukul 23.59 WIB."
                    ,"Fidget Finger Spinner yang berfungsi sebagai benda pengganti untuk kamu yang suka fidgeting seperti memainkan tutup pulpen, memutar-mutar buku, dan lain sebagainya yang diakibatkan karena kegelisahan dan kebosanan.\n" +
                    "\n" +
                    "Selain itu Spinner juga bermanfaat untuk penghilang stress, melatih ketangkasan jari, dan meningkatkan konsentrasi.\n" +
                    "\n" +
                    "Kelebihan dari Fidget Spinner jenis ini adalah dapat bercahaya dalam kegelapan sehingga membuat produk ini semakin terlihat keren dan menarik.\n" +
                    "\n" +
                    "Note : untuk mendapatkan glow yang maksimal, sorot fidget spinner nya dengan senter terlebih dahulu lalu lihat di tempat yang gelap", "barang"));


            //random
            shuffleList(dealitems);
        }
    }


    public static void initDataTopup()
    {
        if(Topups.isEmpty()) {
            Topup a = new Topup("Top Up Package 1", 100000);
            Topups.add(a);
            Topup b = new Topup("Top Up Package 2", 200000);
            Topups.add(b);
            Topup c = new Topup("Top Up Package 3", 500000);
            Topups.add(c);
            Topup d = new Topup("Top Up Package 4", 1000000);
            Topups.add(d);
        }
    }

    public static void shuffleList(ArrayList A){
        long seed = System.nanoTime();
        Collections.shuffle(A, new Random(seed));
    }
}
