package com.example.dmv2.dealmedanv2final.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Topup;

import java.util.ArrayList;
import java.util.List;

import static com.example.dmv2.dealmedanv2final.view.fragment.TopupFragment.setTotalPrice;

/**
 * Created by Adlin on 24/05/2017.
 */

public class TopupRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Topup> topups;

    public void setTopup(List<Topup> topups) {
        this.topups = topups;
    }

    public TopupRVAdapter() {
        super();
        //Init
        this.topups = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View _view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_topup_linear, parent, false);
        return new ItemUserViewHolder(_view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final ItemUserViewHolder _holder = (ItemUserViewHolder) holder;

        //Getting the particular item from the list
        final Topup _topup = this.topups.get(position);

        //Showing data on the views
        _holder.name.setText(_topup.getName());
        _holder.price.setText(_topup.getIDRPrice());

        _holder.button_inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = _topup.getCount();

                if(count>=0) {
                    _topup.setCount(count + 1);
                    _holder.txt_count.setText(String.valueOf(_topup.getCount()));
                    setTotalPrice();
                }

            }
        });

        _holder.button_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = _topup.getCount();

                if(count>0){
                    _topup.setCount(count - 1);
                    _holder.txt_count.setText(String.valueOf(_topup.getCount()));
                    setTotalPrice();
                }

            }
        });
        _holder.txt_count.setText(String.valueOf(_topup.getCount()));
        setTotalPrice();

    }

    @Override
    public int getItemCount() {
        return topups.size();
    }

    private class ItemUserViewHolder extends RecyclerView.ViewHolder {
        private TextView name, price, button_inc, button_dec, txt_count;

        public ItemUserViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.item_user_linear_name);
            price = (TextView) itemView.findViewById(R.id.item_user_linear_price);
            button_inc = (Button) itemView.findViewById(R.id.button_inc);
            button_dec = (Button) itemView.findViewById(R.id.button_dec);
            txt_count = (TextView) itemView.findViewById(R.id.text_count);
        }
    }
}
