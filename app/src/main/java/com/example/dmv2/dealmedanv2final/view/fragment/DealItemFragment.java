package com.example.dmv2.dealmedanv2final.view.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dmv2.dealmedanv2final.R;
import com.example.dmv2.dealmedanv2final.model.entity.Dealitem;
import com.example.dmv2.dealmedanv2final.view.activity.ParentActivity;
import com.example.dmv2.dealmedanv2final.view.adapter.DealItemRVAdapter;
import com.yahoo.mobile.client.android.util.rangeseekbar.RangeSeekBar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CM on 6/2/2017.
 */

public class DealItemFragment extends Fragment {
    private DealItemRVAdapter adapter;
    private RecyclerView rv;
    private Button button;
    private String kategori;
    private View rootView;
    private TextView txtNF;

    double preMin;
    double preMax;
    

    public DealItemFragment(
            String kategori, double hargaMin, double hargaMax
    ) {
        this.kategori = kategori;
        this.preMin = hargaMin;
        this.preMax = hargaMax;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_dealitem_asc, container, false);

        /* initiate & instantiate */
        adapter = new DealItemRVAdapter();
        rv = (RecyclerView) rootView.findViewById(R.id.di_asc_rv);
        button = (Button) rootView.findViewById(R.id.button_filter);
        txtNF = (TextView) rootView.findViewById(R.id.txt_not_found);

        txtNF.setText("Not Found");

        final ArrayList<Double> arrHarga = Dealitem.getCollectHarga();
        if( preMin==-1) {
            preMin = Dealitem.getMin(arrHarga);
            preMax = Dealitem.getMax(arrHarga);
        }

        final double tmpHargaMin = Dealitem.getMin(arrHarga);
        final double tmpHargaMax = Dealitem.getMax(arrHarga);

        /* setting */
        this.init();

        /* set event click for filter button */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (final View v) {

                LayoutInflater inflater = (LayoutInflater) v.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.filter_harga_seekbar, (ViewGroup) v.findViewById(R.id.your_dialog_root_element));


                AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext())
                        .setView(layout);

                builder //.setMessage("Filter Harga")
                        .setPositiveButton("Apply", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User OK the dialog
                                //Toast.makeText(v.getContext(),"MinValue:" + String.valueOf(preMin) + " - " + "MaxValue:" + String.valueOf(preMax), Toast.LENGTH_LONG).show();
                                refreshHome();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User cancelled the dialog
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

                final TextView txtMin = (TextView) alertDialog.findViewById(R.id.item_filter_min);
                final TextView txtMax = (TextView) alertDialog.findViewById(R.id.item_filter_max);
                final RangeSeekBar rangeSeekbar = (RangeSeekBar) alertDialog.findViewById(R.id.rangeSeekbar);

                txtMin.setText(ParentActivity.getIDRCurrency(preMin) + "+ ");
                txtMax.setText("- " + ParentActivity.getIDRCurrency(preMax));

                rangeSeekbar.setRangeValues(tmpHargaMin,tmpHargaMax);

                rangeSeekbar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
                    @Override
                    public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                        preMin = Math.floor((double)minValue);
                        preMax = Math.ceil((double)maxValue);

                        if((double)minValue != preMin){
                            bar.setSelectedMinValue(preMin);
                        }
                        if((double)maxValue != preMax){
                            bar.setSelectedMaxValue(preMax);
                        }

                        txtMin.setText(ParentActivity.getIDRCurrency(preMin));
                        txtMax.setText(ParentActivity.getIDRCurrency(preMax));
                    }
                });

                rangeSeekbar.setNotifyWhileDragging(true);
            }

        });

        return rootView;
    }

    private void init(){
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Dealitem> dl = new ArrayList<>();
        // collect data group by Category
        if (this.kategori.equals("all")) {
            for (Dealitem dealitem_item : Dealitem.dealitems) {
                if (!dealitem_item.getKategori().equals("topup") && dealitem_item.getHargaDiskon() >= this.preMin && dealitem_item.getHargaDiskon() <= this.preMax)
                    dl.add(dealitem_item);
            }
            adapter.setDealitems(dl);
        } else {
            dl.clear();
            for (Dealitem dealitem_item : Dealitem.dealitems) {
                if (dealitem_item.getKategori().equals(this.kategori) && dealitem_item.getHargaDiskon() >= this.preMin && dealitem_item.getHargaDiskon() <= this.preMax)
                    dl.add(dealitem_item);
            }
            adapter.setDealitems(dl);
        }

        if(dl.isEmpty())
            txtNF.setVisibility(View.VISIBLE);
        else
            txtNF.setVisibility(View.GONE);
        rv.setAdapter(adapter);
    }

    public void refreshHome(){
        //show progress Dialog. dismiss for 1s
        final ProgressDialog progress = new ProgressDialog(getActivity());
        progress.setMessage("Loading ...");
        progress.show();
        Thread _thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1300);
                    progress.dismiss();
                    changefragment(new HomeFragment(preMin, preMax));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        _thread.start();
    }

    /*
     * OTHER
     */
    public void changefragment(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, fragment).commit();
    }
}
