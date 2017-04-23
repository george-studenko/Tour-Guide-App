package com.georgestudenko.tourguide.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by george on 22/04/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentStatePagerAdapter{
private int mTotalTabs = 3;
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return mTotalTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Sightseeing";
            case 1:
                return "Parks";
            case 2:
                return "Activities";
            default:
                return super.getPageTitle(position);
        }
    }
}
