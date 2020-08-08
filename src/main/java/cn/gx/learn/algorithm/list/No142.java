package cn.gx.learn.algorithm.list;

import java.util.HashSet;
import java.util.Set;

public class No142 {
    public ListNode detectCycle(ListNode head) {

        Set<ListNode> map = new HashSet<>();
        ListNode cur = head;
        while (cur != null) {
            if (map.contains(cur)) {
                return cur;
            }
            map.add(cur);
            cur = cur.next;
        }
        return null;
    }

    /**
     * slow : 1
     * faster: 2
     *
     * (a + b + c) / 2 = a + b
     *
     * => c = a
     * @param head
     * @return
     */
    public ListNode detectCycle_1(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null || head.next.next == null) {
            return null;
        }

        ListNode slow = head.next;
        ListNode faster = head.next.next;
        while (faster != null && faster.next != null && (slow != faster)) {
            slow = slow.next;
            faster = faster.next.next;
        }
        if(faster == null || faster.next == null) {
            return null;
        }
        faster = head;
        while (slow != faster) {
            faster = faster.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
