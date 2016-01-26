package com.lijz.algorithm.merge;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jianzhongli on 16/1/26.
 */
public class MergeInterval {

    public static void main(String[] args){

        List<Interval> intervals = Lists.newArrayList();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));

        MergeInterval mergeInterval = new MergeInterval();
        List<Interval> mergeIntervals = mergeInterval.merge(intervals);
        for(Interval interval : mergeIntervals){
            System.out.println(interval.getStart() + ":" + interval.getEnd());
        }
    }

    public List<Interval> merge(List<Interval> intervals){
        if(intervals.isEmpty() || intervals.size() == 1){
            return intervals;
        }
        List<Interval> mergeIntervals = Lists.newArrayList();
        Collections.sort(intervals, IntervalComparator.INSTATNCE);
        Interval pre = intervals.get(0);
        for(int i =1; i<intervals.size(); i++){
            Interval current = intervals.get(i);
            //不相交
            if(pre.getEnd() < current.getStart()){
                mergeIntervals.add(pre);
                pre = current;
            }else{
                Interval newInterval = new Interval(pre.getStart(), Math.max(pre.getEnd(), current.getEnd()));
                pre = newInterval;
            }
        }
        mergeIntervals.add(pre);
        return mergeIntervals;
    }

    public enum IntervalComparator implements Comparator<Interval>{
        INSTATNCE;

        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.getStart() - o2.getStart();
        }
    }

    private static class Interval{

        private int start;

        private int end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
