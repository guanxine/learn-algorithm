package cn.gx.learn.algorithm.list;

public class No25 {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode newHead = head;
        ListNode groupHead = head;
        ListNode preGroupHead = new ListNode(0);
        preGroupHead.next = head;
        ListNode p = head;
        int i = 1;
        int first = 0;
        while (p != null) {
            if (i == k) {
                ListNode nextGroupHeadTmp = p.next;

                ListNode newGroupHead = reverse(groupHead, nextGroupHeadTmp);

                if (first == 0) {
                    newHead = newGroupHead;
                    first = 1;
                }

                preGroupHead.next = newGroupHead;
                preGroupHead = groupHead;

                groupHead.next = nextGroupHeadTmp;
                groupHead = groupHead.next;
                p = nextGroupHeadTmp;
                i = 1;
            }
            else {
                i ++;
                p = p.next;
            }

        }

        return newHead;
    }

    private ListNode reverse(ListNode finalHead, ListNode tail) {
        ListNode pre = null;
        ListNode cur = finalHead;
        while (cur != tail) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {

    }
}
