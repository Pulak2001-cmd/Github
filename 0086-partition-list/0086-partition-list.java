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
    public ListNode partition(ListNode head, int x) {
        List<Integer> small = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        while (head != null){
            if(head.val < x){
                small.add(head.val);
            } else {
                greater.add(head.val);
            }
            head = head.next;
        }
        ListNode root = null;
        for(int i=greater.size()-1;i>=0;i--){
            ListNode new_root = new ListNode(greater.get(i), root);
            root = new_root;
        }
        for(int i=small.size()-1;i>=0;i--){
            ListNode new_root = new ListNode(small.get(i), root);
            root = new_root;
        }
        return root;
    }
}