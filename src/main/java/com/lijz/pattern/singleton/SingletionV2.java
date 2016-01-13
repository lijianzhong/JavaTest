package com.lijz.pattern.singleton;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class SingletionV2 {

    private static final SingletionV2 instance = new SingletionV2();

    private SingletionV2(){

    }

    public static SingletionV2 getInstance(){

        return instance;
    }

    public void doSomething(){

        System.out.println("singletionV2 test");
    }

    public static void main(String[] args){

        SingletionV2.getInstance().doSomething();
    }
}
