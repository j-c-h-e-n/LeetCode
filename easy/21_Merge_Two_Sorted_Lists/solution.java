
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        else if (list2 == null){
            return list1;
        }
        /* list1 and list2 are sorted */
        ListNode head = new ListNode();
        ListNode curr = head;

        while (list1 != null || list2 != null){
            int x = (list1 != null) ? (list1.val) : (101);
            int y = (list2 != null) ? (list2.val) : (101);

            if (x < y){
                curr.next = new ListNode(x);
                list1 = list1.next;
            }
            else{
                curr.next = new ListNode(y);
                list2 = list2.next;
            }
            curr = curr.next;
        }

        return head.next;
    }
}