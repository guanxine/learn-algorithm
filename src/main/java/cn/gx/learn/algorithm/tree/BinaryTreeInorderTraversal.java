package cn.gx.learn.algorithm.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {

     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
        this.right = right;
        }
      }


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> results = new ArrayList<>();
        this.helper(results, root);
        return results;
    }

    private void helper(List<Integer> results, TreeNode root) {

         if (root == null) {
             return;
         }

         helper(results, root.left);
         results.add(root.val);
         helper(results, root.right);

    }

    public List<Integer> inorderTraversalStack(TreeNode root) {

        List<Integer> results = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode current = root;
        while ((current != null) || !stack.isEmpty()) {

            while (current != null) { // push all the ancestor on stack until the leaf
                stack.push(current);
                current = current.left;
            }

            current = stack.pop(); // go to process previous pushed non-null node
            results.add(current.val);
            current = current.right;
        }

        return results;
    }


    public List<Integer> preOrderTraversalStack(TreeNode root) {

        List<Integer> results = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode current = root;
        while ((current != null) || !stack.isEmpty()) {

            while (current != null) { // push all the ancestor on stack until the leaf
                stack.push(current);
                results.add(current.val);
                current = current.left;
            }

            current = stack.pop(); // go to process previous pushed non-null node
            current = current.right;
        }

        return results;
    }



    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.reverse();

        new HashMap<>();
    }
}
