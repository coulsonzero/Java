package NiuKe.LinkedList;

/**
 * @author CoulsonZero
 * @version 2021-05-28 12:56
 * 给单链表的头指针head和两个整数left和right
 * 反转left到right的链表节点
 * head = [1,2,3,4,5], left = 2, right = 4
 * [1,4,3,2,5]
 */
public class Soultion2 {
    /**
     *   o -> 1 -> 2 -> 3 -> 4 -> 5
     *   |    |    |    |
     * dummy hh   pre  cur
     */
    public ListNode reverseButween(ListNode head, int l, int r){
        /**
         *  0       1 -> 2
         *  dummy
         */
        ListNode dummy = new ListNode(0);
        //建立一个指针指向head节点
        /**
         *   0  -> 1 -> 2
         * dummy
         */
        dummy.next = head;
        r -= l;
        //建立hh指针，一直向右移动到left的前一位置
        /**
         *   0  -> 1 -> 2
         * dummy  hh  left
         */
        ListNode hh = dummy;
        while(l-- > 1) hh = hh.next;
        //新建pre, cur指针，将目标节点的next指针翻转
        /**
         *   0  -> 1 -> 2 -> 3
         * dummy  hh  pre   cur
         */
        ListNode pre = hh.next;
        ListNode cur = pre.next;
        while(r-- > 0) {
            /**
             *   0  -> 1 -> 2 <- 3 -> 4
             * dummy  hh  pre   cur  tmp
             *   0  -> 1 -> 2 <- 3 -> 4
             * dummy   hh       pre  cur
             */
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        //让hh.next(也就是left节点)的next指针指向cur
        /**
         *    0  -> 1 <- 2 <- 3 <- 4 <- 5
         * dummy   hh  left  pre  cur
         *
         */
        hh.next.next = cur;
        //让hh的next指针指向pre
        //1 -> 5 双向链接，现在不需要0了
        hh.next = pre;
        //返回0后的指针
        return dummy.next;
    }
}
