class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode slow = temp;
        ListNode fast = temp;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the node
        slow.next = slow.next.next;

        return temp.next;
    }
}