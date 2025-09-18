public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode pa = headA;
        ListNode pb = headB;
        while(pa!=pb){
            pa = (pa!=null)? pa.next : headB;
            pb = (pb!=null)? pb.next : headA;
        }
        return pa;
    }
}