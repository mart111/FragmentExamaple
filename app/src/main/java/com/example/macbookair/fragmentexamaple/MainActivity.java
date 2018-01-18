package com.example.macbookair.fragmentexamaple;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FragmentAdapter fAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabLayout);

        fAdapter = new FragmentAdapter(getSupportFragmentManager());

        fAdapter.addFragment(new FragmentOne(), "Fragment 1");
        fAdapter.addFragment(new FragmentTwo(), "Fragment 2");
        viewPager.setAdapter(fAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
