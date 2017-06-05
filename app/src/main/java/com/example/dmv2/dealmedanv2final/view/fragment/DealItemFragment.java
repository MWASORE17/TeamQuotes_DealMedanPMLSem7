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
import com.example.dmv2.dealmedanv2final.view.adapter.DealItemRVAdapter;

/**
 * Created by CM on 6/2/2017.
 */

public class DealItemFragment extends Fragment {
    private DealItemRVAdapter adapter;
    private RecyclerView rv;
    

    public DealItemFragment() {
        // Required empty public constructor
    }

    public static DealItemFragment newInstance(){
        return new DealItemFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_dealitem_asc, container, false);

        /* initiate & instantiate */
        adapter = new DealItemRVAdapter();
        rv = (RecyclerView) _view.findViewById(R.id.di_asc_rv);

        /* setting */
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setDealitems(Dealitem.dealitems);
        rv.setAdapter(adapter);
        return _view;
    }
}
