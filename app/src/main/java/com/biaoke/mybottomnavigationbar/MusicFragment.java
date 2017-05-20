package com.biaoke.mybottomnavigationbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hasee on 2017/5/20.
 */

public class MusicFragment extends Fragment {

//    public static MusicFragment newInstance(String param1) {
//        MusicFragment fragment = new MusicFragment();
//        Bundle args = new Bundle();
//        args.putString("agrs1", param1);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    public MusicFragment() {
//
//    }
private static MusicFragment fragment;

    public static MusicFragment newInstance() {
        if (fragment == null) {
            fragment = new MusicFragment();
        }
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);
//        Bundle bundle = getArguments();
//        String agrs1 = bundle.getString("agrs1");
//        TextView tv = (TextView) view.findViewById(R.id.tv_shop);
//        tv.setText(agrs1);
        return view;
    }
}
