package cn.gx.learn.algorithm.list;

import java.util.Queue;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
