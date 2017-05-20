package com.biaoke.mybottomnavigationbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hasee on 2017/5/20.
 */

public class TvFragment extends Fragment {
    private static TvFragment fragment;

    public static TvFragment newInstance() {
        if (fragment == null) {
            fragment = new TvFragment();
        }
        return fragment;
    }
//    public static TvFragment newInstance(String param1) {
//        TvFragment fragment = new TvFragment();
//        Bundle args = new Bundle();
//        args.putString("agrs1", param1);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    public TvFragment() {
//
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tv, container, false);
//        Bundle bundle = getArguments();
//        String agrs1 = bundle.getString("agrs1");
//        TextView tv = (TextView) view.findViewById(R.id.tv_shop);
//        tv.setText(agrs1);
        return view;
    }
}
