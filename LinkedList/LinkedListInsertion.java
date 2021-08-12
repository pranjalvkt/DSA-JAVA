package LinkedList;

import LinkedList.LinkedListUtilities.LinkedListNode;

public class LinkedListInsertion {
    static LinkedListNode head;

    LinkedListInsertion() {
        head = null;
    }

    void insertAtBeginning(int key) {
        LinkedListNode h = head;
        if (h == null) {
            LinkedListNode temp = new LinkedListNode(key);
            temp.next = null;
            head = temp;
        }
        else {
            LinkedListNode temp = new LinkedListNode(key);
            temp.next = h;
            head = temp;
        }
    }

    void insertAtEnd(int key) {
        
    }

    void insertAfterNode(int key, int nodeAfter) {

    }
}
