public class mergeLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode( int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    static class Solution {
        public ListNode mergeLists(ListNode list1, ListNode list2){
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;
            while(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    current.next = list1;
                    list1 = list1.next;
                }else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
                current.next = (list1!=null)? list1: list2;
            }
            return dummy.next;
        }
    }
    public static void main (String[] args){
        ListNode list1 = new ListNode(1,(new ListNode(3,new ListNode(4))));
        ListNode list2 = new ListNode(1,(new ListNode (2)));
        Solution solution = new Solution();
        ListNode result = solution.mergeLists(list1, list2);
        while(result!=null){
            System.out.println(result.val + " ");
            result = result.next;
        }
    }
}
