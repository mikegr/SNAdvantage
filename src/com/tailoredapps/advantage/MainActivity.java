package com.tailoredapps.advantage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


import net.advantage.ADvantage;

public class MainActivity extends FragmentActivity {

    
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ADvantage.setADvantageData(R.styleable.ADvantage, R.xml.bannersizes);
        setContentView(R.layout.main);
        pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            
            @Override
            public int getCount() {
                return 1;
            }
            
            @Override
            public Fragment getItem(int arg0) {
                return new MainFragment();
            }
        });
    }
}
