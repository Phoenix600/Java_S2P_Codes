package exceptionHandlingInJava;

/**
 * All user defined Exception Classes Must extends the Exception class
 */

class MyException extends Exception{
    @Override
    public String getMessage(){
        return "This is my custom error";
    }
}

class MinBalanceException extends Exception{
    @Override
    public String getMessage() {
        return "Your Balance should be 50 rs at least";
    }
}



public class Example7 {
    public static void main(String[] args) {

    }
}
