package com.cyq.desingpattern.observer;

//观察者模式
public class ObserverPattern {

    public static boolean isIsomorphic(String s, String t) {
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "apper";
        String s2 = "booxq";

        System.out.println( isIsomorphic(s1,s2));

    }
}
