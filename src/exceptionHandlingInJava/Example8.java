package exceptionHandlingInJava;

public class Example8 {

    @Override
    protected void finalize(){
        System.out.println("Finalize Method Is Called");
    }

    public static void main(String...args){
        Example8 e1 = new Example8();
        Example8 e2 = new Example8();
        e1 = null;
        e2 = null;
        System.gc();
    }
}
