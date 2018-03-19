package com.example.android.abndp5tourguide;


import android.annotation.TargetApi;
import android.content.Context;
import android.icu.lang.UScript;
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
public class SurroundingFragment extends Fragment {


    public SurroundingFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);


        final ArrayList<Sight> Surroundings = new ArrayList<>();
        Surroundings.add(new Sight(R.drawable.polkoy, "Polonezköy", "High-range", "Good for weekend"));
        Surroundings.add(new Sight(R.drawable.adalar, "Prince Islands", "Medium-range", "Less crowded at weekdays"));
        Surroundings.add(new Sight(R.drawable.hisar, "Anadoluhisarı", "Medium-range", "Good for romantinc time"));

        SightAdapter adapter = new SightAdapter(getActivity(), Surroundings);
        ListView listItemView = (ListView) rootView.findViewById(R.id.list);
        listItemView.setAdapter(adapter);
        return rootView;

    }
}