package com.example.dmv2.dealmedanv2final.view.activity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.DummyData;
import com.example.dmv2.dealmedanv2final.model.entity.User;
import com.example.dmv2.dealmedanv2final.model.session.SessionManager;
import com.example.dmv2.dealmedanv2final.view.fragment.CheckCodeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.HistoryFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.HomeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.WalletFragment;

/**
 * Created by CM on 6/12/2017.
 */

public class SecondActivity extends ParentActivity {
    private DrawerLayout mDraw;
    private NavigationView nvDrawer;
    private ActionBarDrawerToggle mToggle;
    private ActionBar actionBar;

    private Toolbar toolbar;
    private MenuItem temp_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //show progress Dialog. dismiss for 1s
        final ProgressDialog progress = new ProgressDialog(this);
        progress.setMessage("Loading ...");
        progress.show();
        Thread _thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                    progress.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        _thread.start();

        //ToggleMenu and nav drawer
        mDraw = (DrawerLayout) findViewById(R.id.drawer_layout);
        nvDrawer = (NavigationView) findViewById(R.id.nvView);
        setupDrawerContent(nvDrawer);
        mToggle = new ActionBarDrawerToggle(this, mDraw, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDraw.addDrawerListener(mToggle);
        mToggle.syncState();

        //set Action Bar
        setActionBar();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLACK));

        //return HOMEFragment
        this.changefragment(new HomeFragment());
    }

    /*
     * Initiate option menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*
     * Initiate option menu event
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
                        if (id == R.id.nav_home) {
                            changefragment(new HomeFragment(0));

                        } else if (id == R.id.nav_voucher) {
                            changefragment(new HomeFragment(1));

                        } else if (id == R.id.nav_product) {
                            changefragment(new HistoryFragment());
                            setTitle("History");
                        } else if (id == R.id.nav_fav_deals) {

                        } else if (id == R.id.menuWallet) {
                            changefragment(new WalletFragment());
                            setTitle("My Wallet");

                        } else if (id == R.id.menuCheckCode) {
                            changefragment(new CheckCodeFragment());
                            setTitle("Check Code");

                        } //else if (id == R.id.menuTopup) {
//                            changefragment(new TopupFragment());
//                            setTitle("Top Up");
//                        } else if (id == R.id.menuPayConfirm) {
//                            changefragment(new PayConfirmFragment());
//                            setTitle("Konfirmasi Pembayaran");
//                        } else if (id == R.id.menuInvoice) {
//                            changefragment(new InvoiceFragment());
//                            setTitle("Invoice");
//                        }

                        int size = nav.getMenu().getItem(nav.getMenu().size()-1).getSubMenu().size();
                        for (int i = 0; i < size; i++) {
                            nav.getMenu().getItem(nav.getMenu().size()-1).getSubMenu().getItem(i).setChecked(false);
                        }

                        item.setChecked(true);
                        mDraw.closeDrawers();
                        return true;
                    }
                }
        );
    }

    /*
     * OTHER
     */
    public void changefragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment).commit();
    }

    private void setActionBar(){
        actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_HOME_AS_UP | ActionBar.DISPLAY_SHOW_HOME);

        LayoutInflater linflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = linflater.inflate(R.layout.toolbar_home, null);

        //TextView title = (TextView) view.findViewById(R.id.title_text);
        //title.setText(R.string.app_name);

        ActionBar.LayoutParams lp = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL;
        view.setLayoutParams(lp);

        //ActionBar.LayoutParams layout_params = new ActionBar.LayoutParams(ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT);
        getSupportActionBar().setCustomView(view);
    }
}
