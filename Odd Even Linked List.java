//https://leetcode.com/problems/odd-even-linked-list/
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null ||head.next.next==null)
            return head;
        
        ListNode p1 = head;
        ListNode start = head.next;
        ListNode p2=head.next;

        while(p1.next.next!=null || p2.next!=null){
            p1.next = p1.next.next;
            p2.next = p2.next.next;
            p1=p1.next;
            p2=p2.next;
            if(p1==null || p2==null)
                break;
        }
        p1.next=start;

        return head;
    }
}
