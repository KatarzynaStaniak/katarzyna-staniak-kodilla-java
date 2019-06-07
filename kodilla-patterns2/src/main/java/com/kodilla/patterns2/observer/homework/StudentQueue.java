package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class StudentQueue implements ObservableHomework {
    private final List<ObserverHomework> teachers;
    private final Deque<String> exercises;
    private final String studentname;

    public StudentQueue(String studentname) {
        teachers = new ArrayList<>();
        exercises = new ArrayDeque<>();
        this.studentname = studentname;
    }

    public void addExercise(String exercise) {
        exercises.offer(exercise);
        this.notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomework observer) {
        teachers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomework observer : teachers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomework observer) {
        teachers.remove(observer);
    }

    public String getStudentname() {
        return studentname;
    }

    public Deque<String> getExercises() {
        return exercises;
    }
}
