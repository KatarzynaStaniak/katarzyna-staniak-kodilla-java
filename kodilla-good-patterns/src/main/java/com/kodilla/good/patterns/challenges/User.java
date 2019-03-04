package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String userSurname;

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    @Override
    public String toString() {
        return userName + " " + userSurname;
    }
}
