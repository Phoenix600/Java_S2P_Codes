package exceptionHandlingInJava;

public class Example4 {
    public static void main(String[] args) {
        int[] A = new int[]{10,15,0,34,20};
        try{
            System.out.println(A[0]/A[2]);
            System.out.println(A[100%3]);

        }catch (ArithmeticException e){
            System.out.println("Denominator Can not be zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("I Know you don't have any limit My dear programmer,But your array does");
        }

        System.out.println("End of program... :)");
        System.out.println("Bye");
    }
}
