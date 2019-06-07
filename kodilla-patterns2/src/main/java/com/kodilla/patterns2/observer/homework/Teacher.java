package com.kodilla.patterns2.observer.homework;

public class Teacher implements ObserverHomework {
    private final String teacherName;
    private int updateCount;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(StudentQueue studentQueue) {
        System.out.println(teacherName + ": New exercise to check from " + studentQueue.getStudentname() + "\n" +
                " (total number of exercises: " + studentQueue.getExercises().size());
        updateCount++;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
