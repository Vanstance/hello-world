// public ListNode getIntersectionNode(ListNode headA, ListNode headB){
//	if(headA == null || headB == null) return null;
//
//	ListNode a = headA;
//	ListNode b = headB;
//
//	while(a!=b){
//		if(a.next == null){
//
//			a = headB;
//		}else if( a.next != null){
//			a = a.next;
//		}
//		if(b.next == null){
//			b = headA;
//			}
//		else if( b.next != null){
//			b = b.next;
//        }
//	}
//    return a;
//   }