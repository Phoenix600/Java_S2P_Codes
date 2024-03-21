package collectionInJava.set;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
public class Example1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(1);
        set.add(100);
        System.out.println("Content Of Set :" +set);

        boolean result = set.contains(1);
        System.out.println("Set contains 1 or not : " + result);

        Set<Integer> set1 = new LinkedHashSet<>(List.of(1,2,3,4,5,6,7,8,5,4,3,2,1));
        System.out.println(set1);

        set.addAll(set1);
        System.out.println("Updated Content Of Set set : " + set);
    }
}
