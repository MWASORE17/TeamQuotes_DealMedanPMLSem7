package com.example.dmv2.dealmedanv2final.view.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.view.adapter.DealItemRVAdapter;
import com.example.dmv2.dealmedanv2final.view.adapter.ViewPagerHomeAdapter;
import com.example.dmv2.dealmedanv2final.view.adapter.ViewPagerItemDetailAdapter;

/**
 * Created by Adlin on 05/06/2017.
 */

public class DealItemDetailFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public DealItemDetailFragment() {
        // Required empty public constructor
    }

    public static DealItemDetailFragment newInstance(){
        return new DealItemDetailFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_dealitem_detail, container, false);

        tabLayout = (TabLayout) _view.findViewById(R.id.tabs);
        viewPager = (ViewPager) _view.findViewById(R.id.viewPager);
        this.init();
        return _view;
    }
    private void init(){
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(final ViewPager viewPager) {
        ViewPagerItemDetailAdapter viewPagerAdapter = new ViewPagerItemDetailAdapter(getFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
