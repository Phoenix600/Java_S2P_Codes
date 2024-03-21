package collectionInJava.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Ideally We should return -1 for smaller number,
 * 1 for larger number
 * and 0 for equal number
 */


public class Example1 {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(3);

        System.out.println("Head Of Priority Queue : " + priorityQueue.peek());
        System.out.println("Head Of Priority Queue : " + priorityQueue.element());
        priorityQueue.forEach(System.out::println);

        System.out.println("Deleting the highest priority Element : " + priorityQueue.poll());
    }
}
