package com.example.android.abndp5tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Efehan on 25.3.2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;


    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ArtMuseumFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new TouristicSightFragment();
        } else {
            return new SurroundingFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.ArtMuseum);
        } else if (position == 1) {
            return mContext.getString(R.string.Restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.TouristicSight);
        } else {
            return mContext.getString(R.string.Surrounding);
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }


}
