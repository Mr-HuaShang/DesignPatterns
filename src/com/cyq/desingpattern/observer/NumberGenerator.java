package com.cyq.desingpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

//Subject(抽象的被观察对象)
public abstract class NumberGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    //向观察者发送通知
    public void notifyObservers(){
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
