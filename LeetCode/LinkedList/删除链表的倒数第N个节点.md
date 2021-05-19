> 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点
```
输入：head = [1,2,3,4,5], n = 2
输出：[1,2,3,5]

输入：head = [1,2], n = 1
输出：[1]
```
***
java双指针
```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode pre = head;
    int last = length(head) - n;
    //如果last等于0表示删除的是头结点
    if (last == 0)
        return head.next;
    //这里首先要找到要删除链表的前一个结点
    for (int i = 0; i < last - 1; i++) {
        pre = pre.next;
    }
    //然后让前一个结点的next指向要删除节点的next
    pre.next = pre.next.next;
    return head;
    }

    //求链表的长度
    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
```
