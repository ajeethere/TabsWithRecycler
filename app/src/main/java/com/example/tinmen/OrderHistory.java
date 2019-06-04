package com.example.tinmen;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OrderHistory extends AppCompatActivity {
    SectionsAdapter sectionsAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);
        viewPager = (ViewPager) findViewById(R.id.tab_view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager(ViewPager viewPager) {
        sectionsAdapter = new SectionsAdapter(getSupportFragmentManager());
        sectionsAdapter.addFrag(new CompleteOrdersFrag(), "Completed Orders");
        sectionsAdapter.addFrag(new UpCommingOrdersFrag(), "UpComing Orders");
        viewPager.setAdapter(sectionsAdapter);
    }
}
