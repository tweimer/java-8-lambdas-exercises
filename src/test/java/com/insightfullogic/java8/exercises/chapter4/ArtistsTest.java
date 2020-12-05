package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

public class ArtistsTest {

    private final Artists optionalExamples = new Artists(SampleData.getThreeArtists());

    @Test
    public void indexWithinRange() {
        Optional<Artist> artist = optionalExamples.getArtist(0);
        assertTrue("Index within range", artist.isPresent());
    }

    public void indexOutsideRange() {
        Optional<Artist> artist = optionalExamples.getArtist(4);
        assertTrue("Index outside range", artist.isEmpty());
    }

    @Test
    public void nameIndexInsideRange() {
        String artistName = optionalExamples.getArtistName(0);
        assertEquals("John Coltrane", artistName);
    }

    @Test
    public void nameIndexOutsideRange() {
        String artistName = optionalExamples.getArtistName(4);
        assertEquals("unknown", artistName);
    }

}
