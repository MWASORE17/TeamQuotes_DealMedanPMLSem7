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
import com.example.dmv2.dealmedanv2final.model.entity.Topup;
import com.example.dmv2.dealmedanv2final.view.adapter.TopupRVAdapter;

import org.w3c.dom.Text;

import static com.example.dmv2.dealmedanv2final.view.activity.ParentActivity.getIDRCurrency;

/**
 * Created by Adlin on 24/05/2017.
 */

public class TopupFragment extends Fragment {

    private RecyclerView rv;
    private TopupRVAdapter adapter;
    private static TextView txt_topup_total;

    private View _view;

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

        txt_topup_total.setText(getIDRCurrency(totalPrice));
    }
}
