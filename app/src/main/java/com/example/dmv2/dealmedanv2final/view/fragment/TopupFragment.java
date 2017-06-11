package com.example.dmv2.dealmedanv2final.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.model.entity.OrderDetail;
import com.example.dmv2.dealmedanv2final.model.entity.Topup;
import com.example.dmv2.dealmedanv2final.view.activity.SubMainActivity;
import com.example.dmv2.dealmedanv2final.view.adapter.TopupRVAdapter;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.List;

import static com.example.dmv2.dealmedanv2final.view.activity.ParentActivity.getIDRCurrency;

/**
 * Created by Adlin on 24/05/2017.
 */

public class TopupFragment extends Fragment {

    private RecyclerView rv;
    private TopupRVAdapter adapter;
    private View _view;
    private static TextView txt_topup_total;

    private static double harga_temp_topup;

    public TopupFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        _view = inflater.inflate(R.layout.fragment_topup, container, false);

        /* initiate & instantiate */
        adapter = new TopupRVAdapter();
        rv = (RecyclerView) _view.findViewById(R.id.topup_rv);
        txt_topup_total = (TextView) _view.findViewById(R.id.txt_topup_total);

        /* setting */
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setTopup(Topup.Topups);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        //int size = Topup.Topups.size();
        //Topup.Topups.clear();
        //adapter.notifyItemRangeRemoved(0, size);

        this.getListener(_view);
        return _view;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    public static void setTotalPrice(){
        double totalPrice = 0;

        for(Topup topup : Topup.Topups) {
            totalPrice += topup.getPrice() * topup.getCount();
        }
        harga_temp_topup = totalPrice;

        txt_topup_total.setText(getIDRCurrency(totalPrice));
    }

    private void getListener(final View v) {
        Button btn_topup= (Button) v.findViewById(R.id.button_dec);
        btn_topup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v_) {
                Intent _intent = new Intent(v.getContext(), SubMainActivity.class);
                _intent.putExtra("fragmentName", "ToptoInvoice");
                _intent.putExtra("harga_topup", harga_temp_topup);
                v.getContext().startActivity(_intent);

            }
        });
    }
}
