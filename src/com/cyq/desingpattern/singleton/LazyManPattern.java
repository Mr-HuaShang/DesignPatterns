package com.cyq.desingpattern.singleton;

/**
 * 懒汉式：实例化对象时，先判断对象是否存在，不存在才new
 */
public class LazyManPattern {

    private static LazyManPattern lazyManPattern;

    //私有化构造器
    private LazyManPattern(){}

    public LazyManPattern getInstance(){
        if (lazyManPattern == null){
            lazyManPattern = new LazyManPattern();
        }
        return lazyManPattern;
    }

    //问题：当多线程同时来获取会有并发问题，可能导致实例化多个lazyManPattern对象
    //可以通过Thread.sleep()方法来放大该事件的发生概率，在new LazyManPattern();之前加 Thread.sleep()

}
