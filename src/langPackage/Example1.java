package langPackage;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Reflection Package
 */

class MyClass{
    private int x;
    protected  int b;
    public int c;

    public MyClass(){}
    public MyClass(int x, int b, int c){}

    public void display(String s1, String s2){}

    public int show(int x, int y){
        return 1212;
    }
}

public class Example1 {
    public static void main(String[] args) {
        String str = new String("Pranay");
        // Refection classes are used for reading the classes
        // Used for pulling the defination of class

//         Represents the definition of any class
            Class c = MyClass.class;
            Class c1 = new MyClass().getClass();

            // Fetching the data from class
        System.out.println(c.getName());
        System.out.println(Arrays.deepToString(c.getDeclaredFields()));

        Field f[] = c.getFields();

        for (Field x : f){
            System.out.println(x);
        }

        
    }
}
