package com.lijz.algorithm.sort.insert;

/**
 * Created by jianzhongli on 15/12/4.
 */
public class InsertSort {

    public static void main(String[] args){

        int[] array = new int[]{10,5,15,20,11,30,25,44,48,17};
        InsertSort insertSortTest = new InsertSort();
        insertSortTest.sortAsc(array);
        System.out.println("sort asc");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("sort desc");
        insertSortTest.sortDesc(array);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }

    public void sortAsc(int[] array){
        if(array.length == 0){
            return;
        }
        for(int i=1; i<array.length;i++){
            int tmp = array[i];
            int j=i-1;
            while(j>=0 && array[j]> tmp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = tmp;
        }
    }

    public void sortDesc(int[] array){
        if(array.length == 0){
            return;
        }
        for(int i=1; i<array.length; i++){
            int tmp = array[i];
            int j=i-1;
            while(j>=0 && array[j]<tmp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = tmp;
        }
    }
}
