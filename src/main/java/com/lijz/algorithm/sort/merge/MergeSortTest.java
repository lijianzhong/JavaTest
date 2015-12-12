package com.lijz.algorithm.sort.merge;

/**
 * Created by jianzhongli on 15/12/12.
 */
public class MergeSortTest {

    public static  void main(String[] args){
        int a[] = {1,7,3,4,5,10,6,8,2,9};
        MergeSortTest test = new MergeSortTest();
        test.mergeSort(a, 0, a.length-1);
        for(int i = 0; i<a.length ; i++){
            System.out.println(a[i]);
        }
    }

    public void mergeSort(int[] array, int p, int r){
        int q = (p+r)/2;
        if(p<r){
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);
            merge(array, p, q, r);
        }
    }

    public void merge(int[] array, int p, int q, int r){
        int[] array1 = new int[q-p+1];
        int[] array2 = new int[r-q];

        for(int i = 0; i<array1.length; i++){
            array1[i] = array[p+i];
        }

        for(int j = 0 ; j<array2.length; j++){
            array2[j] = array[q+j+1];
        }

        int i=0;
        int j=0;
        int k=p;
        while(i<array1.length && j<array2.length){
            if(array1[i]<=array2[j]){
                array[k++] = array1[i];
                i++;
            }else{
                array[k++] = array2[j];
                j++;
            }
        }
        while(i<array1.length){
            array[k++] = array1[i];
            i++;
        }

        while(j<array2.length){
            array[k++] = array2[j];
            j++;
        }
    }
}
