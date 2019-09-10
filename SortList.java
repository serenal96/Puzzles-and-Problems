/*Sort a linked list in O(n log n) time using constant space complexity.

Example 1:

Input: 4->2->1->3
Output: 1->2->3->4
Example 2:

Input: -1->5->3->4->0
Output: -1->0->3->4->5*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
       List<Integer> temp=new ArrayList<Integer>();
        ListNode a=head;
        while(a!=null)
        {
            //System.out.println(a.val);
            temp.add(a.val);
            a=a.next;
        }
        head=null;
        Collections.sort(temp);
        for(int i=0;i<temp.size();i++)
        {
            if(head==null)
            {
                head=new ListNode(temp.get(i));
                a=head;
                
                }
            else
            {
               // System.out.println(temp.get(i));
                a.next=new ListNode(temp.get(i));
                a=a.next;
            }
            
        }
       return head; 
    }
}