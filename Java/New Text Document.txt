/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null) {
            return null;
        }

        ListNode head1 = list1;
        ListNode head2 = list2;

        ListNode mergedList = new ListNode();
        ListNode buildList = mergedList;

        while(head1 != null || head2 != null) {
            if(head1 == null) {
                buildList.next = head2;
                head2 = head2.next;
            } else if(head2 == null) {
                buildList.next = head1;
                head1 = head1.next;
            } else {
                if(head1.val > head2.val) {
                    buildList.next = head2;
                    head2 = head2.next;
                } else {
                    buildList.next = head1;
                    head1 = head1.next;
                }
            }

            buildList = buildList.next;
        }
		//first item will be a dummy node so return the next one for the start of the sorted list
		//probably a better way to do it but this works ;)
        return mergedList.next;
    }
}