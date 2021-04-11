package com.base;

import java.util.*;

/**
 * @ClassName CollectionsTest
 * @Description
 * @Author wangzhen
 * @Date 2021/4/10 9:56 PM
 **/
public class CollectionsTest {


    //Collections.max和Collections.min的用法
    public static void maxMinTest(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(55);
        list.add(56);
        list.add(89);
        list.add(12);
        list.add(23);
        list.add(126);
        System.out.println(list);

        //获取集合最大值、最小值
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max:" + max + " Min: " + min);
    }



    //Collections.sort的用法，Collections.fill的用法
    public static void fillTest(){
        List<String> list=new ArrayList<>();
        list.add("def");
        list.add("jhi");
        list.add("abc");//String类本身就是实现了Comparable接口
        System.out.println("原集合是："+list);
        //part1:sort函数是从Collections接口继承来的，他的子类：List和Arrays都可以调用
        //list.sort(null);//实质是调用的Arrays.sort
        Collections.sort(list);
        System.out.println("sort之后的集合是："+list);
        //part2:fill是填充list,全部替换为目标值
        Collections.fill(list,"tt");
        System.out.println("替换后的子集合是："+list);
    }


    //list.subList获取子list
    public static void subListTest(){
        List<String> list=new ArrayList<>();
        list.add("abcd");//String类本身就是实现了Comparable接口
        list.add("kkkkk");
        list.add("z");
        list.add("zz1");
        list.add("zz");
        list.add("qq1");
        list.add("qq1");
        list.add("qq2");
        System.out.println("原集合是："+list);
        List<String>  subList=list.subList(1, 5);//角标如果越界则抛异常
        System.out.println("子集合是："+subList);
    }



    //new 完之后，size还是0，如果直接按索引访问，会报错：IndexOutOfBoundsException
    public static void sizeTest(){
        List<Integer> list = new ArrayList<>();
        System.out.println("size:"+list.size());
        System.out.println("访问index:"+list.get(1));
        Map<Integer,String> map = new HashMap<>();
        System.out.println("map:"+map.size());
      /*  size:0
        map:0*/
    }

    //查找集合指定元素，返回元素所在索引
    //若元素不存在，n表示该元素最有可能存在的位置索引
    public static void binarySearchTest(){
        List<String> list2 = Arrays.asList("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday".split(","));
        System.out.println(list2);

        //查找集合指定元素，返回元素所在索引
        //若元素不存在，n表示该元素最有可能存在的位置索引
        int index1 = Collections.binarySearch(list2, "Thursday");
        int index2 = Collections.binarySearch(list2, "TTTTTT");
        System.out.println("Thursday元素存在，元素的索引值："+index1);
        System.out.println("TTTTTT元素不存在，不存在元素的索引值："+index2);
    }

    //Collections.lastIndexOfSubList
    public static void lastIndexOfSubListTest(){
        List<String> list2 = Arrays.asList("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday".split(","));
        System.out.println("总串："+list2);

        //查找子串在集合中首次出现的位置
        List<String> subList = Arrays.asList("Friday,Saturday".split(","));
        System.out.println("子串："+subList);
        int index3 = Collections.indexOfSubList(list2, subList);
        System.out.println("查找子串在集合中首次出现的位置:"+index3);
        int index4 = Collections.lastIndexOfSubList(list2, subList);
        System.out.println("查找子串在集合中末次出现的位置:"+index4);
    }



    public static void main(String[] args) {
        //fillTest();
        //sizeTest();
        //maxMinTest();
        //binarySearchTest();
        //lastIndexOfSubListTest();
        otherTest();
    }

    public static void otherTest(){

        List<String> list2 = Arrays.asList("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday".split(","));
        System.out.println("list2:"+list2);


        //替换集合中指定的元素，若元素存在返回true，否则返回false
        boolean flag = Collections.replaceAll(list2, "Sunday", "tttttt");
        System.out.println("Collections.replaceAll成功:"+flag);
        System.out.println("Collections.replaceAll:"+list2);

        //反转集合中的元素的顺序
        Collections.reverse(list2);
        System.out.println("Collections.reverse:"+list2);

        //集合中的元素向后移动k位置，后面的元素出现在集合开始的位置
        Collections.rotate(list2, 3);
        System.out.println("Collections.rotate"+list2);

        //将集合list3中的元素复制到list2中，并覆盖相应索引位置的元素
        List<String> list3 = Arrays.asList("copy1,copy2,copy3".split(","));
        System.out.println("list3:"+list3);
        Collections.copy(list2, list3);
        System.out.println("Collections.copy:"+list2);

        //交换集合中指定元素的位置
        Collections.swap(list2, 0, 3);
        System.out.println("Collections.swap:"+list2);

        //替换集合中的所有元素，用对象object
        Collections.fill(list2, "替换");
        System.out.println("Collections.fill:"+list2);

        //生成一个指定大小与内容的集合
        List<String> list4 = Collections.nCopies(5, "哈哈");
        System.out.println("Collections.nCopies:"+list4);

        //为集合生成一个Enumeration
        List<String> list5 = Arrays.asList("I love my country!".split(" "));
        System.out.println(list5);
        Enumeration<String> e = Collections.enumeration(list5);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
