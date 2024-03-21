package collectionInJava.set;

import java.util.HashSet;

// HashSet use the hash table
// Set interface only contains the methods of collection no extra methods
public class Example2 {
    public static void main(String[] args) {
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('A');
        hashSet.add('B');
        hashSet.add('C');
        System.out.println(hashSet);
        hashSet.add('A');
        hashSet.add('C');
        hashSet.add('C');
        hashSet.add('Z');
        System.out.println(hashSet);


    }
}
