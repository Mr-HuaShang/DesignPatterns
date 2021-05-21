package com.cyq.desingpattern.observer;

//观察者模式
public class ObserverPattern {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);
        numberGenerator.execute();
    }
}
