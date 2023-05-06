package com.example.taxigo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Power_pass_setTablayout_Adapter extends FragmentPagerAdapter {

    public Power_pass_setTablayout_Adapter(
            @NonNull FragmentManager fm)
    {
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new power_pass_bike();
            case 1: return new power_pass_auto();
            default: return new power_pass_bike();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        String title =null;
        if(position==0)
        {
            title = "Bike";

        }
        if(position==1)
        {
            title = "Auto";

        }
        return title;
    }
}
