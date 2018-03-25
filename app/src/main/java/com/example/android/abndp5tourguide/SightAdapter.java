package com.example.android.abndp5tourguide;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.view.ViewPager;


import java.util.ArrayList;

/**
 * Created by Efehan on 18.3.2018.
 */

public class SightAdapter extends ArrayAdapter<Sight> {

    public SightAdapter(Context context, ArrayList<Sight> Sight) {
        super(context, 0, Sight);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Sight currentSight = getItem(position);

        TextView SightName = (TextView) listItemView.findViewById(R.id.sightname);
        SightName.setText(currentSight.getSight());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView EntryFee = (TextView) listItemView.findViewById(R.id.sightEntryFee);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        EntryFee.setText(currentSight.getCost());

        ImageView SightImageView = listItemView.findViewById(R.id.sightImage);
        if (currentSight.hasImage()) {
            SightImageView.setImageResource(currentSight.getImageId());
            SightImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            SightImageView.setVisibility(View.GONE);
        }

        TextView OpeningHours = (TextView) listItemView.findViewById(R.id.openingHours);
        OpeningHours.setText(currentSight.getOpeningHours());
        return listItemView;
    }


}
