package com.base;

import java.util.HashMap;

/**
 * @ClassName MapTest
 * @Description
 * @Author wangzhen
 * @Date 2021/4/9 5:30 PM
 **/
public class MapTest {
    public static void main(String[] args) {
        // 创建一个 HashMap
        HashMap<Integer, String> sites = new HashMap<>();

        // 往 HashMap 添加一些元素
        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        System.out.println("sites HashMap: " + sites);

        // key 的映射存在于 HashMap 中
        // Not Found - 如果 HashMap 中没有该 key，则返回默认值
        String value1 = sites.getOrDefault(1, "Not Found");
        System.out.println("Value for key 1:  " + value1);

        // key 的映射不存在于 HashMap 中
        // part1:Not Found - 如果 HashMap 中没有该 key，则返回默认值
        String value2 = sites.getOrDefault(4, "Not Found");
        System.out.println("Value for key 4: " + value2);
        // part2：values() 方法返回映射中所有 value 组成的 Set 视图
        // 函数声明如下：public Collection<V> values(){...}
        System.out.println("map.values():"+sites.values());
        // map.values():[Google, Runoob, Taobao]
    }
}
