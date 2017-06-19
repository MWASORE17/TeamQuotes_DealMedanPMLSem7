package com.example.dmv2.dealmedanv2final.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.view.adapter.HistoryRVAdapter;

/**
 * Created by CM on 6/19/2017.
 */

public class HistoryFragment extends Fragment {
    private RecyclerView rv;
    private HistoryRVAdapter adapter;
    TextView txtNF;
    private View _view;

    public HistoryFragment() {
        //BLANK CONSTRUCTOR
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        _view = inflater.inflate(R.layout.fragment_history, container, false);
        adapter = new HistoryRVAdapter();
        rv = (RecyclerView) _view.findViewById(R.id.rv_asc);
        txtNF = (TextView) _view.findViewById(R.id.txt_not_found);

        txtNF.setText("Not Found");


        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setOrders(Order.orders);
        rv.setAdapter(adapter);


        if(Order.orders.isEmpty())
            txtNF.setVisibility(View.VISIBLE);
        else
            txtNF.setVisibility(View.GONE);

        return _view;
    }

}
