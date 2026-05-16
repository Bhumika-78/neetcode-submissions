/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(h1 != null || h2 != null){
            int d1 = (h1 != null)? h1.val : 0;
            int d2 = (h2 != null)? h2.val : 0;
            int sum = d1 + d2 + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum/10;
            if(h1 != null) h1 = h1.next;
            if(h2 != null) h2 = h2.next;
        }
        if(carry > 0) curr.next = new ListNode(carry);
        return dummy.next;
    }
}
