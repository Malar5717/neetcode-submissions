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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode gPrev = dummy;

        while(true){
            ListNode kth = getK(gPrev, k);
            if(kth == null) break;

            ListNode gCurr = gPrev.next;
            ListNode gNext = kth.next;

            kth.next = null;

            gPrev.next = reverse(gCurr);

            gCurr.next = gNext;
            gPrev = gCurr;
        }
        return dummy.next;
    }

    private ListNode getK(ListNode curr, int k) {
        while(curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    private ListNode reverse(ListNode head1) {
        ListNode prev = null;
        ListNode curr = head1;

        while(curr != null) {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
