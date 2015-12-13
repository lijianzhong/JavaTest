package com.lijz.algorithm.sort.heap;

/**
 * Created by jianzhongli on 15/12/13.
 */
public class HeapSortTest {


    public static void main(String[] args){

        int[] array = new int[]{27,17,3,16,13,10,1,5,7,12,4,8,9,0};
        HeapSortTest test = new HeapSortTest();
        //test.maxHeapify(array,2);
        //test.minHeapify(array, 0);
        //test.buildMaxHeap(array, array.length);
        test.heapSort(array);
        for(int i = 0; i<array.length ; i++){
            System.out.println(array[i]);
        }
    }


    public void heapSort(int array[]){

        if(array.length == 0){
            return;
        }

        buildMaxHeap(array, array.length);

        int length = array.length;
        for(int i= array.length-1; i >=1; i--){
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            length = length - 1;
            maxHeapify(array, 0, length);
        }
    }

    /*
    从叶子节点从下向上通过维护最大堆建堆
     */
    public void buildMaxHeap(int array[], int length){
        if(length == 0){
            return;
        }

        for(int i = length/2; i>=0; i--){
            maxHeapify(array, i, length);
        }
    }



    /*
    维护最大堆
     */
    public void maxHeapify(int array[], int i, int length){

        int l = 2*i+1;
        int r = 2*i+2;

        int largestIdx = i;
        if(l<=length-1 && array[i] < array[l]){
            largestIdx = l;
        }else{
            largestIdx = i;
        }

        if(r<=length-1 && array[r] > array[largestIdx]){
            largestIdx = r;
        }

        if(largestIdx != i){
            int tmp = array[i];
            array[i] = array[largestIdx];
            array[largestIdx] = tmp;
            maxHeapify(array, largestIdx, length);
        }
    }

    //维护最小堆
    public void minHeapify(int array[], int i){

        int l = 2*i+1;
        int r = 2*i+2;

        int minIdx = i;
        if(l<array.length-1 && array[i] > array[l]){
            minIdx = l;
        }

        if(r<array.length-1 && array[r] < array[minIdx]){
            minIdx = r;
        }

        if(minIdx != i){
            int tmp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = tmp;
            minHeapify(array, minIdx);
        }
    }
}
