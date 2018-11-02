###Descriptions###
2-4-3 + 5-6-4 = 7-0-8, which is 342 + 564 = 807, all the input and output is reverse-order.
###Ideas###
We need use ListNode.
First, we need to judge is the l1, l2 is null. if not, continue,
then, set a carry.
```loop begin:{
while ( l1, l2, carry is not 0)
		sum  = l1.val + l2.val + carry
		carry = sum / 10;
		cur.val = sum % 10;
		l1 = l1 - what is calculated, l2 is too.
		)
return the answer.
```
