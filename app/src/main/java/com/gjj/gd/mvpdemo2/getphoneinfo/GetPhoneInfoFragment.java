package com.gjj.gd.mvpdemo2.getphoneinfo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gjj.gd.mvpdemo2.R;

public class GetPhoneInfoFragment extends Fragment {


    public GetPhoneInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_get_phone_info, container, false);
    }

}
