package com.example.dmv2.dealmedanv2final.view.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.model.entity.OrderDetail;

import java.util.ArrayList;

/**
 * Created by CM on 6/10/2017.
 */

public class ListViewInvoiceAdapter extends ArrayAdapter<OrderDetail>{
    private Dealitem dealitem, dealitem_temp;
    public ListViewInvoiceAdapter(Context context, ArrayList<OrderDetail> orderDetails) {
        super(context, 0, orderDetails);
    }

    @Override
    public View getView(int position, View _v, ViewGroup parent) {
        OrderDetail orderDetail = getItem(position);
        for(Dealitem item : this.   dealitem.dealitems) {
            if(item.getId()==orderDetail.getDeal_id()) {
                dealitem_temp = item;
                break;
            }
        }
        if (_v == null) {
            _v = LayoutInflater.from(getContext()).inflate(R.layout.item_orderdetail_linear, parent, false);
        }
        TextView dealName   = (TextView) _v.findViewById(R.id.dealName);
        TextView dealPlace = (TextView) _v.findViewById(R.id.dealPlace);
        TextView dealQuantity = (TextView) _v.findViewById(R.id.dealQuantity);

        dealName.setText(String.valueOf(dealitem_temp.getNama()));
        dealPlace.setText(String.valueOf(dealitem_temp.getTempat()));
        dealQuantity.setText("Quantity : "+String.valueOf(orderDetail.getQuantity()));

        return _v;
    }

}
