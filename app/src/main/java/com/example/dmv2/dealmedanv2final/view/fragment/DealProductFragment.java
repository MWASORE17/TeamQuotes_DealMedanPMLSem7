package com.example.dmv2.dealmedanv2final.view.fragment;

import android.content.Context;
import android.os.Bundle;
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

/**
 * Created by CM on 6/2/2017.
 */

public class DealProductFragment extends Fragment {
    private DealItemRVAdapter adapter;
    private RecyclerView rv;
    private Button button;

    private View rootView;


    public DealProductFragment() {
        // Required empty public constructor
    }

    public static DealProductFragment newInstance(){
        return new DealProductFragment();
    }

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

                RangeSeekBar rangeSeekbar = (RangeSeekBar) alertDialog.findViewById(R.id.rangeSeekbar);
                rangeSeekbar.setNotifyWhileDragging(true);
                rangeSeekbar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
                    @Override
                    public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                        preMin[0] = minValue;
                        preMax[0] = maxValue;
                    }
                });

//                Button btnFilter = (Button) alertDialog.findViewById(R.id.filter_dialog_button);
//
//                btnFilter.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick (View v) {
//                        Toast.makeText(v.getContext(),"MinValue:" + String.valueOf(preMin[0]) + " - " + "MaxValue:" + String.valueOf(preMax[0]), Toast.LENGTH_LONG).show();
//
//                    }
//                });
            }

        });

        return rootView;
    }

    private void init(){
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setDealitems(Dealitem.dealitems);
        rv.setAdapter(adapter);
    }
}
