package com.biaoke.mybottomnavigationbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hasee on 2017/5/20.
 */

public class BookFragment extends Fragment {

//    public static BookFragment newInstance(String param1) {
//        BookFragment fragment = new BookFragment();
//        Bundle args = new Bundle();
//        args.putString("agrs1", param1);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    public BookFragment() {
//
//    }
private static BookFragment fragment;

    public static BookFragment newInstance() {
        if (fragment == null) {
            fragment = new BookFragment();
        }
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book, container, false);
//        Bundle bundle = getArguments();
//        String agrs1 = bundle.getString("agrs1");
//        TextView tv = (TextView) view.findViewById(R.id.tv_shop);
//        tv.setText(agrs1);
        return view;
    }
}
