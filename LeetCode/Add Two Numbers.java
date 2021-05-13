/**
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Input: l1 = [0], l2 = [0]
Output: [0]

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return this.addTwoNumbers2(l1,l2,0);
    }
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2,int a) {
        if(l1==null && l2==null) {return a==0 ? null:new ListNode(a);}
        if(l1 != null){a += l1.val;l1 = l1.next;}
        if(l2 != null){a += l2.val;l2 = l2.next;}
        return new ListNode(a%10,addTwoNumbers2(l1,l2,a/10));
    }
}
