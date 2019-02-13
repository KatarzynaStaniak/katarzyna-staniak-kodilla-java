package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerUser;
    private double avgNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersNumber = statistics.usersNames().size();
        this.postsNumber = statistics.postsCount();
        this.commentsNumber = statistics.commentsCount();

        if (usersNumber != 0) {
            this.avgNumberOfCommentsPerUser = ((double) this.commentsNumber) / this.usersNumber;
            this.avgNumberOfPostsPerUser = ((double) this.postsNumber) / this.usersNumber;
        } else {
            this.avgNumberOfCommentsPerUser = 0;
            this.avgNumberOfPostsPerUser = 0;
        }

        if (postsNumber != 0) {
            this.avgNumberOfCommentsPerPost = ((double) this.commentsNumber) / this.postsNumber;
        } else {
            this.avgNumberOfCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Users number: " + this.usersNumber);
        System.out.println("Posts number: " + this.postsNumber);
        System.out.println("Comments number: " + this.commentsNumber);
        System.out.println("Average number of posts per user: " + this.avgNumberOfPostsPerUser);
        System.out.println("Average number of comments per user: " + this.avgNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + this.avgNumberOfCommentsPerPost);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAvgNumberOfPostsPerUser() {
        return avgNumberOfPostsPerUser;
    }

    public double getAvgNumberOfCommentsPerUser() {
        return avgNumberOfCommentsPerUser;
    }

    public double getAvgNumberOfCommentsPerPost() {
        return avgNumberOfCommentsPerPost;
    }
}
