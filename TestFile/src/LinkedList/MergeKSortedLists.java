package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 */
public class MergeKSortedLists {

    /**
     * Definition for singly-linked list.

     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }



    public ListNode mergeKLists(ListNode[] lists){
        if(lists == null ||lists.length==0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val < o2.val) return -1;
                else if(o1.val == o2.val) return 0;
                else return 1;
            }
        });
        //the size of PriorityQueue is lists.length, which is all the nodes?

        ListNode result = new ListNode(0);
        ListNode pointer = result;

        for(ListNode node:lists) //fill in the priority-queue with size k (queue) ;
            if(node!=null)
                queue.add(node); // I think is sorted and can get min;

        while(!queue.isEmpty()){
            pointer.next = queue.poll();  //let tail.next = the min node;
            pointer = pointer.next;

            if(pointer.next != null)
                queue.add(pointer.next);
        }


        return result.next; //cuz dummy[0] is 0 we inserted;



    }


    public static void main(String[] args) {
        ListNode[] lists =  new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

//        mergeKLists(lists);

    }



}
