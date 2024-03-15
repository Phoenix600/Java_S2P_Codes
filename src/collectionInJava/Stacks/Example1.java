package collectionInJava.Stacks;

import java.util.*;

/**
 * Collection Example using ArrayList Implementation class and LinkedList Class
 */
public class Example1 {
    public static void main(String[] args) {
        Collection<Character> c1 = new ArrayList<>();
        Collection<Character> c2 = new ArrayList<>(List.of('A','V','J'));
        c1.add('A');
        c1.addAll(List.of('B','C','D'));
        boolean result = c1.remove('E');
        System.out.println("Status of Removal of E : " + result);
        System.out.println(c1);

        // AnB
        // retainAll()
        System.out.println("Collection c1 : "+c1);
        System.out.println("Collection C2 : " +c2);
        c1.retainAll(c2);
        System.out.println("Collection C1 : " + c1);


        Collection<Integer> c3 = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        Collection<Integer> c4 = new ArrayList<>(List.of(5,6,76));
        c3.remove(1);
        c3.removeAll(c4);
        System.out.println(c3);
        result = c3.containsAll(c4); // much more-closer to subset operation
        System.out.println(result);

        Collection<String> c5 = new LinkedList<>(List.of("John","Bruce","Jayati","Vidya"));
        Iterator<?> it =  c5.iterator();

        System.out.println("Travsersing using Iterator:");
        // Itrators
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Traversing using for-each:");
        // For Each
        for (String x : c5){
            System.out.println(x);
        }

        System.out.println("Traversing using streams : ");
        // Streams
        c5.stream().forEach(System.out::println);

        Object[] string_array = c5.toArray();
        System.out.println(Arrays.deepToString(string_array));
    }
}
