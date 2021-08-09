package NiuKe.LinkedList;

/**
 * @author CoulsonZero
 * @version 2021-05-28 10:46
 */
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 迭代
 * 时间复杂性：O(n)
 * 空间复杂性：O(1)
 * 1->2->3->4->5->null
 * null<-1<-2<-3<-4<-5
 *
 */
public class Soultion1 {
    public ListNode ReverseList(ListNode head) {
        /**
         * null  1 -> 2 -> 3 -> 4 -> 5
         *   |   |
         *  pre cur
         */
        ListNode pre = null;
        ListNode cur = head;
        while(head!=null) {
            /**
             * null  1 -> 2 -> 3 -> 4 -> 5
             *           tmp
             */
            ListNode tmp = cur.next;
            /**
             * null <- 1  2 -> 3 -> 4 -> 5
             * pre    cur
             */
            cur.next = pre;
            /**
             * null <-1  2 -> 3 ->4->5
             *     pre  cur
             */
            pre = cur;
            cur = tmp;

        }
        return pre;
    }
}
