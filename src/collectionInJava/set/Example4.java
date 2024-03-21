package collectionInJava.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Set Operations
 */
public class Example4 {
    public static void main(String[] args) {

        Set<Character> set1 = new HashSet<>(List.of('A','B','C','D','E','F'));
        Set<Character> set2 = new HashSet<>(List.of('E','F','G','H','I'));

        System.out.println("Content Of Set-1 : " + set1);
        System.out.println("Content Of Set-2 : " + set2);

        // Intersection Operation in Set  A^B
        set1.retainAll(set2);
        System.out.println("Intersection : "+set1);

        // Difference Operation A-B
        set1 = new HashSet<>(List.of('A','B','C','D','E','F'));
        System.out.println("Content Of Set-1 : " + set1);
        System.out.println("Content Of Set-2 : " + set2);
        set1.removeAll(set2);
        System.out.println("Difference Operation : " + set1);

        // Union Operation
        set1 = new HashSet<>(List.of('A','B','C'));
        set2 = new HashSet<>(List.of('C','D','E'));
        System.out.println("Content Of Set-1 : " + set1);
        System.out.println("Content Of Set-2 : " + set2);
        set1.addAll(set2);
        System.out.println("Union Operation : " + set1);

    }
}
