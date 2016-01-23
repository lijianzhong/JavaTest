package com.lijz.pattern.observer;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class EmailAbserver implements Observer {

    private Subject subject;

    public EmailAbserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("email recive message :"+ subject.getMessage());
    }
}
