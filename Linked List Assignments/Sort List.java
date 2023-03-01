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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int ctr=0;
        while(temp!=null){
            ctr++;
            temp=temp.next;
        }
        int arr[]=new int[ctr];
        ctr=0;
        temp=head;
        while(temp!=null){
            arr[ctr++]=temp.val;
            temp=temp.next;
        }
        ctr=0;
        Arrays.sort(arr);
        temp=head;
        while(temp!=null){
            temp.val=arr[ctr++];
            temp=temp.next;
        }
        return head;
    }
}
