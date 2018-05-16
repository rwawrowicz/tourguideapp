package com.example.android.tourguideapp;

/**
 * Created by wawr1 on 09.05.2018.
 */

public class Place {
    private int mImageResourdeId;
    private String mName;
    private String mDescription;

    public Place(int imageResourceId, String name, String description){
        mImageResourdeId = imageResourceId;
        mName = name;
        mDescription = description;
    }

    public int getImageResourceId(){
        return mImageResourdeId;
    }

    public String getPlaceName(){
        return mName;
    }

    public String getPlaceDescription() {
        return mDescription;
    }
}
