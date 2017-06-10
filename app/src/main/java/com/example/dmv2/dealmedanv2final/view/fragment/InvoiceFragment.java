package com.example.dmv2.dealmedanv2final.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.model.entity.OrderDetail;
import com.example.dmv2.dealmedanv2final.model.entity.User;
import com.example.dmv2.dealmedanv2final.model.session.SessionManager;
import com.example.dmv2.dealmedanv2final.view.activity.SubMainActivity;
import com.example.dmv2.dealmedanv2final.view.adapter.ListViewInvoiceAdapter;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;


public class InvoiceFragment extends Fragment {
    private Dealitem dealitem;

    private User user_logged;
    private Context ct;
    private Order order;
    private OrderDetail orderDetail;
    private ArrayList<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
    private OrderDetail orderdetail_temp;
    private ListView listView_invoice;


//    private Struct

    public InvoiceFragment(Dealitem item) {
        dealitem = item;
        ct = getContext();
        int a = 6;
        // Required empty public constructor
    }



//    public static InvoiceFragment newInstance(){
//        return new InvoiceFragment();
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View _view = inflater.inflate(R.layout.fragment_invoice, container, false);
        user_logged = SessionManager.with(getContext()).getuserloggedin();

        int a = 6;
        this.addOrder(_view);
        this.initDisplay(_view);
        this.getListener(_view, this.order, this.orderDetails);
        return _view;
    }

    private void getListener(final View v, final Order _order, final List<OrderDetail> _orderDetailList) {
        Button btn_confirm = (Button) v.findViewById(R.id.btn_confirm);
        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v_) {
                Intent _intent = new Intent(v.getContext(), SubMainActivity.class);
                _intent.putExtra("fragmentName", "ConfirmByPass");
                _intent.putExtra("order", _order);
                _intent.putExtra("order_detail", (Serializable) _orderDetailList);
                v.getContext().startActivity(_intent);

            }
        });
    }

    private void addOrder(View v) {
        int user_id = user_logged.getId();
        int tipe = 1;
        //1 == Quantity
        double total = dealitem.getHarga();
        Date date_start = null;
        Date date_expired = null;
        String code = null;
        int status = 0;
        int payment_method_id = 1;
        Order query_order = new Order(tipe, user_id, total, status, payment_method_id, date_start, date_expired, code);
        this.order = query_order;
        this.order.orders.add(query_order);

        //ADD ORDER_DETAIL
        int order_id = order.getId();
        int deal_id = dealitem.getId();
        int quantity = 1;
        double subtotal = dealitem.getHarga()*quantity;

        OrderDetail query_orderDetail = new OrderDetail(order_id,deal_id,quantity,subtotal);
        OrderDetail.orders_detail.add(query_orderDetail);

        this.orderDetails.add(query_orderDetail);

    }

    private void initDisplay(View v) {
        listView_invoice = (ListView)v.findViewById(R.id.listbeli);
        TextView nama = (TextView) v.findViewById(R.id.getNama);
        nama.setText(user_logged.getName());

        ListViewInvoiceAdapter adapter = new ListViewInvoiceAdapter(this.getContext(), this.orderDetails);
        listView_invoice.setAdapter(adapter);

        //Harga
        TextView harga = (TextView) v.findViewById(R.id.hargatotal);
        harga.setText(this.order.getTotalIdr());
        int c = 6;

    }
}
