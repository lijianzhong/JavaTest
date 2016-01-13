package com.lijz.pattern.singleton;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class SingletionV3 {

    private static SingletionV3 instance = null;

    public static synchronized SingletionV3 getInstance(){
        if(instance == null){
            instance = new SingletionV3();
        }
        return instance;
    }

    private SingletionV3(){

    }

    public void doSomething(){
        System.out.println("singletionV3 test");
    }

    public static void main(String[] args){
        getInstance().doSomething();
    }
}
