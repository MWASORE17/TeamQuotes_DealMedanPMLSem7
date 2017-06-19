package com.example.dmv2.dealmedanv2final.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setOrders(Order.orders);
        rv.setAdapter(adapter);
        return _view;
    }

}
