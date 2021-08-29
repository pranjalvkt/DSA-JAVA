package LinkedList;

import java.util.*;

public class DuplicateLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll = deleteDuplicate(ll);
        for (Integer integer : ll) {
            System.out.println(integer);
        }
    }
    public static LinkedList<Integer> deleteDuplicate(LinkedList<Integer> ll) {
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(ll);
        LinkedList<Integer> newLL = new LinkedList<>();
        for (Integer integer : hs) {
            newLL.add(integer);
        }
        return newLL;
    }
}
