package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTestOdd() {
        //Given
        Set<Book> booksLibraryA = new HashSet<>();
        booksLibraryA.add(new Book("Jan Nowak", "Granice", 1980, "ABC123"));
        booksLibraryA.add(new Book("Kalina Kowalska", "Poradnik", 2000, "BBB785"));
        booksLibraryA.add(new Book("Piotr Lato", "Cztery pory roku", 2011, "BKO124"));
        booksLibraryA.add(new Book("Bogusław Gruszka", "Przetwory", 1995, "LKJ653"));
        booksLibraryA.add(new Book("Krzysztof Nowak", "Sennik", 1999, "PKU327"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(booksLibraryA);
        System.out.println("Odd number of Books - Median of publication year: " + median);

        //Then
        Assert.assertTrue(median == 1999);
    }

    @Test
    public void publicationYearMedianTestEven() {
        //Given
        Set<Book> booksLibraryA = new HashSet<>();
        booksLibraryA.add(new Book("Jan Nowak", "Granice", 2018, "ABC123"));
        booksLibraryA.add(new Book("Kalina Kowalska", "Poradnik", 2019, "BBB785"));
        booksLibraryA.add(new Book("Piotr Lato", "Cztery pory roku", 2015, "BKO124"));
        booksLibraryA.add(new Book("Bogusław Gruszka", "Przetwory", 1999, "LKJ653"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(booksLibraryA);
        int expectedMedian = (2018 + 2015) / 2;
        System.out.println("Even number of Books - Median of publication year: " + median);
        System.out.println("Expected median: " + expectedMedian);

        //Then
        assertEquals(2016, median);
    }
}
