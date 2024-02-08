package stringsInJava;
import java.lang.*;

/**
 * Examples of constructors in string
 */
public class Example7 {
    static String name7; // value to this variable will be initialized by jvm
    public static void main(String[] args) {
        String name1 = "Pranay"; // Literal Pool
        String name2 = new String("Pranay"); // Heap

        // creating string object from char array
        char[] charArray = {'P','r','a','n','a','y'};  //"Pranay"
        String name3 = new String(charArray);

        int k = 2;
        String name4 = new String(charArray,k,charArray.length-k);
//        System.out.println(name4);

//        System.out.println(name7);
        byte[] byte_Array = {65,66,67,97,98,99};
        String name5 = new String(byte_Array,k,byte_Array.length-k);
        System.out.println(name5);

        int[] int_array = {12,15,16,16};
        String name6 = new String();


    }
}
