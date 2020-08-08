package cn.gx.learn.algorithm.list;

import java.util.HashSet;
import java.util.Set;

public class No141 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> map = new HashSet<>();
        ListNode cur = head;
        while (cur != null) {
            if (map.contains(cur)) {
                return true;
            }
            map.add(cur);
            cur = cur.next;
        }
        return false;
    }

    public boolean hasCycle_2(ListNode head) {

        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode faster = head;

        while (faster.next != null && faster.next.next != null) {
            slow = slow.next;
            faster = faster.next.next;
            if (slow == faster) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
