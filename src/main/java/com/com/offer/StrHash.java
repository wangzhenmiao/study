package com.com.offer;

import java.util.*;

/**
 * @ClassName StrHash
 * @Description
 * @Author wangzhen
 * @Date 2021/4/8 12:58 PM
 **/
public class StrHash {
/*    给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

    示例:

    输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
    输出:
            [
            ["ate","eat","tea"],
            ["nat","tan"],
            ["bat"]
            ]
    说明：

    所有输入均为小写字母。
    不考虑答案输出的顺序。*/

    public static List<List<String>> groupAnagrams(String[] strs) {
        //map中的key是String,value是List<String>
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            //调用toCharArray函数，返回char []
            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {
                //System.out.println("before sort array[i]:"+array[i]);
            }
            //Arrays.sort排序数组
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
               // System.out.println("after sort array[i]:"+array[i]);
            }
            String key = new String(array);
            System.out.println("key:"+key);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        //testToCharArray();
        //testCharAt();
        //testArraysSort();
        String [] arr = new String []{"eat", "tea", "tan", "ate", "nat", "bat"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("数组初始化："+arr[i]);
        }
        List<List<String>> ret = groupAnagrams(arr);
        System.out.println(ret);

    }


    //String函数的toCharArray()
    public static void testToCharArray(){
        String str = "abdec";
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i]:"+arr[i]);
        }
    /*    输出：
        arr[i]:a
        arr[i]:b
        arr[i]:d
        arr[i]:e
        arr[i]:c*/
    }

    //String函数的charAt()
    public static void testCharAt(){
        String str = "abdec";
        //一维数组的初始化
        char [] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            System.out.println("arr[i]:"+arr[i]);
        }
    /*    输出：
        arr[i]:a
        arr[i]:b
        arr[i]:d
        arr[i]:e
        arr[i]:c*/
    }

    /*
    Arrays.sort对char[]里的数据进行排序，默认排成升序
     */
    public static void testArraysSort(){
        String str = "zcabece";
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("before arr[i]:"+arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("=====================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("after arr[i]:"+arr[i]);
        }
/*        before arr[i]:z
        before arr[i]:c
        before arr[i]:a
        before arr[i]:b
        before arr[i]:e
        before arr[i]:c
        before arr[i]:e
        =====================
        after arr[i]:a
        after arr[i]:b
        after arr[i]:c
        after arr[i]:c
        after arr[i]:e
        after arr[i]:e
        after arr[i]:z*/
    }

    //构造函数：public String(char value[])
    //字符数组作为String的构造函数
    public static void testNewString(){

    }

}
