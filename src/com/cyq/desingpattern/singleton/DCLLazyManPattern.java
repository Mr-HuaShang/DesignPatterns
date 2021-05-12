package com.cyq.desingpattern.singleton;

/**
 * DCL懒汉式：double check lock ,双重检测锁机制，
 */
public class DCLLazyManPattern {

    //加volatile 关键字是禁止 指令重排序
    private static volatile DCLLazyManPattern dclLazyManPattern;

    private DCLLazyManPattern(){}

    public DCLLazyManPattern getInstance(){
        //第一重检测
        if (dclLazyManPattern == null){
            //注意锁的是当前类的模板
            synchronized (DCLLazyManPattern.class){
                //第2重检测
                if (dclLazyManPattern == null){
                    dclLazyManPattern = new DCLLazyManPattern();
                }
            }
        }

        return dclLazyManPattern;
    }

    /**
     * lazyMan = new LazyMan();
     *
     * 不是原子性操作，至少会经过三个步骤：
     * 1. 分配对象内存空间
     * 2. 执行构造方法初始化对象
     * 3. 设置instance指向刚分配的内存地址，此时instance ！=null；
     *
     * 由于指令重排，导致A线程执行 lazyMan = new LazyMan();的时候，可能先执行了第三步（还没执行第
     * 二步），此时线程B又进来了，发现lazyMan已经不为空了，直接返回了lazyMan，并且后面使用了返回
     * 的lazyMan，由于线程A还没有执行第二步，导致此时lazyMan还不完整，可能会有一些意想不到的错
     * 误，所以就有了下面一种单例模式。
     * 这种单例模式只是在上面DCL单例模式增加一个volatile关键字来避免指令重排：
     */


}
