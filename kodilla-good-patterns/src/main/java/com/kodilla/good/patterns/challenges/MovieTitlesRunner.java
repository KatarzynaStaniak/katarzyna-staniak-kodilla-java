package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;

public class MovieTitlesRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> movies = movieStore.getMovies();

        String moviesTitles = movies.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .reduce("", (text, movieName) -> text = text + '!' + movieName);

        System.out.println(moviesTitles);
    }
}
