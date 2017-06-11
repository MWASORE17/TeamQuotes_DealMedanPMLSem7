package com.example.dmv2.dealmedanv2final.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.view.activity.SubMainActivity;

/**
 * Created by Adlin on 24/05/2017.
 */

public class WalletFragment extends Fragment {

    public WalletFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View _view = inflater.inflate(R.layout.fragment_wallet, container, false);
        /* initiate & instantiate */

        this.getListener(_view);
        /* setting */
        return _view;
    }

    private void getListener(final View v) {
        Button btn_wallet= (Button) v.findViewById(R.id.btn_wallet);
        btn_wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v_) {
                Intent _intent = new Intent(v.getContext(), SubMainActivity.class);
                _intent.putExtra("fragmentName", "TopupPassing");
                v.getContext().startActivity(_intent);

            }
        });
    }
}
