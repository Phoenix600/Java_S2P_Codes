package collectionInJava.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Comparable implements Comparator<Integer>
{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1<o2)
            return 1;
        if(o1>o2)
            return -1;
        return 0;
    }
}
public class Example2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparable());

        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(3);

        priorityQueue.forEach((x)-> System.out.println(x));


    }
}
