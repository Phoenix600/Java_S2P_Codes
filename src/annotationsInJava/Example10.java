package annotationsInJava;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Remaining Built-in annotations
 * 1. Retention
 * 2. Documented
 * 3. Target
 * 4. Inherited
 * 5. Repeatable
 **/


//This annotation only with class when the Retension
@Retention(RetentionPolicy.CLASS)
@interface  MyAnnotation1{
    String name();
    String project();
    String date() default "@Today";
    String version() default "7";

}

@MyAnnotation1(name = "Pranay",project = "MyProject")
class MyClass{

}


public class Example10 {
    public static void main(String[] args) {
        MyClass m = new MyClass();
    }
}
