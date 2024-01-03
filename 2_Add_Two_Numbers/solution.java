class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();   // dummy head
        ListNode current = head;
        int carry = 0;  // amount to carry over into higher digits
        while (l1 != null || l2 != null || carry != 0){ // both l1 and l2 can be finished when there's still a carry left to be added
            int l1_val = (l1 != null) ? l1.val : 0; // condition ? true cond : false cond
            int l2_val = (l2 != null) ? l2.val : 0;

            int sum = l1_val + l2_val + carry;
            carry = sum / 10;   // calculated after determining the sum to ensure the next iteration has proper carry

            current.next = new ListNode(sum % 10);   // ensuring value is between 0 - 9
            current = current.next;

            // iterate l1 and l2 to the next node if it exists
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        head = head.next;   // making sure we don't return dummy head


        // check our result
        for (ListNode curr = head; curr != null; curr = curr.next){
            System.out.println(curr.val);
        }

        return head;
    }
}