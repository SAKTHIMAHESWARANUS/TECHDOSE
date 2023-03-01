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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        int ctr=0;
        while(temp!=null){
            ctr++;
            temp=temp.next;
        }
        int arr[]=new int[ctr];
        int ct[]=new int [ctr];
        temp=head;
        ctr=0;
        while(temp!=null){
            arr[ctr++]=temp.val;
            temp=temp.next;
        }
        int k=0;
        for(int i=ctr-1;i>=0;i--){
            ct[k++]=arr[i];
        }
        k=0;
        temp=head;
        while(temp!=null){
            temp.val=ct[k++];
            temp=temp.next;
        }
        return head;
    }
}
