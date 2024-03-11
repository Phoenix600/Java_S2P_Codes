package reflectionAPI;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Reading the Array Class From
 */
public class Example2 {
    public static void main(String[] args) throws Exception{
        int[] arr;
        Class<?> intArrayClass = Class.forName("[I");
        Class<?> floatArrayClass = Class.forName("[F");

        System.out.println(intArrayClass.getCanonicalName());
        System.out.println(floatArrayClass.getCanonicalName());

        // Accessing the methods
        Method[] m =  floatArrayClass.getMethods();
        for(var x: m){
            System.out.println(x);
        }


    }
}
