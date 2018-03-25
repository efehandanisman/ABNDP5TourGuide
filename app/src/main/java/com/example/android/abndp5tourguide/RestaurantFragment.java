package com.example.android.abndp5tourguide;


import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);


        final ArrayList<Sight> Restaurants = new ArrayList<>();
        Restaurants.add(new Sight(R.drawable.adana, getString(R.string.Adana), getString(R.string.AdanaRange), getString(R.string.AdanaHours)));
        Restaurants.add(new Sight(R.drawable.ciya, getString(R.string.Ciya), getString(R.string.CiyaRange), getString(R.string.CiyaHours)));
        Restaurants.add(new Sight(R.drawable.nusret, getString(R.string.Nusret), getString(R.string.NusretRange), getString(R.string.NusretHours)));
        Restaurants.add(new Sight(R.drawable.vira, getString(R.string.Vira), getString(R.string.ViraRange), getString(R.string.ViraHours)));
        SightAdapter adapter = new SightAdapter(getActivity(), Restaurants);
        ListView listItemView = (ListView) rootView.findViewById(R.id.list);
        listItemView.setAdapter(adapter);
        return rootView;

    }
}