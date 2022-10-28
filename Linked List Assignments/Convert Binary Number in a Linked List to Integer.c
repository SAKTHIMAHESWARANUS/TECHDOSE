/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


int getDecimalValue(struct ListNode* head){
        int v=head->val;
        while(head->next!=NULL){
            v=2*v + head->next->val;
            head=head->next;
        }
        return v;
}
