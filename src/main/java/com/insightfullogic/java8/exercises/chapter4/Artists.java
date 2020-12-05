package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.Optional;

public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        return (index < 0 || index >= artists.size()) ? Optional.empty() : Optional.ofNullable(artists.get(index));
    }

    public String getArtistName(int index) {
        return getArtist(index).map(Artist::getName).orElse("unknown");
    }

}
