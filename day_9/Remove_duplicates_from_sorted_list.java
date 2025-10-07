public class RemoveDuplicatesFromSortedList {
.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;

        while (prev != null && prev.next != null) {
            if (prev.val == prev.next.val) {
                prev.next = prev.next.next; 
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
