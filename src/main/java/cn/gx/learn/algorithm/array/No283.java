package cn.gx.learn.algorithm.array;

public class No283 {


    // 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    // 输入: [0,1,0,3,12]
    // 输出: [1,3,12,0,0]
    // i,j 双指针操作数组
    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j <= nums.length) {
            nums[j] = 0;
        }
    }

    public void moveZeroes_1(int[] nums) {

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j ++;
            }
        }
    }

    public void moveZeroes_2(int[] nums) {

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j ++;
            }
        }
    }


    public static void main(String[] args) {

    }
}
