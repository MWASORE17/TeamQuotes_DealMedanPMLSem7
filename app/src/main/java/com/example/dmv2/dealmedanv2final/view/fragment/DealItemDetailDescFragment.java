package com.example.dmv2.dealmedanv2final.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;

/**
 * Created by Adlin on 06/06/2017.
 */

public class DealItemDetailDescFragment extends Fragment {

    private TextView Desc;
    private String DescValue;

    public DealItemDetailDescFragment() {
        // Required empty public constructor
    }

    public DealItemDetailDescFragment(String strValue) {
        DescValue = strValue;
    }

    public static DealItemDetailDescFragment newInstance(){
        return new DealItemDetailDescFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View _view = inflater.inflate(R.layout.item_dealitem_detail_desc, container, false);

        /* initiate & instantiate */
        Desc = (TextView) _view.findViewById(R.id.item_detail_desc);

        /* setting */
        Desc.setText(DescValue);

        return _view;
    }
}
