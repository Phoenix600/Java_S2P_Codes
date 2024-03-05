package annotationsInJava;

class My<T>{
    /**
     * Method must be private or final
     * @param args
     */
    @SafeVarargs
    private void show(T...args){
        for (T x: args){
            System.out.println(x);
        }
    }
}
public class Example5 {
    public static void main(String[] args) {

    }
}
