package com.lijz.pattern.singleton;

/**
 * Created by jianzhongli on 16/1/13.
 */
public enum  SingletonV1 {
    INSTANCE;

    public void doSomething(){

        System.out.println("singletionV1 test");
    }

    public static void main(String[] args){
        INSTANCE.doSomething();
    }


}
