package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        List<String> signatures = new ArrayList<>();
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> booksLibraryb = new HashMap<>();

        for (Book book : bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            booksLibraryb.put(bookSignature, new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }

        return medianPublicationYear(booksLibraryb);
    }
}
