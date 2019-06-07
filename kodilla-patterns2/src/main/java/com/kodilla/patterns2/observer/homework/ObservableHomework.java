package com.kodilla.patterns2.observer.homework;

public interface ObservableHomework {
    void registerObserver(ObserverHomework observer);
    void notifyObservers();
    void removeObserver(ObserverHomework observer);
}
