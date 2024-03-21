package collectionInJava.set;

import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
        TreeSet<String> namesTreeset = new TreeSet<String>();

        namesTreeset.add("Pranay");
        namesTreeset.add("Diya");
        namesTreeset.add("Vedant");
        namesTreeset.add("Vishal");
        namesTreeset.add("Tanvi");

        namesTreeset.forEach(System.out::println);
    }
}
