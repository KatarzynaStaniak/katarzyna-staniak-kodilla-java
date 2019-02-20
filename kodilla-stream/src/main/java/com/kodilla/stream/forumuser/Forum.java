package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(1111, "tobiasz", 'M', LocalDate.of(1999, 4, 11), 16));
        forumUsersList.add(new ForumUser(1112, "kalina234", 'F', LocalDate.of(1986, 11, 25), 1));
        forumUsersList.add(new ForumUser(1113, "marlenka22", 'F', LocalDate.of(2001, 1, 3), 0));
        forumUsersList.add(new ForumUser(1114, "stefan", 'M', LocalDate.of(2000, 9, 10), 44));
        forumUsersList.add(new ForumUser(1115, "piotr556", 'M', LocalDate.of(1977, 12, 22), 0));
        forumUsersList.add(new ForumUser(1116, "tobiasz12", 'M', LocalDate.of(1980, 2, 7), 12));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }
}
