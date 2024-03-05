package annotationsInJava;

abstract class Parent{
    abstract  public void display();
}

class Child extends Parent{
    @Override
    public void display() {
        System.out.println("Yoo Hoo Display");
    }
}


class ForcedAbstract {
    public void display(){
        System.out.println("Original Display Method");
    }
}

class ForcedChildOverride extends ForcedAbstract{
    @Override
    public void display(){
        System.out.println("Override Display Method");
    }
}



public class Example2 {
}
