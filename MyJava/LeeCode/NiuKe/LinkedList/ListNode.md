
/**
 * 1->2->3->4->5
 * 1<-2<-3<-4<-5
 */
public class Soultion1 {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(head != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}

