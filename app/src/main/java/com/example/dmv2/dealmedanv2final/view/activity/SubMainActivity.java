package com.example.dmv2.dealmedanv2final.view.activity;

import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.model.entity.Order;
import com.example.dmv2.dealmedanv2final.model.entity.OrderDetail;
import com.example.dmv2.dealmedanv2final.model.entity.User;
import com.example.dmv2.dealmedanv2final.view.fragment.CheckCodeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.DealItemDetailFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.HistoryFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.HomeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.InvoiceFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.PayConfirmFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.TopupFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.WalletFragment;

import java.util.List;

/**
 * Created by Adlin on 23/05/2017.
 */

public class SubMainActivity extends ParentActivity {

    private Dealitem dealitem;
    private Order order;
    private List<OrderDetail> orderDetails;
    private ProgressBar mprogressBar;
    private User user;

    private FrameLayout fl;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain);

        // set Enabled Home Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        // set progress bar animation
        //mprogressBar = (ProgressBar) findViewById(R.id.circular_progress_bar);
        //ObjectAnimator anim = ObjectAnimator.ofInt(mprogressBar, "progress", 0, 100);
        //anim.setDuration(7000);
        //anim.setInterpolator(new DecelerateInterpolator());
        //anim.start();

        //get variable from previous Activity
        Intent intent = getIntent();
        String value = intent.getStringExtra("fragmentName"); //if it's a string you stored.

        fl = (FrameLayout) findViewById(R.id.progressBarFrame);

        /*
         * set fragment according fragmentName value
         */
        if(value.equals("home")) {
            fl.postDelayed(new Runnable() {
                public void run() {
                    fl.setVisibility(View.GONE);
                    changefragment(new HomeFragment());
                }
            }, 2100);
        }
        else if(value.equals("dealItemDetail")) {
            dealitem = (Dealitem) getIntent().getExtras().get("dealitem");

            setTitle(dealitem.getTempat()); // set Title Activity with item location
            fl.postDelayed(new Runnable() {
                public void run() {
                    fl.setVisibility(View.GONE);
                    changefragment(new DealItemDetailFragment(dealitem));
                }
            }, 2100);
        } else if(value.equals("InvoiceByPass")) {
            dealitem = (Dealitem) getIntent().getExtras().get("dealitem");
            fl.setVisibility(View.GONE);

            setTitle("Informasi Pemesanan"); // set Title Activity
            fl.postDelayed(new Runnable() {
                public void run() {
                    changefragment(new InvoiceFragment(dealitem));
                }
            }, 400);
        } else if(value.equals("ConfirmByPass")) {
            order = (Order) getIntent().getExtras().get("order");
            orderDetails = (List<OrderDetail>) getIntent().getExtras().get("order_detail");
            fl.setVisibility(View.GONE);

            setTitle("Konfirmasi"); // set Title Activity

            final FrameLayout fl = (FrameLayout) findViewById(R.id.progressBarFrame);
            fl.postDelayed(new Runnable() {
                public void run() {
                    changefragment(new PayConfirmFragment(order, orderDetails));
                }
            }, 400);
        } else if(value.equals("TopupPassing")) {
//            order = (Order) getIntent().getExtras().get("order");
//            orderDetails = (List<OrderDetail>) getIntent().getExtras().get("order_detail");

            setTitle("Topup"); // set Title Activity with item name

            final FrameLayout fl = (FrameLayout) findViewById(R.id.progressBarFrame);
            fl.postDelayed(new Runnable() {
                public void run() {
                    fl.setVisibility(View.GONE);
                    changefragment(new TopupFragment());
                }
            }, 400);
        } else if(value.equals("ToptoInvoice")) {
            double harga_topup =  (Double) getIntent().getExtras().get("harga_topup");
            final Dealitem dealitem = new Dealitem("TOP UP", "MegaDeal", harga_topup, 0, 0, 0, null, null, null, null, null, "topup");
            dealitem.dealitems.add(dealitem);
//            final Dealitem dealitem = null;
//            order = (Order) getIntent().getExtras().get("order");
//            orderDetails = (List<OrderDetail>) getIntent().getExtras().get("order_detail");

            setTitle("Invoice"); // set Title Activity with item name

            final FrameLayout fl = (FrameLayout) findViewById(R.id.progressBarFrame);
            fl.postDelayed(new Runnable() {
                public void run() {
                    fl.setVisibility(View.GONE);
                    changefragment(new InvoiceFragment(dealitem));
                }
            }, 2100);
        } else if(value.equals("History")) {
            setTitle("History Order"); // set Title Activity
            this.changefragment(new HistoryFragment());
        }
        else if(value.equals("wallet")) {
            setTitle("Wallet"); // set Title Activity
            this.changefragment(new WalletFragment());
        }
        else if(value.equals("checkcode")) {
            setTitle("Check Code"); // set Title Activity
            this.changefragment(new CheckCodeFragment());
        }
        else if(value.equals("topup")) {
            setTitle("Top Up"); // set Title Activity
            this.changefragment(new TopupFragment());
        }
        else if(value.equals("payment")) {
            setTitle("Top Up"); // set Title Activity
            this.changefragment(new TopupFragment());
        }
    }

    /*
     * Initiate menu button event
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //app icon in action bar clicked; goto parent activity.
                    //~NavUtils.navigateUpFromSameTask(this);
                if(!fl.isShown()){
                    this.finish();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    /*
     * Void Func to change fragment
     */
    public void changefragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_submain, fragment).commit();
    }

}
