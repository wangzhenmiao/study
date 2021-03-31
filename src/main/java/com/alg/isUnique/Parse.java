package com.alg.isUnique;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Parse
 * @Description
 * @Author wangzhen
 * @Date 2021/3/31 12:36 PM
 **/


/**
 * https://leetcode-cn.com/problems/is-unique-lcci/
 *
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-unique-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
