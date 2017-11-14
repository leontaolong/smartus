/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 /*
 Hash set solution:runtime O(n), Space O(n)
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> dupSet = new HashSet<>();
        while (head != null) {
            if (dupSet.contains(head)) {
                return true;
            }
            dupSet.add(head);
            head = head.next;
        }
        return false;
    }
}

 /*
Two pointers
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (fastPointer != slowPointer) {
            if (fastPointer == null || fastPointer.next == null) {
                return false;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return true; 
    }
}