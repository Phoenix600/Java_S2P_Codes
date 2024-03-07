package genericClasses;


/**
 * Generic Methods Example
 * 1. We can create the class of any type
 * 2. Compile Time Safety
 * 3. No Typecasting required
 * @version 5
 */

class MyClass<T>{
    T t;
}

public class Example1 {
    public static void main(String[] args) {
        MyClass<Object> obj = new MyClass();
        obj.t = 122;
        obj.t = "Pranay";


        MyClass<Integer> object = new MyClass<>();
        object.t = 132;
//        object.t = "12";
    }
}
