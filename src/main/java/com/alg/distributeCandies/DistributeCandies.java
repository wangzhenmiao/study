package com.alg.distributeCandies;

/**
 * @ClassName distributeCandies
 * @Description
 * @Author wangzhen
 * @Date 2021/3/31 1:28 PM
 **/
public class DistributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        while (candies != 0) {
            ans[i % num_people] += Math.min(candies, i + 1);
            candies -= Math.min(candies, i + 1);
            i += 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        DistributeCandies distributeCandies = new DistributeCandies();
        int [] ret = distributeCandies.distributeCandies(7,4);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}
