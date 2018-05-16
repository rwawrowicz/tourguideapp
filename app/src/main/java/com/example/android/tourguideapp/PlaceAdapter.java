package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wawr1 on 13.05.2018.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.signle_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeNameTextView = listItemView.findViewById(R.id.place_name);
        placeNameTextView.setText(currentPlace.getPlaceName());

        TextView placeDescriptionTextView = listItemView.findViewById(R.id.place_description);
        placeDescriptionTextView.setText(currentPlace.getPlaceDescription());

        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currentPlace.getImageResourceId());

        return listItemView;
    }
}
