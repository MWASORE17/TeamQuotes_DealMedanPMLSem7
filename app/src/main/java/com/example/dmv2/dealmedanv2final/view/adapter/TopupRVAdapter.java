package com.example.dmv2.dealmedanv2final.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Topup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adlin on 24/05/2017.
 */

public class TopupRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Topup> topups;
    public List<Topup> getTopups() {
        return topups;
    }

    public void setTopup(List<Topup> topups) {
        this.topups = topups;
    }

    public TopupRVAdapter() {
        this.topups = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View _view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_topup_linear, parent, false);
        return new ItemUserViewHolder(_view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final ItemUserViewHolder _holder = (ItemUserViewHolder) holder;
        final Topup _topup = this.topups.get(position);
        _holder.name.setText(_topup.getName());
        _holder.price.setText(_topup.getPrice());
    }

    @Override
    public int getItemCount() {
        return topups.size();
    }

    private class ItemUserViewHolder extends RecyclerView.ViewHolder {
        private TextView name, price;

        public ItemUserViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.item_user_linear_name);
            price = (TextView) itemView.findViewById(R.id.item_user_linear_price);
        }
    }
}
