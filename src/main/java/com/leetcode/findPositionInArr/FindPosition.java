package com.leetcode.findPositionInArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName FindPosition
 * @Description
 * @Author wangzhen
 * @Date 2021/4/10 9:20 PM
 **/
public class FindPosition {

    public static void main(String[] args) {
        Integer [] ret = {-1,-1};
        for(int i=0;i<2;i++){
            System.out.println("1111"+ret[i]);
        }
        System.out.println("2222:"+ret.length);
        List<Integer> list = new ArrayList<>(ret.length);
        Collections.fill(list,-1);
        System.out.println("after fill :"+list.size());
        Collections.addAll(list,ret);
        System.out.println("after addAll :"+list.size());
        System.out.println("-----------------");
        System.out.println(list);



        Integer[] intArray3 = new Integer[2];
        List<Integer> list3 = new ArrayList<Integer>(intArray3.length);
        System.out.println("3333:"+list3.size());
        Collections.addAll(list3, intArray3);
        System.out.println("44444:"+list3.size());
        list3.add(3);
        System.out.println(list3);

       // Collections.fill(list, ret);
    }

/*    public int[] searchRange(int[] nums, int target) {
        int [] ret = {-1,-1};
        for(int i=0;i<2;i++){
            System.out.println("1111"+ret[i]);
        }
        System.out.println("2222:"+ret.length);
        ArrayList<Integer> list = new ArrayList<Integer>(ret.length);
        Collections.fill(list, ret);
        System.out.println("xxxx："+list);
        for(int i = 0;i<nums.length;i++){
            if(target == nums[i]){
                if(list.get(0).equals(list.get(1))){
                    list.set(0,i);
                }else{
                    list.set(1,i);
                }
            }
            //
             if((!list.get(0).equals(list.get(1))) && (list.get(1).equals(-1))){
                 list.set(1,list.get(0));
             }
        }
        return new int []{list.get(0),list.get(1)};
    }*/
}
