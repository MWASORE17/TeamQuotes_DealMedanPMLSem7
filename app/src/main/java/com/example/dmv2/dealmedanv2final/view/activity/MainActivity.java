package com.example.dmv2.dealmedanv2final.view.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.view.fragment.CheckCodeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.WalletFragment;

import java.security.PublicKey;
import java.util.List;

import static android.R.attr.value;
import static java.lang.Thread.sleep;

public class MainActivity extends ParentActivity {

    private DrawerLayout mDraw;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle mToggle;
    private Toolbar toolbar;
    private MenuItem temp_item;

    public Button menuWallet;
    public Button menuCheckCode;
    public Button menuTopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initiate item
//        init();

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

//        Toast.makeText(this, "21", Toast.LENGTH_SHORT).show();

//        toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


        //ToggleMenu and nav drawwer
        mDraw = (DrawerLayout) findViewById(R.id.drawer_layout);
        nvDrawer = (NavigationView) findViewById(R.id.nvView);
        setupDrawerContent(nvDrawer);
        mToggle = new ActionBarDrawerToggle(this, mDraw, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDraw.addDrawerListener(mToggle);
        mToggle.syncState();

        // set Title App Name
//        setTitle(R.string.app_name);

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

    private void setupDrawerContent(final NavigationView nav) {

        nav.setNavigationItemSelectedListener(

                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        int id = item.getItemId();
                        if (id == R.id.nav_camera) {
                            // Handle the camera action
                        } else if (id == R.id.nav_gallery) {

                        } else if (id == R.id.nav_slideshow) {

                        } else if (id == R.id.nav_manage) {

                        } else if (id == R.id.menuWallet) {
                            changefragment(new WalletFragment());
                            setTitle("My Wallet");
                        } else if (id == R.id.menuCheckCode) {
                            changefragment(new CheckCodeFragment());
                            setTitle("Check Code");
                        }

                        int size = nav.getMenu().getItem(nav.getMenu().size()-1).getSubMenu().size();
                        for (int i = 0; i < size; i++) {
                            nav.getMenu().getItem(4).getSubMenu().getItem(i).setChecked(false);
                        }

                        item.setChecked(true);
                        mDraw.closeDrawers();
                        return true;
                    }
                }
        );
    }

    public void changefragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment).commit();
    }


}
