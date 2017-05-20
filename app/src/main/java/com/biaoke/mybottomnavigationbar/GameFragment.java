package com.biaoke.mybottomnavigationbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hasee on 2017/5/20.
 */

public class GameFragment extends Fragment {

//    public static GameFragment newInstance(String param1) {
//        GameFragment fragment = new GameFragment();
//        Bundle args = new Bundle();
//        args.putString("agrs1", param1);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    public GameFragment() {
//
//    }
private static GameFragment fragment;

    public static GameFragment newInstance() {
        if (fragment == null) {
            fragment = new GameFragment();
        }
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game, container, false);
//        Bundle bundle = getArguments();
//        String agrs1 = bundle.getString("agrs1");
//        TextView tv = (TextView) view.findViewById(R.id.tv_shop);
//        tv.setText(agrs1);
        return view;
    }
}
