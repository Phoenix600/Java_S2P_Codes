package annotationsInJava;

import java.util.List;

class OldClass{
    public void display(){
        System.out.println("Hello");
    }

    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}


public class Example3 {
    static List l;
    @SuppressWarnings("depricated")
//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        OldClass o = new OldClass();
        o.show();
        l.add(10);
    }
}
