package com.georgestudenko.tourguide.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.georgestudenko.tourguide.Models.Place;

import java.util.List;

/**
 * Created by george on 22/04/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Place> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }


}