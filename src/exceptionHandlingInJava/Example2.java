package exceptionHandlingInJava;

public class Example2 {
    public static void main(String[] args) {
        int  a = 10;
        int b = 0;
        int c;

        try{
             c = a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Denominator can not be zero");
            System.out.println(e.getMessage());
        }finally {
            c = a / 5;
            System.out.println(c);
        }

    }
}
