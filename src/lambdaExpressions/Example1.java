package lambdaExpressions;

@FunctionalInterface
interface  MyLambda{
    public void display(Object o);
}
class MyClass implements MyLambda{
    @Override
    public void display(Object o) {
        System.out.println(o);
    }
}
public class Example1 {
    public static void main(String...args){
//        Example-1
        MyClass myClass = new MyClass();
        myClass.display("Hello");
        myClass.display(12);

        //Example-2
        MyLambda myLambda = new MyClass();
        myLambda.display("Hello People");


        MyLambda lambda1 = new MyLambda() {
            @Override
            public void display(Object o) {

            }
        };
        lambda1.display(4545);




    }
}
