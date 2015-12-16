package com.lijz.algorithm.median;

/**
 * Created by jianzhongli on 15/12/15.
 */
public class MaxMinumValueTest {

    public static void main(String[] args){

        MaxMinumValueTest test = new MaxMinumValueTest();
        int[] array = new int[]{4,7,2,1};
        try {
            //int max = test.getMax(array);
            //System.out.println(max);
            int min = test.getMin(array);
            System.out.println(min);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getMax(int [] array) throws Exception{
        if(array.length == 0){
            throw new Exception("array is empty");
        }
        int max = array[0];

        for(int i=1; i< array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public int getMin(int [] array) throws Exception{
        if(array.length == 0){
            throw new Exception("array is empty");
        }
        int min = array[0];

        for(int i=1; i< array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
