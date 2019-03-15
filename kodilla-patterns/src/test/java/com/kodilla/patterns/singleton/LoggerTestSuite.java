package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("opening");
        Logger.getInstance().log("creating");
        Logger.getInstance().log("closing");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last Log: " + lastLog);
        //Then
        Assert.assertEquals("closing", lastLog);
    }
}
