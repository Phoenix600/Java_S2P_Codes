package collectionInJava.Stacks;

import java.util.Stack;

public class Example2 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        System.out.println(s);
        System.out.println();
        char result = s.push('A');
        s.push('B');
        s.push('C');
        System.out.println(s);
       int index =  s.search('Z');
        System.out.println(index);

    }
}
