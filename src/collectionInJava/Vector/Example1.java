package collectionInJava.Vector;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

/**
 * Vector class is growable array of objects
 * @see java.util.Vector; package
 */
public class Example1 {
    public static void main(String[] args){

        Collection<Character> c= new Vector<>();
        Vector<Character> v = (Vector<Character>) c;
        v.add('A');
        v.add(new Character('B')); // Deprecated since java 9, it is marked for removal
        v.add('C');

        v.addAll(List.of('D','E','F'));
        System.out.println("Add() Method : "+ v);

    }
}
