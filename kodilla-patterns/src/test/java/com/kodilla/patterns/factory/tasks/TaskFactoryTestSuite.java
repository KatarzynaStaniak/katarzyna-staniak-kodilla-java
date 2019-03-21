package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreateDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);
        boolean isExecutedBefore = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean isExecutedAfter = drivingTask.isTaskExecuted();
        //Then
        Assert.assertFalse(isExecutedBefore);
        Assert.assertTrue(isExecutedAfter);
        Assert.assertEquals("driving1", drivingTask.getTaskName());
        DrivingTask myDrivingTask = (DrivingTask) drivingTask;
        Assert.assertEquals("school", myDrivingTask.getWhere());
        Assert.assertEquals("car", myDrivingTask.getUsing());
    }

    @Test
    public void testCreatePaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);
        boolean isExecutedBefore = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean isExecutedAfter = paintingTask.isTaskExecuted();
        //Then
        Assert.assertFalse(isExecutedBefore);
        Assert.assertTrue(isExecutedAfter);
        Assert.assertEquals("painting1", paintingTask.getTaskName());
        PaintingTask myPaintingTask = (PaintingTask) paintingTask;
        Assert.assertEquals("red", myPaintingTask.getColor());
        Assert.assertEquals("walls", myPaintingTask.getWhatToPaint());
    }

    @Test
    public void testCreateShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);
        boolean isExecutedBefore = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean isExecutedAfter = shoppingTask.isTaskExecuted();
        //Then
        Assert.assertFalse(isExecutedBefore);
        Assert.assertTrue(isExecutedAfter);
        Assert.assertEquals("shopping1", shoppingTask.getTaskName());
        ShoppingTask myShoppingTask = (ShoppingTask) shoppingTask;
        Assert.assertEquals("sugar", myShoppingTask.getWhatToBuy());
        Assert.assertEquals(1.5, myShoppingTask.getQuantity(), 0);
    }
}
