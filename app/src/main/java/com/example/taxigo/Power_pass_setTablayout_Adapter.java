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
    public Fragment getItem(int position)
    {
       switch (position)
       {
           case 0: power_pass_bike bikeFragmentClaims = new power_pass_bike();
           return bikeFragmentClaims;
           case 1:power_pass_auto auto_fragment_claims = new power_pass_auto();
           return auto_fragment_claims;
           default:Bike_fragment_claims bike = new Bike_fragment_claims();
           return bike;

       }
    }

    @Override
    public int getCount()
    {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "Bike";
        else title = "Auto";
        return title;
    }
}
