package com.lijz.queue.delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by jianzhongli on 15/12/3.
 */
public class DelayObject implements Delayed{

    private String data;

    private Long startTime;

    public DelayObject(String data, Long delayTime){
        this.data = data;
        this.startTime = System.currentTimeMillis() + delayTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return startTime - System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        if(!(o instanceof DelayObject)){
            return 0;
        }
        DelayObject delayObject = (DelayObject)o;
        if(this.getStartTime() < delayObject.getStartTime()){
            return -1;
        }
        if(this.getStartTime() > delayObject.getStartTime()){
            return 1;
        }
        return 0;
    }
}
