package cn.gx.learn.algorithm.tree;
//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
//
//        假设一个二叉搜索树具有如下特征：
//
//        节点的左子树只包含小于当前节点的数。
//        节点的右子树只包含大于当前节点的数。
//        所有左子树和右子树自身必须也是二叉搜索树。

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class No98 {

    public boolean isValidBST_1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        for (int i = 1; i < result.size(); i ++ ) {
            if (result.get(i) < result.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void helper(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);

    }

//    // stack
//    public boolean isValidBST_2(TreeNode root) {
//
//        Stack<TreeNode> stack = new Stack<>();
//        while (!stack.isEmpty() || root != null) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//
//            root = stack.pop();
//            if (root.val <= Max) return false;
//
//        }
//    }

    public static void main(String[] args) {

    }
}
