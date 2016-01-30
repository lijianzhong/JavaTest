package com.lijz.bit;

/**
 * Created by jianzhongli on 16/1/27.
 */
public class SingleNumber {

    public static void main(String[] args){

        SingleNumber singleNumber = new SingleNumber();
        int[] array = new int[]{1,1,2,2,3,3,4};
        System.out.println(singleNumber.getSingleNumber(array));
    }

    public int getSingleNumber(int [] array){

        int result = 0;

        for(int i=0; i< array.length; i++){
            result = result ^ array[i];
        }

        return result;
    }
}
