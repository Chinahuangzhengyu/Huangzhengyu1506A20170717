package com.bwie.www.tablayoutapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 黄郑宇 on 2017/8/2.
 */

public class Myfragment extends Fragment {

    private String test;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        test = bundle.getString("test");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);
         TextView textView= (TextView) view.findViewById(R.id.tvtitle);
        textView.setText(test);
        return view;
    }
}
