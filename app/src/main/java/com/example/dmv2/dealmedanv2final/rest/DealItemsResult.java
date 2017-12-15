package com.example.dmv2.dealmedanv2final.rest;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DealItemsResult {

@SerializedName("dealitems")
@Expose
private List<Dealitem> dealitems = null;

public List<Dealitem> getDealitems() {
return dealitems;
}

public void setDealitems(List<Dealitem> dealitems) {
this.dealitems = dealitems;
}

}