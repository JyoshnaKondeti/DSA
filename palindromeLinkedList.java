class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode firstHalf = head;
        ListNode secondHalf = reverse (slow);
        while(secondHalf!=null){
            if(firstHalf.val != secondHalf.val) return false;
            firstHalf=firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
            ListNode prev = null;
            while(head!=null){
                ListNode nextNode = head.next;
                head.next = prev;
                prev = head;
                head = nextNode;
            }
           return prev;
    }
}