package collectionInJava.arrayDequeue;

import java.util.ArrayDeque;

/**
 * Using Dequeue As Stack
 */
public class Example2 {
    public static void main(String[] args)
    {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        queue.addLast('A');
        queue.addLast('B');
        queue.addLast('C');
        queue.addLast('D');
        System.out.println("Queue Content : " + queue);
        Character c =  queue.removeFirst();
        System.out.println("Removed From Queue : " + c);
        System.out.println("Queue Content : " + queue);

        // using special valued method
        System.out.println("Special Values Methods");
        queue.offerLast('X');
        queue.offerLast('Y');
        queue.offerLast('Z');
        System.out.println("Queue Content : "+queue);

        System.out.println("Removing the objects using the pollFirst()");
        c = queue.pollFirst();
        System.out.println("Removed Element : "+ c);
        System.out.println("Queue Content : " + queue);

    }
}
