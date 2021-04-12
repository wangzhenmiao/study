package com.base;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArrayTest
 * @Description
 * @Author wangzhen
 * @Date 2021/4/9 4:16 PM
 **/
public class ArrayTest {

    public static void main(String[] args) {
        int [] arr = {-9,3,2,45,2,5,1,30,-5};
        printArray("排序之前",arr);
        // part1:Arrays.sort函数，会对数组中的int进行排序
        Arrays.sort(arr);
        printArray("排序之后：",arr);
        int value = 2;
        // part2:Arrays.binarySearch，可以查找数组中指定值的索引
        int index = Arrays.binarySearch(arr,value);
        System.out.println("元素值为:"+value+"的索引为index:"+index);
        System.out.println("=====================");
        int array[] = new int[6];
        // part3: Arrays.fill(arr,value),把arr数组中，填充满value
        Arrays.fill(array, 100);
        printArray("填充数组：",array);
        // part4:Arrays.fill(arr ,starindex ,endindex ,value)
        // 填充数组arr索引从startindex到endindex的值为value
        Arrays.fill(array, 3, 6, 50);
        printArray("修改填充数组：",array);

        //part5:数组转list
        String [] arrStr = {"abc","bcd","efg","haha"};
        List<String> listFromArrStr = Arrays.asList(arrStr);
        System.out.println("listFromArrStr:"+listFromArrStr);
        Integer [] arrInt = {1,3,4,5};
        List<Integer> listFromArr = Arrays.asList(arrInt);
        System.out.println("listFromArr:"+listFromArr);
    }

    private static void printArray(String message, int array[]) {
        System.out.println(message
                + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
