package com.example.dmv2.dealmedanv2final.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;

/**
 * Created by CM on 6/6/2017.
 */

public class DealItemDetailActivity extends AppCompatActivity {
    private Dealitem dealitem;

    @Override
    protected void onCreate(Bundle SavedIntanceState) {
        super.onCreate(SavedIntanceState);

        dealitem = (Dealitem)getIntent().getExtras().get("dealitem");
        setContentView(R.layout.fragment_dealitem_detail);

        setTitle("Detail Coy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
