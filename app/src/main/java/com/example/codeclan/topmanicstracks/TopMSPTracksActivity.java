package com.example.codeclan.topmanicstracks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMSPTracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracks_list);

        TopMSPTracks topMSPTracks = new TopMSPTracks();

        ArrayList<Track> list = topMSPTracks.getList();

        TopMSPTracksAdapter trackAdapter = new TopMSPTracksAdapter(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(trackAdapter);
    }

    public void getTrack(View listItem) {
        Track track = (Track) listItem.getTag();
        Log.d("Track Title: ", track.getTitle());

        Intent intent = new Intent(this, TracksActivity.class);
        intent.putExtra("track", track);
        startActivity(intent);
    }
}
