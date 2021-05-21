package com.cyq.desingpattern.strategy;

public class Hand {

    public static final int HANDVALUE_GUU=0; //表示 石头的 值
    public static final int HANDVALUE_CHO=1; //表示 剪刀的 值
    public static final int HANDVALUE_PAA=2; //表示 布 的 值

    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };

    public static final String[] name = {
            "石头",
            "剪刀",
            "布"
    };

    private int handvalue;

    private Hand(int handvalue){
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue){
        return hand[handvalue];
    }

    //如果this 胜了 则返回 true
    public boolean isStrongerThen(Hand h){
        return fight(h) == 1;
    }

    //如果this 输了 则返回 true
    public boolean isWeakerThen(Hand h){
        return fight(h) == -1;
    }

    //计分：平0，胜1，负-1
    private int fight(Hand h) {
        if(this == h){
            return 0;
        }else if((this.handvalue + 1) % 3 == h.handvalue){//当前手势的值加1，模上3，等于当前的值，说明胜利
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handvalue=" + handvalue +
                '}';
    }
}
