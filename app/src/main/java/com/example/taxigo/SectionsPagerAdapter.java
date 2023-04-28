package com.example.taxigo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(
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
           case 0: Bike_fragment_claims bikeFragmentClaims = new Bike_fragment_claims();
           return bikeFragmentClaims;
           case 1:Auto_fragment_claims auto_fragment_claims = new Auto_fragment_claims();
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
