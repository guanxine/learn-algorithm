package cn.gx.learn.algorithm.array;

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 */
public class No15 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if (map.containsKey(res)) {
                return new int[]{i, map.get(res)};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

    // a + b = -c
    // 两数之和
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int target = nums[i] + nums[j];
                Integer targetIndex = map.get(-target);
                if (targetIndex != null && targetIndex != i && targetIndex != j) {
                    res.add(Arrays.asList(nums[i], nums[j], -target));
                }
            }
        }

        return res;
    }

    // 双指针
    public List<List<Integer>> threeSum_1(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || ( i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, sum = -nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[lo], nums[hi], nums[i]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) {
                            lo++;
                        }

                        while (lo < hi && nums[hi] == nums[hi - 1]) {
                            hi--;
                        }
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {

    }
}
