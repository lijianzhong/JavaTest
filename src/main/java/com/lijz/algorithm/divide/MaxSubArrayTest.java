package com.lijz.algorithm.divide;

/**
 * Created by jianzhongli on 15/12/12.
 * 最大连续子数组
 */

public class MaxSubArrayTest {

    public static void main(String[] args){

        int[] array = new int[]{13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,4,-7};

        MaxSubArrayTest test = new MaxSubArrayTest();

        SubResult result = test.maxSubArray(array, 0, array.length-1);

        System.out.println("sum =" + result.getSum());
        System.out.println("left = " + result.getLeft());
        System.out.println("right = " + result.getRight());
    }


    public SubResult maxSubArray(int[] array, int left, int right){

        if(array.length == 0){
            SubResult subResult = new SubResult();
            subResult.setLeft(0);
            subResult.setRight(0);
            subResult.setSum(0);
            return subResult;
        }

        if(left >= right){
            SubResult result = new SubResult();
            result.setLeft(left);
            result.setRight(left);
            result.setSum(array[left]);
            return result;
        }

        int mid = (left + right)/2;

        SubResult leftResult = maxSubArray(array, left ,mid);
        SubResult rightResult = maxSubArray(array, mid+1, right);

        int maxLeftSum = Integer.MIN_VALUE;
        int leftIdx = 0;
        int leftSum = 0;
        for(int i=mid; i>=left; i--){
            leftSum += array[i];
            if(leftSum > maxLeftSum){
                maxLeftSum = leftSum;
                leftIdx = i;
            }
        }

        int maxRightSum = Integer.MIN_VALUE;
        int rigthSum = 0;
        int rightIdx = 0;
        for(int i = mid+1; i<=right; i++){
            rigthSum += array[i];
            if(rigthSum > maxRightSum){
                maxRightSum = rigthSum;
                rightIdx = i;
            }
        }

        SubResult midResult = new SubResult();
        midResult.setSum(maxLeftSum + maxRightSum);
        midResult.setLeft(leftIdx);
        midResult.setRight(rightIdx);

        if(leftResult.getSum() > midResult.getSum() && leftResult.getSum() > rightResult.getSum()){
            return leftResult;
        }

        if(rightResult.getSum() > leftResult.getSum() && rightResult.getSum() > midResult.getSum()){
            return rightResult;
        }

        return midResult;


    }



    private class SubResult{

        private int left;

        private int right;

        private int sum;

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }
}
