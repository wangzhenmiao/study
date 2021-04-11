package com.leetcode.longestPalindrome;

/**
 * @ClassName Parse
 * @Description
 * @Author wangzhen
 * @Date 2021/3/31 11:42 AM
 **/

/*
给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。

在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。

注意:
假设字符串的长度不会超过 1010。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-palindrome
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Parse {

public static int longestPalindrome(String s) {
    //1
    //大小写字母、数字的ASCII码值:a-z：97-122 , A-Z：65-90 , 0-9：48-57
    //因为A-Z和a-z的最大ASCII码值都没有超过128，所以数组下标是：128

    //2
    //字符串的charAt方法

    //3
    //count[c]中，以字符为下标，就是用字符的ASCII码作为数组下标
    int[] count = new int[128];//1
    int length = s.length();
    for (int i = 0; i < length; ++i) {
        char c = s.charAt(i);//2
        count[c]++;//3
    }

    //4
    //遍历数组，字符的个数如果为偶数个，全部累加；
    // 如果为奇数个，要通过：奇数/ 2 * 2，实质为减一的方式变成偶数

    //5
    //当第一次出现奇数时，要进行累加
    int ans = 0;
    for (int v: count) {
        ans += v / 2 * 2;//4
        if (v % 2 == 1 && ans % 2 == 0) {//5
            ans++;
        }
    }
    return ans;
}



    public static void main(String[] args) {
  /*      String str = "abccccdd";
        System.out.println(longestPalindrome(str));*/
        char c = 'a';
        int i = c;
        int j = 'a';
        System.out.println("c:"+c);
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        /* 输出值：
            c:a
            i:97
            j:97
            分析：字符变量可以转int,转换完之后的值就是对应字符的ASCII码
         */
    }
}
