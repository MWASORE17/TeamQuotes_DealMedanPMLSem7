package com.example.dmv2.dealmedanv2final.view.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.model.entity.OrderDetail;
import com.example.dmv2.dealmedanv2final.model.entity.User;
import com.example.dmv2.dealmedanv2final.model.session.SessionManager;
import com.example.dmv2.dealmedanv2final.view.activity.MainActivity;
import com.example.dmv2.dealmedanv2final.view.activity.SecondActivity;
import com.example.dmv2.dealmedanv2final.view.activity.SubMainActivity;

import java.io.Serializable;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PayConfirmFragment extends Fragment {
    private Order order;
    private List<OrderDetail> orderDetails;
    private Dealitem dealitem;
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
        View _view = inflater.inflate(R.layout.fragment_pay_confirm, container, false);
        user_logged = SessionManager.with(getContext()).getuserloggedin();
        // Inflate the layout for this fragment
        this.getListener(_view, this.order, this.orderDetails, this.dealitem);
        return _view;
    }

    private void getListener(final View v, final Order _order, final List<OrderDetail> _orderdetails,final Dealitem _dealitem) {
        Button btn_confirm = (Button) v.findViewById(R.id.btn_konfirmasi_end);
        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v_) {
                TextView field_saleid = (TextView) v.findViewById(R.id.field_salesid);
                TextView field_kode = (TextView) v.findViewById(R.id.field_kode);

                String saleid = field_saleid.getText().toString();
                String kode = field_kode.getText().toString();
                String ItemSaleID;
                String ItemKodeConfirm;
                int j = 0;
                boolean found = false;
                for(Order order_item : _order.orders) {
                    ItemSaleID = order_item.getSalesId();
                    ItemKodeConfirm = order_item.getCodeConfirm();
                    if((ItemSaleID.equals(saleid)) && (ItemKodeConfirm.equals(kode))) {
                        if(_order.getTipe() == 0) {
                            user_logged.addWallet(_order.getTotal());
                            order_item.setStatus(1);
                        }else {
                            if(!user_logged.validating_zero(_order.getTotal())) {
                                user_logged.subWallet(_order.getTotal());
                                order_item.setStatus(1);
                                for (OrderDetail orderDetails_item : _orderdetails) {
                                    for(Dealitem dealitem_item : _dealitem.dealitems) {
                                        if(dealitem_item.getId()==orderDetails_item.getDeal_id()) {
                                            dealitem_item.subStock(orderDetails_item.getQuantity());
                                            break;
                                        }
                                    }
                                }
                                Toast.makeText(getActivity(), "Berhasil Konfirmasi",Toast.LENGTH_LONG).show();
                            }
                            else
                                Toast.makeText(getActivity(), "Saldo Wallet Anda Tidak Cukup",Toast.LENGTH_LONG).show();
                        }
                        found = true;
                        break;
                    }
                }
                if(!found) Toast.makeText(getActivity(), "Sales ID atau Kode Konfirmasi Salah",Toast.LENGTH_LONG).show();

                if(found) {
                    Intent _intent = new Intent(v.getContext(), SecondActivity.class);
                    _intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(_intent);
                }
//                int n = 5;
            }
        });
    }

}
