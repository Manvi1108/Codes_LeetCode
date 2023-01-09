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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        if(head.next == null && n==1)
            return null;
        int s = 0;
        ListNode p = head;
        while(p!=null){
            s++;
            p = p.next;
        }
        if(s == n)
            head = head.next;
        int c=1;
        int i = s-n;
        p = head;

        while(p.next != null){
            if(c == i){
                ListNode p1 = p.next;
                p.next = p1.next;
                break;
            }
            p = p.next;
            c++;
        }
        return head;
    }
}