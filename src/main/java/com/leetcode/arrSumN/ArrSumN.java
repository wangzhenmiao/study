package com.leetcode.arrSumN;

/**
 * @ClassName ArrSumN
 * @Description
 * @Author wangzhen
 * @Date 2021/4/9 5:47 PM
 **/
public class ArrSumN {
    public static void main(String[] args) {
        int [] arr = {3,4,5,4,3,2,5,7};
        int k = 8;
        int count = 0;
        //
        for (int i = 0; i < arr.length; i++) {
            int tmpSum = 0;
            for (int j = i; j < arr.length; j++) {
                tmpSum = tmpSum + arr[j];
                if(tmpSum == k){
                    count++;
                }
            }
        }
        //return count;
    }
}
