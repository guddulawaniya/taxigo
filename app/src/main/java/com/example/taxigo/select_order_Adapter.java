package com.example.taxigo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class select_order_Adapter extends FragmentPagerAdapter {


    public select_order_Adapter(
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
            case 0: Rides_Fragment rides_fragment = new Rides_Fragment();
                return rides_fragment;
            case 1:Delivery_Fragment delivery_fragment = new Delivery_Fragment();
                return delivery_fragment;
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
            title = "Rides";
        else title = "Delivery";
        return title;
    }
}
