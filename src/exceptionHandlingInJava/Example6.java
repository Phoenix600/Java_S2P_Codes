package exceptionHandlingInJava;

/**
 * Methods Defined in Excaption Class
 */


public class Example6 {
    static void foo(){
        System.out.println("Error Statement");
        System.out.println(10/0);
    }
    static void foo1(){
        System.out.println("Calling foo()");
        foo();
    }

    static  void foo2(){
        System.out.println("Calling Foo1()...");
        try{
            foo1();
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
    static void foo3(){
        System.out.println("Calling foo2()...");
        foo2();
    }
    public static void main(String...args){
        System.out.println("Calling Foo3()....");
        foo3();
        System.out.println("Hello People");
   }
}
