/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode nextNode=null;
        while (head!=null){
            nextNode=head.next;
            head.next=prev;
            prev=head;
            head=nextNode;
        }
        return prev;
    }
// another recursive method but not recouage
    public ListNode reverseList2(ListNode head){
        if (head==null || head.next==null)
            return head;
        ListNode newHead = reverseList2(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}