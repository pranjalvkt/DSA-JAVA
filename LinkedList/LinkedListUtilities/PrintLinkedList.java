package LinkedList.LinkedListUtilities;

public class PrintLinkedList {
    public void printForwardIterative(LinkedListNode head) {
		LinkedListNode h = head;
		while(h != null) {
			System.out.print(h.data + " ");
			h = h.next;
		}
	}
	public void printForwardRecursive(LinkedListNode head) {
		if (head == null) {
			return;
		}
		System.out.println(head.data + " ");
		printForwardRecursive(head.next);
	}
	public void printBackwardRecursive(LinkedListNode head) {
		if (head == null) {
			return;
		}
		printBackwardRecursive(head.next);
		System.out.println(head.data + " ");
	}

}
