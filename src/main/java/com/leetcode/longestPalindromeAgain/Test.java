package com.leetcode.longestPalindromeAgain;

/**
 * @ClassName Test
 * @Description
 * @Author wangzhen
 * @Date 2021/4/13 11:12 AM
 **/
public class Test {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println("最长回文字符串："+longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        int begin = 0;
        int maxLen = 1;
        char[] arr = s.toCharArray();
        int len = s.length();
        //
        boolean dp[][] = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        //
        for(int L = 2;L<=len;L++){
            for (int i = 0; i < len; i++) {
                int j = i+L-1;
                if(j>len-1){
                    break;
                }
                if(arr[i] != arr[j]){
                    dp[i][j] = false;
                }else {
                    if(L<3){
                        dp[i][j] = false;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j] && L>maxLen){
                    maxLen = L;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
