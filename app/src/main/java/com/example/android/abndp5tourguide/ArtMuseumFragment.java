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
        ArtMuseums.add(new Sight("Sabancı Museum", "20TL", "10-17"));
        ArtMuseums.add(new Sight("Pera Museum", "30TL-Free on Friday", "10-18"));
        ArtMuseums.add(new Sight( "Istanbul Modern Arts", "40TL-Free on Thursday", "10-18"));

        SightAdapter adapter = new SightAdapter(getActivity(), ArtMuseums);
        ListView listItemView = (ListView) rootView.findViewById(R.id.list);
        listItemView.setAdapter(adapter);
        return rootView;

    }
}