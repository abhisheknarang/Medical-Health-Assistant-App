package com.example.harshitbansal.selectcategory;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ABHISHEK NARANG on 23-07-2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NorthFragment();
        } else if (position == 1){
            return new SouthFragment();
        } else if (position ==2){
            return new EastFragment();
        }
        else{
            return new WestFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_north);
        } else if (position == 1) {
            return mContext.getString(R.string.category_south);
        } else if (position == 2) {
            return mContext.getString(R.string.category_east);
        } else {
            return mContext.getString(R.string.category_west);
        }
    }
}
