package com.alg.distributeCandies;

/**
 * @ClassName Parse
 * @Description
 * @Author wangzhen
 * @Date 2021/3/31 1:51 PM
 **/

/**
 * https://leetcode-cn.com/problems/distribute-candies-to-people/
 *
 *
 * 排排坐，分糖果。
 *
 * 我们买了一些糖果 candies，打算把它们分给排好队的 n = num_people 个小朋友。
 *
 * 给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 n 颗糖果。
 *
 * 然后，我们再回到队伍的起点，给第一个小朋友 n + 1 颗糖果，第二个小朋友 n + 2 颗，依此类推，直到给最后一个小朋友 2 * n 颗糖果。
 *
 * 重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），直到我们分完所有的糖果。注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。
 *
 * 返回一个长度为 num_people、元素之和为 candies 的数组，以表示糖果的最终分发情况（即 ans[i] 表示第 i 个小朋友分到的糖果数）。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：candies = 7, num_people = 4
 * 输出：[1,2,3,1]
 * 解释：
 * 第一次，ans[0] += 1，数组变为 [1,0,0,0]。
 * 第二次，ans[1] += 2，数组变为 [1,2,0,0]。
 * 第三次，ans[2] += 3，数组变为 [1,2,3,0]。
 * 第四次，ans[3] += 1（因为此时只剩下 1 颗糖果），最终数组变为 [1,2,3,1]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/distribute-candies-to-people
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Parse {

    /**
     * 1、数组初始化：int[] arr = new int[num]
     * 2、while(candies != 0) :while中的一个变量限制为不等于0，循环体中，可以操作变量减去值操作，控制退出循环
     * 3、ans[i % num_people]  配合i+=1,也可以实现数组的遍历
     * 3、Math.min(candies, i + 1) Math.min方法，可以取最小值；另外此处判断了逻辑，取最小值
     * 4、糖果数量减小
     * 5、i += 1，计数器在其他循环中
     */
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people]; //1
        int i = 0;
        while (candies != 0) { //2
            ans[i % num_people] += Math.min(candies, i + 1);//3
            candies -= Math.min(candies, i + 1);//4
            i += 1;//5
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
