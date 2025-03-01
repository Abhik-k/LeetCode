//https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
class Solution {
    public int pairSum(ListNode head) {
        ListNode prev=null;
        ListNode slow = head;
        ListNode fast = head;
        int maxValue = Integer.MIN_VALUE;
        while(fast!=null){
            ListNode temp = slow.next;
            fast = fast.next.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        while(slow!=null){
            int val = slow.val+prev.val;
            maxValue = Math.max(maxValue,val);
            slow=slow.next;
            prev=prev.next;
        }

        return maxValue;
    }
}
