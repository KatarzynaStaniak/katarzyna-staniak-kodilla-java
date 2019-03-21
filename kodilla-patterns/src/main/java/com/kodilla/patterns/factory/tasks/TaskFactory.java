package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String DRIVING = "DRIVING";
    public final static String PAINTING = "PAINTING";
    public final static String SHOPPING = "SHOPPING";

    public Task createTask(String kindOfTask) {
        switch (kindOfTask) {
            case DRIVING:
                return new DrivingTask("driving1", "school", "car");
            case PAINTING: {
                return new PaintingTask("painting1", "red", "walls");
            }
            case SHOPPING:
                return new ShoppingTask("shopping1", "sugar", 1.5);
            default:
                return null;
        }
    }
}
