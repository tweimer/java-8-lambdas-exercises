package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;
import java.util.stream.Stream;

import static java.util.stream.Stream.concat;
import static java.util.stream.Stream.of;

/** A Performance by some musicians - eg an Album or Gig. */
public interface PerformanceFixed {

    String getName();

    Stream<Artist> getMusicians();

    default Stream<Artist> getAllMusicians() {
        return getMusicians().flatMap(artist -> concat(of(artist), artist.getMembers()));
    }

}
