package com.example.dmv2.dealmedanv2final.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.User;
import com.example.dmv2.dealmedanv2final.model.session.SessionManager;


public class InvoiceFragment extends Fragment {
    private Dealitem dealitem;

    private User user_logged;
    private Context ct;

    public InvoiceFragment(Dealitem item) {
        dealitem = item;
        ct = getContext();
        int a = 6;
        // Required empty public constructor
    }



//    public static InvoiceFragment newInstance(){
//        return new InvoiceFragment();
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        user_logged = SessionManager.with(getContext()).getuserloggedin();
        int a = 6;
        return inflater.inflate(R.layout.fragment_invoice, container, false);
    }
}
