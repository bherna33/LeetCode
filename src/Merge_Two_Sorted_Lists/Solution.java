package Merge_Two_Sorted_Lists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);        //create temp node
        ListNode current = temp;        // Since the first node will be empty we point to this node.

        while (l1 != null && l2 != null){       // go through listnode
            if(l1.val < l2.val){        // compare values
                current.next = l1;      // assign current to this node
                l1 =l1.next;        // increment
            }
            else{
                current.next = l2;      // assign current to this node
                l2 = l2.next;       // increment
            }
            current = current.next;     // increment the position where we put the values
        }

        // Since one of the list will be null before the other we have to assign the last position to which ever one is not null
        if(l1 != null){
            current.next = l1;
            l1 =l1.next;
        }
        if(l2 != null){
            current.next = l2;
            l2 =l2.next;
        }
        return temp.next;       // Now since the Empty's first position the head doesn't have the value from the list only it's next has the first value we need. so we got to return the next value using Head ListNode we made
    }
}
