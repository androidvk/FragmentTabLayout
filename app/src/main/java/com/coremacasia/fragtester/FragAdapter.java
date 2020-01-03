package com.coremacasia.fragtester;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class FragAdapter extends FragmentPagerAdapter {
    @NonNull
    private final FragmentManager fm;
    private final int tabCount;
    private final Context context;

    public FragAdapter(@NonNull FragmentManager fm, int tabCount , Context context) {
        super(fm, tabCount);

        this.fm = fm;
        this.tabCount = tabCount;
        this.context = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new Fragment1();
            case 1:return new Fragment2();
            default:return  null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
