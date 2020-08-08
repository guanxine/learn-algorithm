package cn.gx.learn.algorithm.tree;

import java.util.LinkedList;

public class No101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        int level = 0;
        while (!queue.isEmpty()) {
            TreeNode first = queue.getFirst();
            queue.addLast(first.left);
        }
        return false;
    }


    // 迭代


    // 递归

    public static void main(String[] args) {

    }
}
