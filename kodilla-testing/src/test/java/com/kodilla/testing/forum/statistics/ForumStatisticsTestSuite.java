package com.kodilla.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    Statistics stats;
    ForumStatistics forumStats;
    List<String> users;
    private static int testNumber = 0;

    @Before
    public void beforeEachTest() {
        stats = mock(Statistics.class);
        forumStats = new ForumStatistics();
        users = new ArrayList<>();
        testNumber++;
        System.out.println("Beginning of Test#" + testNumber);
    }

    @After
    public void afterEachTest() {
        forumStats.showStatistics();
        System.out.println();
    }

    @Test
    public void testAdvStatsZeroPosts() {
        //Given
        users.add("Kate");
        users.add("Adam");
        users.add("Paul");
        when(stats.postsCount()).thenReturn(0);
        when(stats.commentsCount()).thenReturn(30);
        when(stats.usersNames()).thenReturn(users);

        //When
        forumStats.calculateAdvStatistics(stats);

        //Then
        Assert.assertEquals(0, forumStats.getAvgNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(((double) 30) / users.size(), forumStats.getAvgNumberOfCommentsPerUser(), 0);
        Assert.assertEquals(((double) 0) / users.size(), forumStats.getAvgNumberOfPostsPerUser(), 0);
    }

    @Test
    public void testAdvStats1000Posts() {
        //Given
        users.add("Kate");
        users.add("Adam");
        users.add("Paul");
        users.add("Ann");
        when(stats.postsCount()).thenReturn(1000);
        when(stats.commentsCount()).thenReturn(2000);
        when(stats.usersNames()).thenReturn(users);

        //When
        forumStats.calculateAdvStatistics(stats);

        //Then
        Assert.assertEquals(((double) 2000) / 1000, forumStats.getAvgNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(((double) 2000) / users.size(), forumStats.getAvgNumberOfCommentsPerUser(), 0);
        Assert.assertEquals(((double) 1000) / users.size(), forumStats.getAvgNumberOfPostsPerUser(), 0);
    }

    @Test
    public void testAdvStatsZeroComments() {
        //Given
        users.add("Kate");
        users.add("Paul");
        users.add("Ann");
        when(stats.postsCount()).thenReturn(1000);
        when(stats.commentsCount()).thenReturn(0);
        when(stats.usersNames()).thenReturn(users);

        //When
        forumStats.calculateAdvStatistics(stats);

        //Then
        Assert.assertEquals(((double) 0) / 1000, forumStats.getAvgNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(((double) 0) / users.size(), forumStats.getAvgNumberOfCommentsPerUser(), 0);
        Assert.assertEquals(((double) 1000) / users.size(), forumStats.getAvgNumberOfPostsPerUser(), 0);
    }

    @Test
    public void testAdvStatsMorePosts() {
        //Given
        users.add("Kate");
        users.add("Paul");
        users.add("Ann");
        users.add("Julia");
        when(stats.postsCount()).thenReturn(120);
        when(stats.commentsCount()).thenReturn(20);
        when(stats.usersNames()).thenReturn(users);

        //When
        forumStats.calculateAdvStatistics(stats);

        //Then
        Assert.assertEquals(((double) 20) / 120, forumStats.getAvgNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(((double) 20) / users.size(), forumStats.getAvgNumberOfCommentsPerUser(), 0);
        Assert.assertEquals(((double) 120) / users.size(), forumStats.getAvgNumberOfPostsPerUser(), 0);
    }

    @Test
    public void testAdvStatsMoreComments() {
        //Given
        users.add("Kate");
        users.add("Paul");
        users.add("Ann");
        users.add("Julia");
        users.add("Steven");
        when(stats.postsCount()).thenReturn(87);
        when(stats.commentsCount()).thenReturn(451);
        when(stats.usersNames()).thenReturn(users);

        //When
        forumStats.calculateAdvStatistics(stats);

        //Then
        Assert.assertEquals(((double) 451) / 87, forumStats.getAvgNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(((double) 451) / users.size(), forumStats.getAvgNumberOfCommentsPerUser(), 0);
        Assert.assertEquals(((double) 87) / users.size(), forumStats.getAvgNumberOfPostsPerUser(), 0);
    }

    @Test
    public void testAdvStatsZeroUsers() {
        //Given
        when(stats.postsCount()).thenReturn(36);
        when(stats.commentsCount()).thenReturn(215);
        when(stats.usersNames()).thenReturn(users);

        //When
        forumStats.calculateAdvStatistics(stats);

        //Then
        Assert.assertEquals(((double) 215) / 36, forumStats.getAvgNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(0, forumStats.getAvgNumberOfCommentsPerUser(), 0);
        Assert.assertEquals(0, forumStats.getAvgNumberOfPostsPerUser(), 0);
    }

    @Test
    public void testAdvStats100Users() {
        //Given
        String testName;
        for (int i = 0; i < 100; i++) {
            testName = "TestUser" + i;
            users.add(testName);
        }

        when(stats.postsCount()).thenReturn(35);
        when(stats.commentsCount()).thenReturn(420);
        when(stats.usersNames()).thenReturn(users);

        //When
        forumStats.calculateAdvStatistics(stats);

        //Then
        Assert.assertEquals(((double) 420) / 35, forumStats.getAvgNumberOfCommentsPerPost(), 0);
        Assert.assertEquals(((double) 420) / users.size(), forumStats.getAvgNumberOfCommentsPerUser(), 0);
        Assert.assertEquals(((double) 35) / users.size(), forumStats.getAvgNumberOfPostsPerUser(), 0);
    }


}