package com.example.dmv2.dealmedanv2final.rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dealitem {

@SerializedName("id")
@Expose
private String id;
@SerializedName("nama")
@Expose
private String nama;
@SerializedName("tempat")
@Expose
private String tempat;
@SerializedName("harga")
@Expose
private String harga;
@SerializedName("diskon")
@Expose
private String diskon;
@SerializedName("image")
@Expose
private String image;
@SerializedName("info")
@Expose
private String info;
@SerializedName("hl")
@Expose
private String hl;
@SerializedName("stock")
@Expose
private String stock;
@SerializedName("date_start")
@Expose
private String dateStart;
@SerializedName("date_expired")
@Expose
private String dateExpired;
@SerializedName("code")
@Expose
private String code;
@SerializedName("kategori")
@Expose
private String kategori;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getNama() {
return nama;
}

public void setNama(String nama) {
this.nama = nama;
}

public String getTempat() {
return tempat;
}

public void setTempat(String tempat) {
this.tempat = tempat;
}

public String getHarga() {
return harga;
}

public void setHarga(String harga) {
this.harga = harga;
}

public String getDiskon() {
return diskon;
}

public void setDiskon(String diskon) {
this.diskon = diskon;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public String getInfo() {
return info;
}

public void setInfo(String info) {
this.info = info;
}

public String getHl() {
return hl;
}

public void setHl(String hl) {
this.hl = hl;
}

public String getStock() {
return stock;
}

public void setStock(String stock) {
this.stock = stock;
}

public String getDateStart() {
return dateStart;
}

public void setDateStart(String dateStart) {
this.dateStart = dateStart;
}

public String getDateExpired() {
return dateExpired;
}

public void setDateExpired(String dateExpired) {
this.dateExpired = dateExpired;
}

public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public String getKategori() {
return kategori;
}

public void setKategori(String kategori) {
this.kategori = kategori;
}

}