package cn.gx.learn.algorithm.test1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P1 {

    //给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
    public int missingNumber(int[] nums) {

        int max = nums[0];
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            set.add(nums[i]);
        }


        for (int i = 0; i <= max + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        P1 p1 = new P1();

        System.out.println(p1.missingNumber(new int[]{0,1}));
    }
}
