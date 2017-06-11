package com.example.dmv2.dealmedanv2final.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.view.adapter.DealItemRVAdapter;
import com.yahoo.mobile.client.android.util.rangeseekbar.RangeSeekBar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by CM on 6/2/2017.
 */

public class DealItemFragment extends Fragment {
    private DealItemRVAdapter adapter;
    private RecyclerView rv;
    private Button button;
    private String kategori;
    private View rootView;
    

    public DealItemFragment(String kategori) {
        this.kategori = kategori;
        // Required empty public constructor
    }

//    public static DealItemFragment newInstance(){
//        return new DealItemFragment();
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_dealitem_asc, container, false);

        /* initiate & instantiate */
        adapter = new DealItemRVAdapter();
        rv = (RecyclerView) rootView.findViewById(R.id.di_asc_rv);
        button = (Button) rootView.findViewById(R.id.button_filter);

        /* setting */
        this.init();

        /* set event click for filter button */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (final View v) {

                LayoutInflater inflater = (LayoutInflater) v.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.filter_harga_seekbar, (ViewGroup) v.findViewById(R.id.your_dialog_root_element));
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext())
                        .setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

                final Object[] preMin = {-1};
                final Object[] preMax = {-1};
                ArrayList<Double> arrHarga = Dealitem.getCollectHarga();

                Button btnFilter = (Button) alertDialog.findViewById(R.id.filter_dialog_button);
                RangeSeekBar rangeSeekbar = (RangeSeekBar) alertDialog.findViewById(R.id.rangeSeekbar);

                rangeSeekbar.setRangeValues(Collections.<Double>min(arrHarga),Collections.<Double>max(arrHarga));
                rangeSeekbar.setNotifyWhileDragging(true);

                rangeSeekbar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
                    @Override
                    public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                        preMin[0] = minValue;
                        preMax[0] = maxValue;
                    }
                });

                btnFilter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {
                        Toast.makeText(v.getContext(),"MinValue:" + String.valueOf(preMin[0]) + " - " + "MaxValue:" + String.valueOf(preMax[0]), Toast.LENGTH_LONG).show();

                    }
                });
            }

        });

        return rootView;
    }

    private void init(){
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        if (this.kategori.equals("all")) {
            adapter.setDealitems(Dealitem.dealitems);
        } else {
            List<Dealitem> dl = new ArrayList<>();
            for (Dealitem dealitem_item : Dealitem.dealitems) {
                if (dealitem_item.getKategori().equals(this.kategori))
                    dl.add(dealitem_item);
            }
            adapter.setDealitems(dl);
        }
        rv.setAdapter(adapter);
    }
}
