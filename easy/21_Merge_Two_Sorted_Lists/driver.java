public class driver {
    public static void main(String[] args) {
        Solution test = new Solution();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        test.mergeTwoLists(list1, list2);
    }
}
