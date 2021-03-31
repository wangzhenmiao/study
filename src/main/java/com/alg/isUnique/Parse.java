package com.alg.isUnique;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Parse
 * @Description
 * @Author wangzhen
 * @Date 2021/3/31 12:36 PM
 **/
public class Parse {
    public static boolean isUnique(String astr) {
        //1
        //HashMap的key和value 都 不允许 是 基本数据类型
        //char的引用类型是Character
        //ps:HashMap 的 key 和 value 都可以是 null

        //2
        //map.getOrDefault(key,default),key存在就获取值，不存在就返回default
        HashMap<Character,Integer> map = new HashMap<>();//1
        char[] arr = astr.toCharArray();
        for(int i = 0 ; i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);//2
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
