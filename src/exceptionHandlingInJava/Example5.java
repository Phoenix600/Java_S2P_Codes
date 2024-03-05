package exceptionHandlingInJava;

public class Example5 {
    static void foo(){
//        System.out.println(10.0/0);
        try {
            System.out.println(100.0/0);
        }catch(ArithmeticException myException){
            System.out.println("Ohh Error Occured");
        }

    }
    static void foo1(){
        System.out.println("Calling foo()");
        foo();
    }
    static void foo2(){
        System.out.println("Calling foo1()");
        foo1();
    }
    public static void main(String...args){
        foo2();
    }
}
