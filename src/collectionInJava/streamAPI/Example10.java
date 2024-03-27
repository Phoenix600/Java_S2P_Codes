package collectionInJava.streamAPI;

import java.util.*;

public class Example10 {
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2);
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        System.out.println(minNumber.isPresent());
        System.out.println(minNumber.get());
    }
}
