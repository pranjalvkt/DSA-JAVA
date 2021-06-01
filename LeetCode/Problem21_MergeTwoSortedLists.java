/*
*   @author
*   Pranjal Tripathi
*   Problem 21
*/

package LeetCode;

import java.util.*;

public class Problem21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        List<Integer> tempList = new LinkedList<>();
        while(l1 != null) {
            tempList.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            tempList.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(tempList);
        ListNode res = new ListNode(-1);
        ListNode p = res;
        for(int n : tempList) {
            p.next = new ListNode(n);
            p = p.next;
        }
        return res.next;
    }
}
