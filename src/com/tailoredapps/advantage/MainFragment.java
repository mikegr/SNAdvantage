package com.tailoredapps.advantage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.advantage.ADvantage;

public class MainFragment extends Fragment {

    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_swipeytab, null);

        ADvantage adv = (ADvantage) root.findViewById(R.id.sticky_banner);
        adv.setSiteId("homepage");
        adv.load();
        return root;
    }
    
}
