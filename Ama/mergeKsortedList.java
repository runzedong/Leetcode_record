/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class mergeKsortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0)
            return null;
        int end=lists.length-1;
        int start=0;
        return helper(lists,start,end);
    }
    public ListNode helper(ListNode[] lists, int left, int right){
        if (left<right)
        {
            int mid=(left+right)/2;
            return mergeTwoLists(helper(lists,left,mid),helper(lists,mid+1,right));
        }
        return lists[left];
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head=new ListNode(0);
        head.next=l1;
        ListNode pre=head;
        while (l1!=null && l2!=null){
            if (l1.val<=l2.val){
                l1=l1.next;
            }
            else{
                ListNode next=l2.next;
                l2.next=pre.next;
                pre.next=l2;
                l2=next;
            }
            pre=pre.next;
        }
        if (l2!=null)
            pre.next=l2;
        return head.next;
    }
}