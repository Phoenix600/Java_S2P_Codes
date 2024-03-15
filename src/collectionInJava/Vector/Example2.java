package collectionInJava.Vector;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println("1 is present at : " + s.search(2));
        System.out.println(s.capacity());
        s.push(34);
        s.push(67);
        s.push(34);
        s.push(90);
        s.push(23);
        s.push(12);
        s.push(5);
        s.push(4);
        s.push(0);
        s.push(64);
        s.push(84);
        System.out.println(s.capacity());
        System.out.println(s.empty());
        System.out.println(s);
        System.out.println(s);

//        1. For each Loop
        for(int x: s){
            System.out.println(" Stack Element : "+x);
        }

        System.out.println("Printing using the Stream aggregate function");
        s.forEach(data-> System.out.println("Stack Element "+data));
        System.out.println("Test-1");
        s.forEach(System.out::println);


    

    }
}
