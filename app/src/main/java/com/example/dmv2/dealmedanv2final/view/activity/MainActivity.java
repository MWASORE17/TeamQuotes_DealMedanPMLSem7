package com.example.dmv2.dealmedanv2final.view.activity;

import android.app.ProgressDialog;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.dmv2.dealmedanv2final.R;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDraw;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressDialog progress = new ProgressDialog(this);
        progress.setMessage("Loading ...");
        progress.show();

        Thread _thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    progress.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        _thread.start();
//        progress.dismiss();
//        Thread.sleep(5000);

        mDraw = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToggle = new ActionBarDrawerToggle(this, mDraw, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDraw.addDrawerListener(mToggle);
        mToggle.syncState();

        setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*@Override
    publi*/
//    @Override
//    public OnBack


}
