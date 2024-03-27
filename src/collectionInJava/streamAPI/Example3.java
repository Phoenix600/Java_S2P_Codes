package collectionInJava.streamAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Example3 {

    static void action(Integer integer){
        System.out.println(integer);
    }
    public static void main(String[] args) {
        List<Integer> lis = new LinkedList<>();

        lis.add(3);
        lis.add(6);
        lis.add(8);
        lis.add(10);
        lis.add(11);
        lis.add(13);
        System.out.println("Simple Printing : ");
        System.out.println("Content Of List : " + lis);

        System.out.println("Printing using foreach loop : ");
        for(Integer x : lis)
        {
            System.out.println("Element : " + x);
        }

        System.out.println("Printing using the foreach() method");
        lis.forEach(Example3::action);
        System.out.println("Printing using the System.out.println() method... as argument to foreach");
        lis.forEach(System.out::println);


    }
}
