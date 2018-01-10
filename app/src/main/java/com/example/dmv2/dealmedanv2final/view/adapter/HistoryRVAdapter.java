package com.example.dmv2.dealmedanv2final.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.model.entity.OrderDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CM on 6/19/2017.
 */

public class HistoryRVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Order> orders;
    private List<Dealitem> dealitems;
    private List<OrderDetail> order_detail;

    Context mContext;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
//    public void setDealitems(List<Dealitem> dealitems) {
//        this.dealitems = dealitems;
//    }
//    public void setOrderDetails(List<OrderDetail> order_detail) {
//        this.order_detail = order_detail;
//    }


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

            for (OrderDetail orderDetails_item : OrderDetail.orders_detail) {
            if(orderDetails_item.getOrder_id()==_order.getId()) {
                for (Dealitem dealitem_item : Dealitem.dealitems) {
                    if (dealitem_item.getId() == orderDetails_item.getDeal_id()) {
                        if(dealitem_item.getImage() != null) {
                            Resources resources = _holder.image.getContext().getResources();
                            final int resourceId = resources.getIdentifier(dealitem_item.getImage(), "drawable",
                                    _holder.image.getContext().getPackageName());
                            _holder.image.setImageResource(resourceId);
                            _holder.name.setText(dealitem_item.getNama());
                        } else {
                            _holder.image.setImageDrawable(null);
                            _holder.name.setText("TOP UP Payment");
                        }

                        break;
                    }
                }
                break;
            }
        }

        _holder.code.setText(_order.getSalesId());
        _holder.price.setText(_order.getTotalIdr());
        //_holder.status.setText((_order.getStatus()==1 ? "COMPLETE" : "PENDING"));
        if(_order.getStatus()==1)
            _holder.status.setText("COMPLETE");
        else if(_order.getStatus()==2)
            _holder.status.setText("CANCELLED");
        else
            _holder.status.setText("PENDING");
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
        private TextView code, price, tipe, status, name;
        private ImageView image;
        public ItemHistoryVH(View itemView) {
            super(itemView);
            image= (ImageView) itemView.findViewById(R.id.item_history_Linearimage);
            name = (TextView) itemView.findViewById(R.id.item_history_linearname);
            code= (TextView) itemView.findViewById(R.id.item_history_linearcode);
            tipe = (TextView) itemView.findViewById(R.id.item_history_lineartipe);
            price = (TextView) itemView.findViewById(R.id.item_history_linearprice);
            status = (TextView) itemView.findViewById(R.id.tem_history_linear_status);

        }
    }
}
