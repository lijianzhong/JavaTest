package com.lijz.pattern.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by jianzhongli on 16/1/23.
 */
public class Subject {

    private List<Observer> observers = Lists.newArrayList();

    private String message;

    public String getMessage(){

        return message;
    }

    public void setMessage(String message){
        this.message = message;
        notifyAllObservers();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
