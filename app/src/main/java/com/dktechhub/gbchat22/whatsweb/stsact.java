package com.dktechhub.gbchat22.whatsweb;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.dktechhub.gbchat22.whatsweb.ui.main.SectionsPagerAdapter;

public class stsact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        ((MyApplication)getApplication()).showInterstitialIfReady(this);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        sectionsPagerAdapter.addFragment(new FragmentStaus(false),"Recent Statuses");
        sectionsPagerAdapter.addFragment(new FragmentStaus(true),"Saved Statuses");
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


    }



}