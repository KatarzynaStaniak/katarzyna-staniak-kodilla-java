package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isTaskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean executeTask() {
        System.out.print("Executing task " + taskName + "... ");
        isTaskExecuted = true;
        System.out.println("Done!");
        return isTaskExecuted;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
