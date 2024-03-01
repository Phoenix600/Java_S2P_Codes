package exceptionHandlingInJava;

public class Example3 {
    public static void main(String[] args){
        int A[] = {30,2,10,40,0};

        try {

            try {
                int c = A[0] / A[1];
                System.out.println("Division is " + c);
            }catch(ArithmeticException e){
                System.out.println("Division By Zero");
            }
            System.out.println(A[44]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ohh, You're out of index... :(");
        }
    }
}
