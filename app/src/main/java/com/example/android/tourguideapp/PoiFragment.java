package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PoiFragment extends Fragment {


    public PoiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.wroclaw_rynek_16na9,
                getResources().getString(R.string.market_square_title),
                getResources().getString(R.string.market_square_description)));
        places.add(new Place(R.drawable.wroclaw_fontanna_16na9,
                getResources().getString(R.string.fountain_title),
                getResources().getString(R.string.fountain_description)));
        places.add(new Place(R.drawable.krasnale,
                getResources().getString(R.string.dwarfs_title),
                getResources().getString(R.string.dwarfs_description)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }

}
