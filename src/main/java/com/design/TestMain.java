package com.design;

/**
 * @ClassName TestMain
 * @Description
 * @Author wangzhen
 * @Date 2021/4/6 6:45 PM
 **/
public class TestMain {

    public static int[] sortArr(int [] arr1,int[] arr2){
        int len = arr1.length + arr2.length;
        int [] ret = new int[len];
        int index1 = arr1.length-1;
        int index2 = arr2.length-1;
        int i = 0;
        while (index1 > 0 && index2 >0){
            if(arr1[index1]<arr2[index2]){
                ret[i] = arr1[index1];
                i++;
                --index1;
            }else {
                ret[i] = arr2[index2];
                i++;
                --index2;
            }
        }
        if(index1 > 0){
            for (int j = index1; j > 0; j--) {
                ret[len -j] = arr1[j];
            }
        }
        if(index2 > 0){
            for (int j = index2; j > 0; j--) {
                ret[len -j] = arr2[j];
            }
        }
        return  ret;
    }


    public static void main(String[] args) {

    }
}
