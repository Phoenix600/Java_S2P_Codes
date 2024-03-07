package annotationsInJava;

/**
 * Used for holding the meta-data
 */
@interface  MyData{
    String version() default "Java Version 13";
    String name();
}

@MyData(name = "Pranay")
public class Example9 {
    public static void main(String[] args) {

        @MyData(name = "1212")
        String name;

    }
}
