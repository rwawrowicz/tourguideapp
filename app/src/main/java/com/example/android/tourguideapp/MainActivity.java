package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CategoriesFragmentPagerAdapter categoriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);
        String poi = getResources().getString(R.string.poi);
        String food = getResources().getString(R.string.food);
        String nature = getResources().getString(R.string.nature);
        String buildings = getResources().getString(R.string.buildings);
        String tabTitles[] = new String[] {poi, food, nature, buildings};
        categoriesAdapter = new CategoriesFragmentPagerAdapter(getSupportFragmentManager(), tabTitles);
        viewPager.setAdapter(categoriesAdapter);
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
