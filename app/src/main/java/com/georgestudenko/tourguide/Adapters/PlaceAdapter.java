package com.georgestudenko.tourguide.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.georgestudenko.tourguide.Models.Place;
import com.georgestudenko.tourguide.R;

import java.util.ArrayList;

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
        View v = convertView;
        if(v==null){
            v = LayoutInflater.from(mContext).inflate(R.layout.place_item,parent,false);
        }
        final Place place = mPlaces.get(position);

        ImageView placeImage = (ImageView) v.findViewById(R.id.placeImage);
        ImageView pinImage = (ImageView) v.findViewById(R.id.pinIcon);
        TextView placeName = (TextView) v.findViewById(R.id.placeName);
        TextView address = (TextView) v.findViewById(R.id.address);
        TextView placeShortDescription = (TextView) v.findViewById(R.id.placeShortDescription);

        placeImage.setImageResource(place.getPictureResource());
        placeName.setText(place.getName());
        placeShortDescription.setText(place.getDescription());
        address.setText(mContext.getString(R.string.address)+place.getAddress());

        pinImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,place.getGoogleMapsAddress());
                v.getContext().startActivity(intent);
            }
        });

        return v;
    }
}