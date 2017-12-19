package com.example.codeclan.topmanicstracks;

import java.util.ArrayList;

/**
 * Created by sophiemullins on 19/12/2017.
 */

public class TopMSPTracks {

    private ArrayList<Track> list;

    public TopMSPTracks() {

        list = new ArrayList<Track>();
        list.add(new Track(1, "Motorcycle Emptiness", "Generation Terrorists") );
        list.add(new Track(2, "Gold against the soul", "Gold Against The Soul"));
        list.add(new Track(3, "If you tolerate this your children will be next", "This is My Truth"));
        list.add(new Track(4, "Kevin Carter", "Everything Must Go"));
        list.add(new Track(5, "You Love us", "Generation Terrorists"));
        list.add(new Track(6, "Yes", "The Holy Bible"));
        list.add(new Track(7, "Repeat", "Generation Terrorists"));
        list.add(new Track(8, "Faster", "Generation Terrorists"));
        list.add(new Track(9, "Stay Beautfiul", "Generation Terrorists"));
        list.add(new Track(10, "Revol", "Generation Terrorists"));
        list.add(new Track(11, "The Everlasting", "This is My Truth"));
        list.add(new Track(12, "My Little Empire", "This is My Truth"));
    }


    public ArrayList<Track> getList() {
        return new ArrayList<Track>(list);
    }
}
