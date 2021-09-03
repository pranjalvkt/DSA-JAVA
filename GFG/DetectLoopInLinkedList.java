package GFG;

/**
 * DetectLoopInLinkedList
 */

import LinkedList.LinkedListUtilities.LinkedListNode;

public class DetectLoopInLinkedList {
    public static boolean detectLoop(LinkedListNode head){
        LinkedListNode slowP = head;
        LinkedListNode fastP = head;
        
        if(head == null) return false;
        while(fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if(slowP == fastP) return true;
        }
        return false;
    }
    
}