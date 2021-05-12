package com.cyq.desingpattern.singleton;

/**
 * 枚举单例模式：不需要开发自己保证线程的安全，同时又可以有效的防止反射破坏我们的单例模式
 */
public enum EnumSingleton {

    INSTANCE;

    //实际的业务处理方法
    public void sayHello(){
        System.out.println("hello EnumSingleton!");
    }

    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.sayHello();
    }

}
