//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;

        while(fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;

            if(fast == null)
                break;

            if(fast.next == null){
                slow.next=slow.next.next;
                return head;
            }
        }
        slow.next = slow.next.next;
        return head;


    }
}
