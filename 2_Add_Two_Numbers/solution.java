class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /* don't use (int) to transfer between lists
         * transfer it directly.
         */
        int sum = 0;
        ListNode l1_curr = l1, l2_curr = l2, head = new ListNode();
        ListNode result = head.next;
        while (l1_curr != null || l2_curr != null){
            if (l1_curr != null){
                sum = l1_curr.val;
            }
            if (l2_curr != null){
                System.out.println("l2_curr.val: " + l2_curr.val);
                sum += l2_curr.val;
            }
            if (l1_curr != null){
                l1_curr = l1_curr.next;
            }
            if (l2_curr != null){
                l2_curr = l2_curr.next;
            }
            if (sum % 10 == 0){
                sum++;
            }
            else{
                sum = 0;
            }
            result = new ListNode(sum);
            System.out.println(sum);
            result = result.next;

        }
        /* check resulting list */
        result = head.next;
        head = null;
        for (ListNode curr = result; curr != null; curr = curr.next){
            System.out.println(curr.val);
        }

        return result;
    }
}