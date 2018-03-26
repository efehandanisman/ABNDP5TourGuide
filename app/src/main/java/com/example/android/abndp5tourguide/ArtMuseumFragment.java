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
public class ArtMuseumFragment extends Fragment {


    public ArtMuseumFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list, container, false);


        final ArrayList<Sight> ArtMuseums = new ArrayList<>();
        ArtMuseums.add(new Sight(getString(R.string.Sabanci), getString(R.string.SabanciEntry), getString(R.string.SabanciOpening)));
        ArtMuseums.add(new Sight(getString(R.string.Pera), getString(R.string.PeraEntry), getString(R.string.PeraOpening)));
        ArtMuseums.add(new Sight(getString(R.string.IstanbulMod), getString(R.string.IstanbulModEntry), getString(R.string.IstanbulModOpen)));

        SightAdapter adapter = new SightAdapter(getActivity(), ArtMuseums);
        ListView listItemView = (ListView) rootView.findViewById(R.id.list);
        listItemView.setAdapter(adapter);
        return rootView;

    }
}