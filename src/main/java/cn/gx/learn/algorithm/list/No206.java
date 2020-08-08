package cn.gx.learn.algorithm.list;

public class No206 {

    //       head
    //       newHead
    //Input: 1->2->3->4->5->NULL
    //Output: 5->4->3->2->1->NULL
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }


        return pre;
    }

    public static void main(String[] args) {

    }
}
