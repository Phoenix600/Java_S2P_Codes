package collectionInJava.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>(); // Creates th empty linked list
        LinkedList<Character> ll1 = new LinkedList<>(List.of('X','Y','Z')); // Creates the LL with X,Y,Z elements

        ll.add('A');
        ll.add('B');
        ll.add('C');

        System.out.println(ll);
        System.out.println(ll1);

        System.out.println("The first element in LL : "+ll.element());
        System.out.println("Index of A in LL : "+ll.indexOf('A'));
        System.out.println("Index Of B in LL : "+ll.indexOf('B'));

        // insert the Linked List collection into the another linked Lists collection
        ll.addAll(2,ll1);

        ll.addFirst('1'); // inserts the element at the start of LL
        ll.addLast('9'); // inserts the element at the end of LL
        ll.clear(); // clears all elements the LL
        ll.clone(); // returns the copy of the LL
        ll.add('A');

        System.out.println("First element in the linked list :" + ll.getFirst());
        System.out.println("Last element in the Linked List :" + ll.getLast());
        System.out.println("Index of 'A' : " + ll.indexOf('A'));
        System.out.println("LastIndex of 'A' : " + ll.lastIndexOf('A'));


    }
}
