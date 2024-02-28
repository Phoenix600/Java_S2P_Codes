package lambdaExpressions;

interface  SayHello{
    void sayHello();
}
class Person implements SayHello{
    public void talk(){
        System.out.println("The way you do one..The way you everything...");
    }
    @Override
    public void sayHello(){
        System.out.println("I'm a Complain Boy");
    }
}

class GymGuy implements SayHello{
    public void talk(){
        System.out.println("Don't do vegetables Do Stearoids ...");
    }
    @Override
    public void sayHello(){
        System.out.println("I'm a Family Guy");
    }
}

public class Example3 {

    public static void callBackHello(SayHello m){
        m.sayHello();
    }
    public static void main(String[] args) {

    Person p = new Person();

    SayHello m = p::sayHello;
    callBackHello(m);

    m = new GymGuy()::talk;
    callBackHello(m);

    }
}
