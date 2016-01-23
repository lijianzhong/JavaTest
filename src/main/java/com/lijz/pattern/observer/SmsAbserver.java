package com.lijz.pattern.observer;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class SmsAbserver implements Observer{

    private Subject subject;

    public SmsAbserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("sms recive message :" + subject.getMessage());
    }
}
