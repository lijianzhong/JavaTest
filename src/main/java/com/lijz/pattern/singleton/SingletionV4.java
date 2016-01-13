package com.lijz.pattern.singleton;

/**
 * Created by jianzhongli on 16/1/13.
 */
public class SingletionV4 {

    private static volatile SingletionV4 instance = null;

    private SingletionV4(){

    }

    public static SingletionV4 getInstance(){
        if(instance == null){
            synchronized (SingletionV4.class){
                if(instance == null){
                    instance = new SingletionV4();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("singletionV4 test");
    }

    public static void main(String[] args){

        getInstance().doSomething();
    }
}
