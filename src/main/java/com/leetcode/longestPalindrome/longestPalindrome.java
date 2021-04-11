package com.leetcode.longestPalindrome;

/**
 * @ClassName longestPalindrome
 * @Description
 * @Author wangzhen
 * @Date 2021/3/31 11:35 AM
 **/
public class longestPalindrome {
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(longestPalindrome(str));
    }
}

