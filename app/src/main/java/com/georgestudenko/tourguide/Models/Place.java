package com.georgestudenko.tourguide.Models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by george on 22/04/2017.
 */

public class Place implements Parcelable{
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mName);
        dest.writeString(this.mDescription);
        dest.writeString(this.mAddress);
        dest.writeInt(this.mPictureResource);
        dest.writeParcelable(this.mGoogleMapsAddress, flags);
    }

    protected Place(Parcel in) {
        this.mName = in.readString();
        this.mDescription = in.readString();
        this.mAddress = in.readString();
        this.mPictureResource = in.readInt();
        this.mGoogleMapsAddress = in.readParcelable(Uri.class.getClassLoader());
    }

    public static final Creator<Place> CREATOR = new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel source) {
            return new Place(source);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };
}
