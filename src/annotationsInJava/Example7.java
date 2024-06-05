package annotationsInJava;

/**
 * Dummy Annotation
 */
@interface MyAnnotation{

}
@MyAnnotation
public class Example7 {

    @MyAnnotation
    public static void main(@MyAnnotation String...args){
        @MyAnnotation
        int x;
    }
}
