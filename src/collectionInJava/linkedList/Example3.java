package collectionInJava.linkedList;

import java.util.LinkedList;
import java.util.List;

// remove methods in linked List
public class Example3 {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(List.of('A','A','B','A','B','C','A','A','O','A','B'));
        list.remove('A');
        Character c=  list.removeFirst(); // removes and returns the element
        System.out.println("Removed Element : " + c);
        c = list.removeLast();
        System.out.println("Removed Last Element : " + c);
        boolean result = list.removeFirstOccurrence('A');
        System.out.println("Removed First Occurrence Of Element A: " + result);
        result = list.removeLastOccurrence('A');
        System.out.println("Removed Last Occurrence of Element A : " + result);



    }
}
