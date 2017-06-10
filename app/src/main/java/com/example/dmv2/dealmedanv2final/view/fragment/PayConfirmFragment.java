package com.example.dmv2.dealmedanv2final.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.model.entity.OrderDetail;
import com.example.dmv2.dealmedanv2final.model.entity.User;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PayConfirmFragment extends Fragment {
    private Order order;
    private List<OrderDetail> orderDetails;
//    private User user_logged;
//    private Context ct;

    private User user_logged;
    public PayConfirmFragment(Order order, List<OrderDetail> orderDetails) {
        this.order = order;
        this.orderDetails = orderDetails;
        int a = 6;
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pay_confirm, container, false);
    }

}
