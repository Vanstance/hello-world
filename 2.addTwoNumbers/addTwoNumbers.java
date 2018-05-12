public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0); //prev链表用于运算中
        ListNode head = prev; //最后所有的值返回到这里，每循环一次返回一个链表节点
        int carry = 0; //进位值

        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry; //语法解释 x ? a : b ，当x满足时执行为a，否则为b
            cur.val = sum % 10; //取模
            carry = sum / 10; //看看是否要进位
            prev.next = cur; //prev的下一个数字就是cur了
            prev = cur; //prev这时候移动到cur上了，下面的循环接着cur.next
            
            l1 = (l1 == null) ? l1 : l1.next; //运算结束，eg: 342变成42，然后再变成2，直到变成null
            l2 = (l2 == null) ? l2 : l2.next;
        }

        return head.next; //算出来的prev接到head.next上
    }
}