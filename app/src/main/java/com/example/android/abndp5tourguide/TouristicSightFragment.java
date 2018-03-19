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
public class TouristicSightFragment extends Fragment {


    public TouristicSightFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);


        final ArrayList<Sight> touristicsights = new ArrayList<>();
        touristicsights.add(new Sight(R.drawable.bluemosque, "Blue Mosque", "Free", "09-17"));
        touristicsights.add(new Sight(R.drawable.ayasofya, "Hagiasophia", "50TL", "09-17"));
        touristicsights.add(new Sight(R.drawable.topkapi, "Topkapi Palace", "50TL", "09-17"));

        SightAdapter adapter = new SightAdapter(getActivity(), touristicsights);
        ListView listItemView = (ListView) rootView.findViewById(R.id.list);
        listItemView.setAdapter(adapter);
        return rootView;

    }
}