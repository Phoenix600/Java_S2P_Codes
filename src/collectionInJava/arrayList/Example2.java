package collectionInJava.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        // Methods Defined in ArrayList Class
        ArrayList<Character> arr1 = new ArrayList<>();

        boolean result = arr1.add('B');

        System.out.println(arr1);
        System.out.println("Status of Append : " + result);

        // insert the element at specified index , returns void
        arr1.add(0,'A');
        System.out.println("Array : " +arr1);


        arr1.addAll(List.of('C','D','E'));
        System.out.println("Array after the allAll(collection<>): " + arr1);

        arr1.addAll(2,List.of('F','G','H'));
        System.out.println("Arrays after the allAll(int, collection<>): " + arr1);


//        arr1.clear(); // removes all the elements from the list

        // returns the copy of collection
        ArrayList<Character> arr2 = (ArrayList<Character>) arr1.clone();
        System.out.println("Shallow Copy Array : " + arr2);
        System.out.println("Original Copy Array : " + arr1);
        arr1.set(1,'X');
        System.out.println("Shallow Copy Array : " + arr2);
        System.out.println("Original Copy Array : " + arr1);

        result = arr1.contains('A');
        System.out.println("Collection contains 'A' : " + result);

        arr1.ensureCapacity(18);

        for (int x: arr2){
            System.out.println((char)x);
        }

        System.out.println(arr1.size());


        arr1.forEach(System.out::println);

        Character c = arr1.get(3);
        System.out.println(c);

        System.out.println("Index of X : " + arr1.indexOf('X'));
        System.out.println("IsEmpty : " + arr1.isEmpty());
        Iterator<Character> it = arr1.iterator();
        // Accessing teh list using iterator
        System.out.println("Iterator : ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        arr1.add('E');
        System.out.println("Last Index Of E "+arr1.lastIndexOf('E'));
        System.out.println("Removed Element : " + arr1.remove('E'));
        arr1.removeAll(List.of('X','Z'));
        arr1.remove(3); // removes the element present at the given index


    }
}
