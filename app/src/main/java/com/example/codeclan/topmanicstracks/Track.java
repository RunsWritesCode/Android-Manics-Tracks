package com.example.codeclan.topmanicstracks;

import java.io.Serializable;

/**
 * Created by sophiemullins on 19/12/2017.
 */

public class Track implements Serializable {

    private Integer ranking;
    private String title;
    private String album;

    public Track(Integer ranking, String title, String album) {
        this.ranking = ranking;
        this.title = title;
        this.album = album;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }
}
