package methodsInJava;


class MyString {
    String name;
}
public class Example1 {

    static void changeName(String name){
        name = "Pranay";
    }

    static void chnageNameAgain(MyString m){
        m.name  = "Peter Griffin";
    }
    public static void main(String[] args){
        String name = "Louis Clothing Shop";
        System.out.println(name);
        changeName(name);
        System.out.println(name);
        MyString m = new MyString();
        m.name = "Glen Quagmire";
        System.out.println(m.name);
        chnageNameAgain(m);
        System.out.println(m.name);

    }
}
