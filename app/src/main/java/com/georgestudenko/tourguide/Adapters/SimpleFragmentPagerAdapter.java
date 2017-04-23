package com.georgestudenko.tourguide.Adapters;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.georgestudenko.tourguide.Models.Place;
import com.georgestudenko.tourguide.PlacesListFragment;
import com.georgestudenko.tourguide.R;

import java.util.ArrayList;


/**
 * Created by george on 22/04/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentStatePagerAdapter{
private int mTotalTabs = 4;
private Context mContext;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext=context;

    }

    @Override
    public Fragment getItem(int position) {
        PlacesListFragment fragment =  new PlacesListFragment();
        // set Adapter data
        ArrayList<Place> placesData = new ArrayList<>();

        if(position==0) {
            // Sightseeing
            placesData.add(new Place(mContext.getString(R.string.arc_triomf), mContext.getString(R.string.arc_triomf_description), mContext.getString(R.string.arc_triomf_address), R.drawable.arc_de_triomf, Uri.parse(mContext.getString(R.string.arc_triomf_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.sagrada_familia_title), mContext.getString(R.string.sagrada_familia_desc), mContext.getString(R.string.sagrada_familia_address), R.drawable.sagrada_familia, Uri.parse(mContext.getString(R.string.sagrada_familia_uri))));
            placesData.add(new Place(mContext.getString(R.string.plaza_espana_title), mContext.getString(R.string.plaza_espana_desc), mContext.getString(R.string.plaza_espana_address), R.drawable.plaza_espana, Uri.parse(mContext.getString(R.string.plaza_espana_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.torre_agbar_title), mContext.getString(R.string.torre_agbar_desc), mContext.getString(R.string.torre_agbar_address), R.drawable.torre_agbar, Uri.parse(mContext.getString(R.string.torre_agbar_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.magic_fountain_title), mContext.getString(R.string.magic_fountain_desc), mContext.getString(R.string.magic_fountain_address), R.drawable.fuente_magica, Uri.parse(mContext.getString(R.string.magic_fountain_google_uri))));
        }
        else if(position==1) {
            // Parks
            placesData.add(new Place(mContext.getString(R.string.parc_guell_title), mContext.getString(R.string.parc_guell_desc), mContext.getString(R.string.parc_guell_address), R.drawable.parc_guell, Uri.parse(mContext.getString(R.string.parc_guell_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.park_ciudatella_title), mContext.getString(R.string.park_ciudatella_desc), mContext.getString(R.string.park_ciudatella_address), R.drawable.parc_ciutadella, Uri.parse(mContext.getString(R.string.park_ciudatella_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.tibidabo_title), mContext.getString(R.string.tibidabo_desc), mContext.getString(R.string.tibidabo_address), R.drawable.tibidabo, Uri.parse(mContext.getString(R.string.tibidabo_google_uri))));
        }

        else if(position==2) {
            // Activities
            placesData.add(new Place(mContext.getString(R.string.arenas_title), mContext.getString(R.string.arenas_desc), mContext.getString(R.string.arenas_address), R.drawable.arenas_de_barcelona, Uri.parse(mContext.getString(R.string.arenas_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.barceloneta_title), mContext.getString(R.string.barceloneta_desc), mContext.getString(R.string.barceloneta_address), R.drawable.barceloneta, Uri.parse(mContext.getString(R.string.barceloneta_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.boqueria_title), mContext.getString(R.string.boqueria_desc), mContext.getString(R.string.boqueria_address), R.drawable.boqueria, Uri.parse(mContext.getString(R.string.boqueria_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.camp_nou_title), mContext.getString(R.string.camp_nou_desc), mContext.getString(R.string.camp_nou_address), R.drawable.camp_nou, Uri.parse(mContext.getString(R.string.camp_nou_google_uri))));

        }

        else if(position==3) {
            // Museums
            placesData.add(new Place(mContext.getString(R.string.mnac_title), mContext.getString(R.string.mnac_desc), mContext.getString(R.string.mnac_address), R.drawable.mnac, Uri.parse(mContext.getString(R.string.mnac_google_uri))));
            placesData.add(new Place(mContext.getString(R.string.museum_maritim_title), mContext.getString(R.string.museum_maritim_descr), mContext.getString(R.string.museum_maritim_address), R.drawable.museo_maritim, Uri.parse(mContext.getString(R.string.museum_maritim_google_uri))));
        }

        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("data",placesData);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return mTotalTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.sightseeing_title);
            case 1:
                return mContext.getString(R.string.parks_title);
            case 2:
                return mContext.getString(R.string.activities_title);
            case 3:
                return mContext.getString(R.string.museums_title);
            default:
                return super.getPageTitle(position);
        }
    }
}
