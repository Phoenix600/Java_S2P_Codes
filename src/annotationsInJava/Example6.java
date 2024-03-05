package annotationsInJava;

@FunctionalInterface
interface  MyLambda{
    void printf(String s,Object...o);
}

public class Example6 {

    public static void main(String[] args) {
        MyLambda printf = System.out::printf;
        printf.
        printf("%s","Pranay");
    }
}
