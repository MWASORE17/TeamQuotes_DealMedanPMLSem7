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
import com.example.dmv2.dealmedanv2final.model.entity.User;
import com.example.dmv2.dealmedanv2final.view.fragment.CheckCodeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.DealItemDetailFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.InvoiceFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.TopupFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.WalletFragment;

/**
 * Created by Adlin on 23/05/2017.
 */

public class SubMainActivity extends ParentActivity {

    private Dealitem dealitem;
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
        if(value.equals("dealItemDetail")) {
            dealitem = (Dealitem) getIntent().getExtras().get("dealitem");

            setTitle(dealitem.getNama()); // set Title Activity with item name
            fl.postDelayed(new Runnable() {
                public void run() {
                    fl.setVisibility(View.GONE);
                    changefragment(new DealItemDetailFragment(dealitem));
                }
            }, 2100);
        } else if(value.equals("InvoiceByPass")) {
            dealitem = (Dealitem) getIntent().getExtras().get("dealitem");

            setTitle(dealitem.getNama()); // set Title Activity with item name
            fl.postDelayed(new Runnable() {
                public void run() {
                    fl.setVisibility(View.GONE);
                    changefragment(new InvoiceFragment(dealitem));
                }
            }, 2100);
        } else if(value.equals("wallet")) {
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
