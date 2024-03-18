package collectionInJava.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(List.of(1,3,4,5,1,4,5,3,4,5,6,1,8,1));
        A.replaceAll(integer -> integer == 1?11:integer);
        System.out.println(A);
        List<Integer> subListA = A.subList(3,8);
        System.out.println(subListA);


    }
}
