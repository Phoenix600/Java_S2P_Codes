package collectionInJava.streamAPI;

import java.util.*;

public class Example1 {
    public static void main(String[] args)
    {
        // Filtering in Stream
        Collection<String> collection = new LinkedHashSet<>(List.of("apple","mango","orange"));
        Collection<String>filteredList =  collection.stream().filter(s->s.matches("^[aeiou].*")).toList();
        System.out.println(filteredList);

        Collection<Integer> collection1 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
        Collection<Integer>evenList = collection1.stream().filter(num->num%2==0).toList();
        System.out.println("Even List : " + evenList);


    }
}
