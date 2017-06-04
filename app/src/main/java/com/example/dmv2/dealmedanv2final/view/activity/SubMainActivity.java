package com.example.dmv2.dealmedanv2final.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.view.fragment.CheckCodeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.TopupFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.WalletFragment;

/**
 * Created by Adlin on 23/05/2017.
 */

public class SubMainActivity extends ParentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain);

        // set Enabled Home Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        //get variable from previous Activity
        Intent intent = getIntent();
        String value = intent.getStringExtra("fragmentName"); //if it's a string you stored.

        //set fragment according fragmentName value
        if(value.equals("wallet")) {
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
                this.finish();
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
