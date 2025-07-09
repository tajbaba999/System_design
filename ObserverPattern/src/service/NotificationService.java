package service;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }
    public void notifyUsers(String message){
        for (Observer observer: observers){
            observer.update(message);
        }
    }
}
