package com.example.dmv2.dealmedanv2final.view.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.dmv2.dealmedanv2final.R;

import java.security.PublicKey;

import static android.R.attr.value;
import static java.lang.Thread.sleep;

public class MainActivity extends ParentActivity {

    private DrawerLayout mDraw;
    private ActionBarDrawerToggle mToggle;
    public Button menuWallet;
    public Button menuCheckCode;
    public Button menuTopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initiate item
        init();

        //show progress Dialog. dismiss for 3s
        final ProgressDialog progress = new ProgressDialog(this);
        progress.setMessage("Loading ...");
        progress.show();
        Thread _thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    progress.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        _thread.start();

        //ToggleMenu and nav drawwer
        mDraw = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDraw, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDraw.addDrawerListener(mToggle);
        mToggle.syncState();

        // set Title App Name
        setTitle(R.string.app_name);

        // set Enabled Home Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    /*
     * Initiate menu button event
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*
     * Initiate components and its events
     */
    public void init(){
        final Intent intent = new Intent(MainActivity.this, SubMainActivity.class);
        //Wallet
        menuWallet = (Button) findViewById(R.id.menuWallet);
        menuWallet.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intent.putExtra("fragmentName", "wallet");
                startActivity(intent);
            }
        });

        //CheckCode
        menuCheckCode = (Button) findViewById(R.id.menuCheckCode);
        menuCheckCode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intent.putExtra("fragmentName", "checkcode");
                startActivity(intent);
            }
        });

        //TopUp
        menuTopup = (Button) findViewById(R.id.menuTopup);
        menuTopup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intent.putExtra("fragmentName", "topup");
                startActivity(intent);
            }
        });


    }


}
