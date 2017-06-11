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
import android.widget.Toast;

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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;


public class InvoiceFragment extends Fragment {
    private Dealitem dealitem;

    private User user_logged;
    private Context ct;
    private Order order;
    private OrderDetail orderDetail;
    private ArrayList<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
    private OrderDetail orderdetail_temp;
    private ListView listView_invoice;
    private int ConfirmCode;
    private String SalesCode;
    private SimpleDateFormat datenow;
    private SimpleDateFormat datenow_invoice;
    private Calendar cal = Calendar.getInstance();



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
        if(this.dealitem!=null) {
            this.addOrder(_view);
            this.initDisplay(_view);
        } else {
            this.orderDetails = null;
        }
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
        int tipe;
        tipe = (dealitem.getKategori().equals("topup")) ? 0 : 1;
        //1 == Quantity
        double total = dealitem.getHargaDiskon();
        Date date_start = null;
        Date date_expired = null;
        String code = String.valueOf(this.ConfirmCode);
        int status = 0;
        int payment_method_id = 1;
        Order query_order = new Order(tipe, user_id, total, status, payment_method_id, date_start, date_expired,  String.valueOf(this.getConfirmCode()), null);
        this.order = query_order;
        this.getKodeSales(this.order.getId());
        query_order.setSalesId(this.SalesCode);
        dealitem.setName(this.SalesCode);
        this.order.orders.add(query_order);

        //ADD ORDER_DETAIL
        int order_id = order.getId();
        int deal_id = dealitem.getId();
        int quantity = 1;
        double subtotal = (dealitem.getHargaDiskon()*quantity);

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
        //KodeSales
        TextView saleid = (TextView) v.findViewById(R.id.getSalesID);
        saleid.setText(this.SalesCode);

        TextView date = (TextView) v.findViewById(R.id.getDateOrder);
        this.datenow_invoice = new SimpleDateFormat("dd MMMM yyyy");
        date.setText(this.datenow_invoice.format(cal.getTime()));

        TextView confirmcode = (TextView) v.findViewById(R.id.getCodeConfirm);
        confirmcode.setText(String.valueOf(this.ConfirmCode));

        int c = 6;

    }

    private String getKodeSales(int orderID) {
//        Toast.makeText(getActivity(), formattedDate,Toast.LENGTH_LONG).show();

        this.datenow = new SimpleDateFormat("yyyyMMdd");
        String datenows = this.datenow.format(cal.getTime());
        return this.SalesCode = (datenows+String.valueOf(this.ConfirmCode)+"-"+String.valueOf(orderID));
    }

    private int getConfirmCode() {
        Random rand = new Random();
        int ConfirmCode = rand.nextInt(4000-1000 + 1) + 1000;
        this.ConfirmCode = ConfirmCode;

        return ConfirmCode;
    }

}
