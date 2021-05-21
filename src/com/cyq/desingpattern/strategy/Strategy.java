package com.cyq.desingpattern.strategy;

//策略接口
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
