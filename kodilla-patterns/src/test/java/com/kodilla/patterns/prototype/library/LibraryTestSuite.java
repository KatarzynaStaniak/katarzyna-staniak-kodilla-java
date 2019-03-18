package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("My Library");
        for (int i = 0; i < 5; i++) {
            library.getBooks().add(new Book("Book " + i, "Author " + i,
                    LocalDate.of(2012, 4, 5 + i)));
        }

        //making a shallow copy of library
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName(library.getName() + " " + 2);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName(library.getName() + " " + 3);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Book 123", "Author 151",
                LocalDate.of(2010, 11, 24)));

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());

        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
        Assert.assertEquals(library.getBooks(), shallowClonedLibrary.getBooks());
    }
}
