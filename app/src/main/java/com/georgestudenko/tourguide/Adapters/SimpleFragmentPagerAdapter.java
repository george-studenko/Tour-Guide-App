package com.georgestudenko.tourguide.Adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.widget.ListView;

import com.georgestudenko.tourguide.Models.Place;
import com.georgestudenko.tourguide.PlacesListFragment;
import com.georgestudenko.tourguide.R;

import java.util.ArrayList;


/**
 * Created by george on 22/04/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentStatePagerAdapter{
private int mTotalTabs = 3;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        PlacesListFragment fragment =  new PlacesListFragment();
        // set Adapter data
        ArrayList<Place> placesData = new ArrayList<>();

        if(position==0) {
            placesData.add(new Place("Arc de Triomf", "The Arc de Triomf was built as the gateway to the fair which was held in the Parc de la Ciutadella. The monument is classical in shape and proportions and features ground-breaking sculptural and decorative finishes replete with symbolism. It has become one of the city's iconic landmarks.", "Passeig de Lluís Companys, 17 08018 Barcelona", R.drawable.arc_de_triomf, Uri.parse("google.navigation:q=Arco+del+Triunfo+de+Barcelona")));
            placesData.add(new Place("Sagrada Familia", "The Basílica i Temple Expiatori de la Sagrada Família is a large Roman Catholic church in Barcelona, designed by Catalan architect Antoni Gaudí. The building is part of a UNESCO World Heritage Site, Construction of Sagrada Família commenced in 1882.", "Plaça de Gaudí, 253, 08013 Barcelona", R.drawable.sagrada_familia, Uri.parse("google.navigation:q=La+Sagrada+Familia+Barcelona")));
            placesData.add(new Place("Plaza España", "One of Barcelona's most important squares, built on the occasion of the 1929 International Exhibition, held at the foot of Montjuïc. It is the junction of several major thoroughfares: Gran Via, Avinguda del Paral·lel, Creu Coberta and Carrer de Tarragona", "Plaça d'Espanya, 08004 Barcelona", R.drawable.plaza_espana, Uri.parse("google.navigation:q=Plaça+d'Espanya,+08004+Barcelona")));
            placesData.add(new Place("Torre Agbar", "A 38-story skyscraper located between Avinguda Diagonal and Carrer Badajoz,which marks the gateway to the new technological district of Barcelona. Named after its owners, the Agbar Group, a holding company whose interests include the Barcelona water company Aigües de Barcelona.", "Torre Agbar 08018 Barcelona", R.drawable.torre_agbar, Uri.parse("google.navigation:q=Agbar+Tower+Barcelona")));
            placesData.add(new Place("Arc de Triomf", "The Arc de Triomf was built as the gateway to the fair which was held in the Parc de la Ciutadella. The monument is classical in shape and proportions and features ground-breaking sculptural and decorative finishes replete with symbolism. It has become one of the city's iconic landmarks.", "Passeig de Lluís Companys, 17 08018 Barcelona", R.drawable.arc_de_triomf, Uri.parse("google.navigation:q=Arco+del+Triunfo+de+Barcelona")));
        }
        else if(position==1) {
            placesData.add(new Place("Plaza España", "One of Barcelona's most important squares, built on the occasion of the 1929 International Exhibition, held at the foot of Montjuïc. It is the junction of several major thoroughfares: Gran Via, Avinguda del Paral·lel, Creu Coberta and Carrer de Tarragona", "Plaça d'Espanya, 08004 Barcelona", R.drawable.plaza_espana, Uri.parse("google.navigation:q=Plaça+d'Espanya,+08004+Barcelona")));
            placesData.add(new Place("Torre Agbar", "A 38-story skyscraper located between Avinguda Diagonal and Carrer Badajoz,which marks the gateway to the new technological district of Barcelona. Named after its owners, the Agbar Group, a holding company whose interests include the Barcelona water company Aigües de Barcelona.", "Torre Agbar 08018 Barcelona", R.drawable.torre_agbar, Uri.parse("google.navigation:q=Agbar+Tower+Barcelona")));
            placesData.add(new Place("Arc de Triomf", "The Arc de Triomf was built as the gateway to the fair which was held in the Parc de la Ciutadella. The monument is classical in shape and proportions and features ground-breaking sculptural and decorative finishes replete with symbolism. It has become one of the city's iconic landmarks.", "Passeig de Lluís Companys, 17 08018 Barcelona", R.drawable.arc_de_triomf, Uri.parse("google.navigation:q=Arco+del+Triunfo+de+Barcelona")));
        }

        else if(position==2) {
            placesData.add(new Place("Torre Agbar", "A 38-story skyscraper located between Avinguda Diagonal and Carrer Badajoz,which marks the gateway to the new technological district of Barcelona. Named after its owners, the Agbar Group, a holding company whose interests include the Barcelona water company Aigües de Barcelona.", "Torre Agbar 08018 Barcelona", R.drawable.torre_agbar, Uri.parse("google.navigation:q=Agbar+Tower+Barcelona")));
            placesData.add(new Place("Plaza España", "One of Barcelona's most important squares, built on the occasion of the 1929 International Exhibition, held at the foot of Montjuïc. It is the junction of several major thoroughfares: Gran Via, Avinguda del Paral·lel, Creu Coberta and Carrer de Tarragona", "Plaça d'Espanya, 08004 Barcelona", R.drawable.plaza_espana, Uri.parse("google.navigation:q=Plaça+d'Espanya,+08004+Barcelona")));
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
                return "Sightseeing";
            case 1:
                return "Parks";
            case 2:
                return "Activities";
            default:
                return super.getPageTitle(position);
        }
    }
}
