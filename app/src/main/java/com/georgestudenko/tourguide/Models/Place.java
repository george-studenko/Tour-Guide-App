package com.georgestudenko.tourguide.Models;

import android.net.Uri;

/**
 * Created by george on 22/04/2017.
 */

public class Place {
    private String mName;
    private String mDescription;
    private String mAddress;
    private int mPictureResource;
    private Uri mGoogleMapsAddress;

    public Place(String mName, String mDescription, String mAddress, int mPictureResource, Uri mGoogleMapsAddress) {
        this.mName = mName;
        this.mDescription = mDescription;
        this.mAddress = mAddress;
        this.mPictureResource = mPictureResource;
        this.mGoogleMapsAddress = mGoogleMapsAddress;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public int getPictureResource() {
        return mPictureResource;
    }

    public void setPictureResource(int mPictureResource) {
        this.mPictureResource = mPictureResource;
    }

    public Uri getGoogleMapsAddress() {
        return mGoogleMapsAddress;
    }

    public void setGoogleMapsAddress(Uri mGoogleMapsAddress) {
        this.mGoogleMapsAddress = mGoogleMapsAddress;
    }
}
