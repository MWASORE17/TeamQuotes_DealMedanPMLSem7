package com.example.dmv2.dealmedanv2final.view.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.view.activity.SubMainActivity;
import com.example.dmv2.dealmedanv2final.view.adapter.DealItemRVAdapter;
import com.example.dmv2.dealmedanv2final.view.adapter.ViewPagerHomeAdapter;
import com.example.dmv2.dealmedanv2final.view.adapter.ViewPagerItemDetailAdapter;

import org.w3c.dom.Text;

/**
 * Created by Adlin on 05/06/2017.
 */

public class DealItemDetailFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private TextView
            name,
            discount,
            stock,
            price,
            price_disc;

    private ImageView image;

    private Dealitem dealitem;

    public DealItemDetailFragment() {
        // Required empty public constructor
    }

    public DealItemDetailFragment(Dealitem item) {
        dealitem = item;
    }

    public static DealItemDetailFragment newInstance(){
        return new DealItemDetailFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_dealitem_detail, container, false);

        tabLayout = (TabLayout) _view.findViewById(R.id.tabs_detail);
        viewPager = (ViewPager) _view.findViewById(R.id.viewPager_detail);

        name = (TextView) _view.findViewById(R.id.item_detail_name);
        discount = (TextView) _view.findViewById(R.id.item_detail_discount);
        stock = (TextView) _view.findViewById(R.id.item_detail_stock);
        price = (TextView) _view.findViewById(R.id.item_detail_price);
        price_disc = (TextView) _view.findViewById(R.id.item_detail_disc_price);
        image = (ImageView) _view.findViewById(R.id.item_detail_image);

        this.getListener(_view, dealitem);
        this.init();

        this.setContent();

        return _view;
    }

    private void init(){
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(final ViewPager viewPager) {
        ViewPagerItemDetailAdapter viewPagerAdapter = new ViewPagerItemDetailAdapter(getFragmentManager(),dealitem);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setContent(){
        name.setText(dealitem.getNama());
        discount.setText(String.valueOf(dealitem.getDiskon() + " %"));
        stock.setText(String.valueOf(dealitem.getStock()));
        price_disc.setText(dealitem.getIDRHargaDiskon());
        price.setText(dealitem.getIDRHarga());
        price.setPaintFlags(price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        image.setImageResource(dealitem.getImage());
    }

    private void getListener(final View v, final Dealitem _dealitem) {
        Button btn_beli = (Button) v.findViewById(R.id.button_dec);
        btn_beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v_) {
                Intent _intent = new Intent(v.getContext(), SubMainActivity.class);
                _intent.putExtra("fragmentName", "InvoiceByPass");
                _intent.putExtra("dealitem", _dealitem);
                v.getContext().startActivity(_intent);

            }
        });
    }
}
