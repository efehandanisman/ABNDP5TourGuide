package com.example.android.abndp5tourguide;

/**
 * Created by Efehan on 18.3.2018.
 */

public class Sight {

    private int mImageId;
    private String mSight;
    private String mCost;
    private String mOpeningHours;
    private int mImadeId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Sight(int ImageId, String Sight, String Cost, String OpeningHours) {
        mSight = Sight;
        mCost = Cost;
        mOpeningHours = OpeningHours;
        mImageId = ImageId;

    }

    public Sight(String Sight, String Cost, String OpeningHours) {
        mSight = Sight;
        mCost = Cost;
        mOpeningHours = OpeningHours;


    }

    public int getImageId() {
        return mImageId;
    }

    public String getSight() {
        return mSight;
    }

    public String getCost() {
        return mCost;
    }

    public String getOpeningHours() {
        return mOpeningHours;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}


