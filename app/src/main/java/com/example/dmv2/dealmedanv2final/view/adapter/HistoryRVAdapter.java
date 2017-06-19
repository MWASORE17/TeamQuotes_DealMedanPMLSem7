package com.example.dmv2.dealmedanv2final.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CM on 6/19/2017.
 */

public class HistoryRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Order> orders;
    Context mContext;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public HistoryRVAdapter() {
        this.orders = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View _view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_history_linear, parent, false);
        return new ItemHistoryVH(_view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final HistoryRVAdapter.ItemHistoryVH _holder = (HistoryRVAdapter.ItemHistoryVH ) holder;
        final Order _order = this.orders.get(position);

        _holder.code.setText(_order.getSalesId());
        _holder.price.setText(_order.getTotalIdr());
        _holder.status.setText((_order.getStatus()==1 ? "COMPLETE" : "PENDING"));
        _holder.tipe.setText((_order.getTipe()==0 ? "Top UP" : "Product"));


//        _holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick (View v) {
//                Intent _intent = new Intent(v.getContext(), SubMainActivity.class);
//                _intent.putExtra("fragmentName", "");
//                _intent.putExtra("dealitem", _dealitem);
//                v.getContext().startActivity(_intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    private class ItemHistoryVH extends RecyclerView.ViewHolder
    {
        //private ImageView image;
        private TextView code, price, tipe, status;

        public ItemHistoryVH(View itemView) {
            super(itemView);
            code= (TextView) itemView.findViewById(R.id.item_history_linearcode);
            tipe = (TextView) itemView.findViewById(R.id.item_history_lineartipe);
            price = (TextView) itemView.findViewById(R.id.item_history_linearprice);
            status = (TextView) itemView.findViewById(R.id.tem_history_linear_status);

        }
    }
}
