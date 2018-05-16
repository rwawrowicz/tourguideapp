package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wawr1 on 09.05.2018.
 */

public class CategoriesFragmentPagerAdapter extends FragmentPagerAdapter {
    String mTabTitles[];


    public CategoriesFragmentPagerAdapter(FragmentManager fm, String tabTitles[]) {
        super(fm);
        mTabTitles = tabTitles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PoiFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2){
            return new NatureFragment();
        } else {
            return new BuildingsFragment();
        }
    }

    @Override
    public int getCount() {
        return mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}
