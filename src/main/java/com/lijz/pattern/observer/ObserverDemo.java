package com.lijz.pattern.observer;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class ObserverDemo {

    public static void main(String[] args){
        Subject subject = new Subject();
        EmailAbserver emailAbserver = new EmailAbserver(subject);
        SmsAbserver smsAbserver = new SmsAbserver(subject);
        subject.setMessage("test observer");
        subject.setMessage("new Message");
    }
}
