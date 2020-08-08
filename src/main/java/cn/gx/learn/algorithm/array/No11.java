package cn.gx.learn.algorithm.array;

public class No11 {
    /**
     *
     * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为(i,ai) 和 (i, 0)。找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
     *
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        return 0;
    }


    public int maxArea_1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(area, max);
            }
        }
        return max;
    }

    public int maxArea_2(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1; // 宽度最大，如果能找到一个xx相对来说比较高的高度。则有可能找到最大 area
        while (i < j) {
          int minHeight = height[i] < height[j] ? height[i ++ ] : height[j --]; // 高度，谁小谁移动
          int area = (j - i + 1) * minHeight;
          max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
