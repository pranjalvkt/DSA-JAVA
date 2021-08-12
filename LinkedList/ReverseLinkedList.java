package LinkedList;

import LinkedList.LinkedListUtilities.*;

public class ReverseLinkedList {
    static LinkedListNode head;

    ReverseLinkedList() {
        head = null;
    }

    public static LinkedListNode iterativeReverse(LinkedListNode head) {
        LinkedListNode current, prev, next;
        current = head;
        prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static LinkedListNode recursiveReverse(LinkedListNode head) {
        if (head == null) {
            return head;
        }
        LinkedListNode q = head.next;
        q.next = head;
        head.next = null;
        return recursiveReverse(head.next);
    }

    public static void main(String[] args) {
        PrintLinkedList print = new PrintLinkedList();

        head = new LinkedListNode(2);
        head.next = new LinkedListNode(3);
        head.next.next = new LinkedListNode(4);

        head = iterativeReverse(head);
        print.printForwardIterative(head);
    }
}
