package com.base;

/**
 * @ClassName ArrayTest
 * @Description
 * @Author wangzhen
 * @Date 2021/4/9 4:16 PM
 **/
public class ArrayTest {

    public static void main(String[] args) {
        int [] arr = {-9,3,45,5,1,30,-5};
        printArray("排序之前",arr);
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
