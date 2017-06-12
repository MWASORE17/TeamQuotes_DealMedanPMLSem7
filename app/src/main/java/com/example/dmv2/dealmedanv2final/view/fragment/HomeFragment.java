package com.example.dmv2.dealmedanv2final.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.view.adapter.ViewPagerHomeAdapter;

/**
 * Created by CM on 6/3/2017.
 */

public class HomeFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    int vpIndex = 0;
    double hargaMin = -1;
    double hargaMax = -1;

    public HomeFragment(){
        // required empty constructor
    }

    public HomeFragment(int selectedTabIndex){
        vpIndex = selectedTabIndex;
    }

    public HomeFragment(double priceMin, double priceMax){
        hargaMin = priceMin;
        hargaMax = priceMax;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_home, container, false);

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
        ViewPagerHomeAdapter viewPagerAdapter = new ViewPagerHomeAdapter(getChildFragmentManager(), hargaMin, hargaMax);
//        ViewPagerHomeAdapter viewPagerAdapter = new ViewPagerHomeAdapter(getFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.setCurrentItem(vpIndex);
    }
}
