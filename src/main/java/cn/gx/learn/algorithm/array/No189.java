package cn.gx.learn.algorithm.array;

public class No189 {

    public void rotate(int[] nums, int k) {
        for (int i = 0 ; i < nums.length; i ++ ) {
            int newIndex = (i + k) % nums.length;

            int tmp = nums[i];
            nums[i] = nums[newIndex];
            nums[newIndex] = tmp;
        }
    }

    public static void main(String[] args) {

    }
}
