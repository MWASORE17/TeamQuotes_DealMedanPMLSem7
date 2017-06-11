package com.example.dmv2.dealmedanv2final.view.activity;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.dmv2.dealmedanv2final.R;

import com.example.dmv2.dealmedanv2final.model.entity.User;
import com.example.dmv2.dealmedanv2final.model.session.SessionManager;
import com.example.dmv2.dealmedanv2final.view.fragment.CheckCodeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.HomeFragment;
import com.example.dmv2.dealmedanv2final.view.fragment.WalletFragment;
import com.example.dmv2.dealmedanv2final.model.DummyData;

import static java.lang.Thread.sleep;

public class MainActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initiate data dummy
        DummyData.initDataTopup();
        DummyData.initDataDealItem();
        DummyData.initDataUser();
        this.autoLogin(new User("Kampus A", "b@mobile.id", "password", 0));


        //return HOMEFragment
        doChangeActivity(this.getApplicationContext(), SecondActivity.class);
    }
    private void autoLogin(User user) {

        Boolean _isregistered = false, _ismatch = false;
        User _user = new User();
        for (User item : User.users) {
            if (item.getEmail().equals(user.getEmail().toString())) {
                if (item.getPassword().equals(user.getPassword().toString())) {
                    _ismatch = true;
                    _user = item;
                }
                _isregistered = true;
                break;
            }
        }

        if (_isregistered && _ismatch) {
            SessionManager.with(getApplicationContext()).createsession(_user);
        }

        //User ULogin = SessionManager.with(getApplicationContext()).getuserloggedin();
        //int a = 5;
    }
}