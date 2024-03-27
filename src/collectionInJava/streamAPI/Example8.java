package collectionInJava.streamAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) {
     LinkedList<String> namesCollection =  new LinkedList<String>(List.of("Pranay","Strushti","Diya","Parth","Pranay G"));

     Stream<Integer> namesLengthStream = namesCollection.stream().map(s->s.length());
     namesLengthStream.forEach(System.out::println);

     namesLengthStream = namesCollection.stream().map(s->s.length());
     // Creating the collection from stream
        List<Integer> llLenght = namesLengthStream.collect(Collectors.toList());
        System.out.println(llLenght);

        namesLengthStream = namesCollection.stream().map(s->s.length());
        Set<Integer> nameLengthSet = namesLengthStream.collect(Collectors.toSet());



    }
}
