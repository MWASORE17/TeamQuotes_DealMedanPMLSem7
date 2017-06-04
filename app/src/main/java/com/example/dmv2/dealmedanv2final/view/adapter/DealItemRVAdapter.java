package com.example.dmv2.dealmedanv2final.view.adapter;

import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CM on 6/2/2017.
 */

public class DealItemRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Dealitem> dealitems;
    public List<Dealitem> getDealitems() {
        return dealitems;
    }
    public void setDealitems(List<Dealitem> dealitems) {
        this.dealitems = dealitems;
    }

    public DealItemRVAdapter() {
        this.dealitems = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View _view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dealitem_linear, parent, false);
        return new ItemDealItemHolder(_view);
//        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final DealItemRVAdapter.ItemDealItemHolder _holder = (DealItemRVAdapter.ItemDealItemHolder) holder;
        final Dealitem _dealitems = this.dealitems.get(position);
        _holder.name.setText(_dealitems.getNama());
        _holder.tempat.setText(_dealitems.getTempat());
        _holder.stock.setText(String.valueOf(_dealitems.getStock()));
        _holder.diskon.setText(_dealitems.getIDRHargaDiskon());
        _holder.price.setText(_dealitems.getIDRHarga());
        _holder.price.setPaintFlags(_holder.price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }

    @Override
    public int getItemCount() {
        return dealitems.size();
    }

    private class ItemDealItemHolder extends RecyclerView.ViewHolder
    {
//        private ImageView image;
        private TextView name, price, tempat, diskon, image, stock;

        public ItemDealItemHolder(View itemView) {
            super(itemView);
//            image = (ImageView) itemView.findViewById(R.id.item_user_linear_image);
            name = (TextView) itemView.findViewById(R.id.item_hm_linear_name);
            price = (TextView) itemView.findViewById(R.id.item_hm_linear_price);
            tempat = (TextView) itemView.findViewById(R.id.item_hm_linear_place);
            diskon = (TextView) itemView.findViewById(R.id.item_hm_linear_diskon);
            stock = (TextView) itemView.findViewById(R.id.item_hm_linear_stock);

        }
    }
}
