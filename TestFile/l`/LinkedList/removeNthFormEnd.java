/*
Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        for(int i =1; i<= n+1; i++){
            fast = fast.next;
        }//this step is to move the fast node into position n;

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }//start from position n, once fast point reached the end, slow point will reach the position n;

        slow.next = slow.next.next;//replace node with node after;

        return start.next; //return the new listNode;
}
