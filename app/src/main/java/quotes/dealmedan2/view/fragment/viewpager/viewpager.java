package quotes.dealmedan2.view.fragment.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import quotes.dealmedan2.R;


public class viewpager extends Fragment {
   public viewpager() {
       //BLANK
   }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View _view = inflater.inflate(R.layout.fragment_login, container, false);

//        init(_view);
//        event();

        return _view;
    }
}
