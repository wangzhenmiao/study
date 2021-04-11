package com.leetcode.isUnique;

import java.util.HashMap;

/**
 * @ClassName isUnique
 * @Description
 * @Author wangzhen
 * @Date 2021/3/31 12:32 PM
 **/
public class isUnique {

    public static boolean isUnique(String astr) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = astr.toCharArray();
        for(int i = 0 ; i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            //map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i = 0;i < arr.length;i++){
            if(map.get(arr[i]) > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(isUnique(str));
    }
}
