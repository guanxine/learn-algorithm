package cn.gx.learn.algorithm.list;

public class No21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode merge = dummy;
        while (p1 != null || p2 != null) {
            if (p1 != null && p2 != null) {
                if (p1.val < p2.val) {
                    merge.next = p1;
                    p1 = p1.next;
                }
                else {
                    merge.next = p2;
                    p2 = p2.next;
                }
            }
            else if (p1 != null) {
                merge.next = p1;
                p1 = p1.next;
            }
            else {
                merge.next = p2;
                p2 = p2.next;
            }
            merge = merge.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
