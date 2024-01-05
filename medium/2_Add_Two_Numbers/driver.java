public class driver {
    public static void main(String[] args){
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        Solution solution = new Solution();

        solution.addTwoNumbers(l1, l2);
    }
}
