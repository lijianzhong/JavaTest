package com.lijz.algorithm.reversal;

/**
 * Created by jianzhongli on 16/1/25.
 */
public class RotateArray {

    public static void main(String[] args){

        int[] array = new int[]{1,2,3,4,5,6,7};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(array, 3);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void rotate(int[] array, int k){
        if(array == null || array.length == 0){
            return;
        }
        k = k % array.length;

        int idx = array.length-k;
        reverse(array, 0, idx-1);
        reverse(array, idx, array.length-1);
        reverse(array, 0, array.length - 1);

    }

    private void reverse(int[] array, int start, int end){
        while(start < end){
            int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;
            start ++;
            end --;
        }
    }
}
