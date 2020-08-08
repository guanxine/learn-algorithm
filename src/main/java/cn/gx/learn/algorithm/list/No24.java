package cn.gx.learn.algorithm.list;

public class No24 {

    /**
     *
     * first.next = second.next
     * second.next = first
     *
     * pre.next = second
     *
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode pre = d;
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // swap
            first.next = second.next;
            second.next = first;
            pre.next = second;

            // move point
            pre = head;
            head = head.next;
        }
        return d.next;
    }

    public static void main(String[] args) {

    }
}
