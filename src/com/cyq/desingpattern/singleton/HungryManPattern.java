package com.cyq.desingpattern.singleton;

/**
 * 饿汉式：实例化对象时，不管存不存在，直接new
 */
public class HungryManPattern {

    private static HungryManPattern hungryManPattern = new HungryManPattern();

    //重点：私有化构造器
    private HungryManPattern(){}

    public HungryManPattern getInstance(){
        return hungryManPattern;
    }

    //饿汉式缺点，假如当前类有许多属性需要初始化的，比如初始化数组，则会造成内存资源的浪费

}
