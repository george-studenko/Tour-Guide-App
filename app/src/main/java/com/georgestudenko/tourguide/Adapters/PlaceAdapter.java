package com.georgestudenko.tourguide.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.georgestudenko.tourguide.Models.Place;
import com.georgestudenko.tourguide.R;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.resource;

/**
 * Created by george on 22/04/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    private ArrayList<Place> mPlaces;
    private Context mContext;
    public PlaceAdapter(@NonNull Context context, ArrayList<Place> objects) {
        super(context, 0, objects);
        mPlaces=objects;
        mContext=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }


}