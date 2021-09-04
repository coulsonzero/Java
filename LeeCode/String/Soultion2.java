package LeetCode;

/**
 * @author coulson
 * @version 2021-06-08 12:37
 * 删除排序链表中的重复元素
 */

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}


//递归
public class Soultion2 {
    //head = [1,1,2,3,3] => [1,2,3]
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {return head;}
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val) {head = head.next;}
        return head;
    }
}


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {return head;}
        ListNode cur = head;
        while (cur.next != null) {
            // 如果当前节点值==下个节点值，当前节点指针指向下下个节点
            if (cur.val == cur.next.val) {cur.next = cur.next.next;}
            else {cur = cur.next;}
        }
        return head;
    }
}


