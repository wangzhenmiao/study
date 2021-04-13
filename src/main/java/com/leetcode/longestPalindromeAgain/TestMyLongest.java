package com.leetcode.longestPalindromeAgain;

/**
 * @ClassName TestMyLongest
 *
 * 这个是我自己默写的
 *
 *
 * @Description
 * @Author wangzhen
 * @Date 2021/4/12 8:47 PM
 **/
public class TestMyLongest {

    public static void main(String[] args) {
        String str = "babad";
        System.out.println("最长回文字符串："+longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        //长度小于2，长度：0，1，则最长回文字符串是自身
        if(s.length()<2){
            return s;
        }
        //一个变量记录其实索引，一个变量记录最长串的长度
        int begin = 0;
        int maxLen = 1;
        int len = s.length();

        //dp[i][j],表示s.subString(i,j)是否是回文字符串
        boolean dp[][] = new boolean[len][len];
        char [] arr = s.toCharArray();
        //dp[i][i],对应到字符串是s.subString(i,i);既实际长度为1的字符串，肯定是回文字符串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        //以子字符串的长度L，作为循环遍历条件，长度为2，3，4，...进行遍历
        for(int L = 2;L<= len;L++){
            //内层循环是长度固定为L,然后从i=0开始，拿到子串
            // 相当于s.subString(i,i+L-1)判断这个子串
            for (int i = 0; i < len; i++) {
                int j = L+i-1;
                //因为判断到后半程，子串长度可能不够，所以要判断j的索引是否越界
                if(j>=len){
                    break;
                }
                //相当于s.charAt(i)和s.charAt(j),一旦不相等，则dp[i][j],肯定不是回文
                if(arr[i] != arr[j]){
                    dp[i][j] = false;
                }else{
                    //如果相等，长度小于3，为长度是0，1，2；长度为0，1的话，肯定是true
                    //长度为2时，是，两个相等的字符，也是回文
                    if(j-i<3){
                        dp[i][j] = true;
                    }else {
                        //长度比较长的话，且arr[i]等于arr[j]相等，
                        // 则s.subString(i,j)是否为回文，取决于他左右各向中间靠拢一个字符的子串
                        // 既s.subString(i+1,j-1)是否为回文
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                //每一层内循环结束之后，如果当前dp[i][j]为回文，
                // 且L长度大于之前的maxLen,则更新全局存储变量
                if(dp[i][j] && L>maxLen){
                    begin = i;
                    maxLen = L;
                }
            }
        }

        return s.substring(begin,begin+maxLen);
    }
}
