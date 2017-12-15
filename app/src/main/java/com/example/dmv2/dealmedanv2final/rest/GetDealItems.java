package com.example.dmv2.dealmedanv2final.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by CM on 12/15/2017.
 */

public interface GetDealItems {
    @GET("?route=dealitem")
    Call<DealItemsResult> getDealitems();

    @GET("?route=dealitem&id={id}")
    Call<Dealitem> select(@Path("id") int id);
}
