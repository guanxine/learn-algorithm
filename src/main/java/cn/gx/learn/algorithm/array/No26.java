package cn.gx.learn.algorithm.array;

// 删除排序数组中的重复项
public class No26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int cache = nums[0];
        int i = 1;
        int j = 1;
        while (i < nums.length){
            if (cache != nums[i]) {
                cache = nums[i];
                nums[j ++] = cache;
            }
            else {
                i ++;
            }
        }

        return j;
    }

    public static void main(String[] args) {

    }
}
