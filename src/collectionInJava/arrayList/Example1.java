package collectionInJava.arrayList;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Implementation of dynamic array
 * #Note:  that this implementation is not synchronized.
 * If multiple threads access an ArrayList instance concurrently, and at least one of the threads modifies
 * the list structurally, it must be synchronized externally.
 *
 *
 */
public class Example1 {
    public static void main(String[] args){
        // constructors
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(12,13,14,15,16,17)); // List.of returns the immutable list to arrayList constructor.
        // which creates the immutable list of the array list
        ArrayList<Integer> arr3 = new ArrayList<>(20); // sets the initial capacity of arrayList
        System.out.println("Array1: " + arr1);
        System.out.println("Array2: " + arr2);
        System.out.println("Array3: " + arr3);

        arr1.add(12);
        arr1.add(0,13);


        System.out.println(arr1);

        // 1st Way to sort the Collection of objects
        // Comparator Object To Set the Logic For Comparing two object, for sorting purpose
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)){
                    return 0;
                }else if(o1<o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        arr3.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Array :" + arr3);
        arr3.sort(c);
        System.out.println("Array Sorted in Reverse :" + arr3);


        // sorts the collection object in reverse order
        Collections.sort(arr3);
        System.out.println("Natural Sorting order : "+arr3);


    }





}
