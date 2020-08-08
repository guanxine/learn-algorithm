package cn.gx.learn.algorithm.tree.bfs;

import java.util.ArrayList;

// 字符串相加
public class No415 {

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int add = 0;
        // 遍历两个数组，链表。通用模板
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0 && j >= 0) {
                sum = toI(num1.charAt(i --)) + toI(num2.charAt(j --)) + add;
            } else if (i >= 0) {
                sum = toI(num1.charAt(i --)) + add;
            } else {
                sum = toI(num2.charAt(j --)) + add;
            }
            add = sum / 10;
            sb.append(sum % 10);
        }

        if (add > 0) {
            sb.append(add);
        }

        return sb.reverse().toString();
    }

    private static int toI(char charAt) {
        return charAt - '0';
    }


    public static void main(String[] args) {
        System.out.println(toI('9'));
        System.out.println(10 << 0);
        System.out.println(16 % 10);
        System.out.println(2 / 10);
    }
}
