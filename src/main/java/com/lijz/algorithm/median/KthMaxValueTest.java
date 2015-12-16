package com.lijz.algorithm.median;

import java.util.Random;

/**
 * Created by jianzhongli on 15/12/15.
 * 寻找第k大的数
 */
public class KthMaxValueTest {

    Random random = new Random();

    public static void main(String[] args){

        KthMaxValueTest test = new KthMaxValueTest();
        int[] array = new int[]{1,5,19,3,7,8,11};
        int value = test.getKthMaxValue(array, 4, 0, array.length - 1);
        System.out.println(value);

    }

    public int getKthMaxValue(int[] array, int k, int p, int r){

        if(p==r){
            return array[p];
        }

        int q = randomPartition(array, p, r);
        int i = q-p+1;
        if(i == k){
            return array[q];
        }

        if(k<i){
            return getKthMaxValue(array, k ,p, q-1);
        }

        return getKthMaxValue(array, k-i, q+1, r);
    }


    private int randomPartition(int[] array, int p, int r){
        int n = r-p;
        int value = random.nextInt(n);
        swap(array, p+value, r);
        return partition(array, p, r);
    }

    private int partition(int[] array, int p, int r){
        int mid = array[r];
        int left = p;
        int right = r-1;
        while(left < right){
            while(array[left] < mid && left < right){
                left++;
            }
            while(array[right] >= mid && left < right){
                right--;
            }
            swap(array, left ,right);
        }
        if(array[left] >= array[r]){
            swap(array, left, r);
        }else{
            left++;
        }

        return left;
    }

    private void swap(int array[], int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
