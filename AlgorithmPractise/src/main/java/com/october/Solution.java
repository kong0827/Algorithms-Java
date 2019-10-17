package com.october;

/**
 * @ClassName practise
 * @Description TODO
 * @Author kongxiangjin
 * @Date 2019/10/17 14:23
 * @Version 1.0
 *
 *
 * 小A 和 小B 在玩猜数字。
 * 小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。
 * 他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 *
 * 示例 1：
 *
 * 输入：guess = [1,2,3], answer = [1,2,3]
 * 输出：3
 * 解释：小A 每次都猜对了。
 *  
 *
 * 示例 2：
 *
 * 输入：guess = [2,2,3], answer = [3,2,1]
 * 输出：1
 * 解释：小A 只猜对了第二次。
 *
 *
 **/
public class Solution {
    public int game(int[] guess, int[] answer) {

        /**
         * 填充代码
         */
        int number = 0;
        for (int i = 0; i < guess.length ; i++) {
            if (guess[i] == answer[i]) {
                number++;
            }
        }

        return number;
    }
}
