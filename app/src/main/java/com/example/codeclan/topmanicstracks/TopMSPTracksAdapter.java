package com.example.codeclan.topmanicstracks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sophiemullins on 19/12/2017.
 */

public class TopMSPTracksAdapter extends ArrayAdapter<Track> {

    public TopMSPTracksAdapter(Context context, ArrayList<Track> tracks) {
        super(context, 0, tracks);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tracks_item, parent, false);
        }

        Track currentTrack = getItem(position);
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentTrack.getRanking().toString());

        TextView title =  (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentTrack.getTitle());

        TextView year = (TextView) listItemView.findViewById(R.id.album);
        year.setText(currentTrack.getAlbum().toString());

        listItemView.setTag(currentTrack);

        return listItemView;
    }


    }
