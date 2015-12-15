package com.lijz.algorithm.sort.quick;

import java.util.Random;

/**
 * Created by jianzhongli on 15/12/14.
 */
public class QuickSortTest {

    Random random = new Random();

    public static void main(String[] args){
        int[] array = new int[]{2,8,7,1,3,5,6,4};
        QuickSortTest test = new QuickSortTest();
        test.quickSort(array, 0 , array.length-1);
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void quickSort(int [] array, int p, int r){
        if (p >= r)
            return;
        int q = randomPartition(array, p, r);
        quickSort(array, p, q-1);
        quickSort(array, q+1, r);
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
