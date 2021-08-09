package NiuKe.LinkedList;

/**
 * @author CoulsonZero
 * @version 2021-05-28 13:24
 */
public class Soultion2Test {
    public ListNode reverseButween(ListNode head, int l, int r){
        /**
         *  0 -> 1 -> 2 -> 3 ->4 ->5
         * dummy hh  pre  cur tmp
         *     head  left     right
         */
        ListNode dummy = new ListNode(0); //dummy --- 0
        dummy.next = head;
        //0 1->2->3->4->5
        // dummy
        ListNode hh = dummy;
        //0 1->2->3->4->5
        //  hh
        r -= l;
        while(l-- > 1) hh = hh.next;
        ListNode pre = hh.next;
        ListNode cur = pre.next;
        while(r-- > 0){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        hh.next.next = cur;
        hh.next = pre;
        return dummy.next;
    }
}
