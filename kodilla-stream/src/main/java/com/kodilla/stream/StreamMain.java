package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(", \n", "<<", ">>"));
//
//        System.out.println(theResultStringOfBooks);

        //Zadanie ForumUser
        LocalDate currentDate = LocalDate.now();

        Forum forum = new Forum();
        Map<Integer, ForumUser> theMapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), currentDate).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostsNumber() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        theMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
