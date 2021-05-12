package com.cyq.desingpattern.singleton;


/**
 * 静态内部类的懒汉式：(当前对完美的写法，大多是使用这种方式就足够了)
 * 1、jvm保证线程安全，因为每个类只会被虚拟机加载一次，因此对应的静态实例只会有一个
 * 2、加载外部类时，不会加载内部类
 */
public class StaticInnerClassSingleton {

    //私有化构造方法
    private StaticInnerClassSingleton(){}

    //加载外部类时，不会加载内部类,因此这段代码并不会一开始就加载
    private static class StaticInnerClass{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    //只有调用获取实例的方法时再加载内部类
    public StaticInnerClassSingleton getInstance(){
        return StaticInnerClass.INSTANCE;
    }

}
