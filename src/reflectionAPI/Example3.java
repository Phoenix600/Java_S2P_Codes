package reflectionAPI;

import java.util.Arrays;

interface BaseInterface {

    public int interfaceInt=0;

    void method1();

    int method2(String str);
}

class BaseClass {

    public int baseInt;

    private static void method3(){
        System.out.println("Method3");
    }

    public int method4(){
        System.out.println("Method4");
        return 0;
    }

    public static int method5(){
        System.out.println("Method5");
        return 0;
    }

    void method6(){
        System.out.println("Method6");
    }

    // inner public class
    public class BaseClassInnerClass{
        static String dbUrl = "localhost::3306/javacore";
    }

    //member public enum
    public enum BaseClassMemberEnum{CREATE,READ,UPDATE,DELETE}
}

@Deprecated
class ConcreteClass extends BaseClass implements BaseInterface {

    public int publicInt;
    private String privateString = "private string";
    protected boolean protectedBoolean;
    Object defaultObject;

    public ConcreteClass(int i){
        this.publicInt=i;
    }

    @Override
    public void method1() {
        System.out.println("Method1 impl.");
    }

    @Override
    public int method2(String str) {
        System.out.println("Method2 impl.");
        return 0;
    }

    @Override
    public int method4(){
        System.out.println("Method4 overriden.");
        return 0;
    }

    public int method5(int i){
        System.out.println("Method4 overriden.");
        return 0;
    }

    // inner classes
    public class ConcreteClassPublicClass{}
    private class ConcreteClassPrivateClass{}
    protected class ConcreteClassProtectedClass{}
    class ConcreteClassDefaultClass{}

    //member enum
    enum ConcreteClassDefaultEnum{}
    public enum ConcreteClassPublicEnum{}

    //member interface
    public interface ConcreteClassPublicInterface{}

}



public class Example3 {
    public static void main(String[] args)  {
        Class<?> concreteClass;
        try {
            // Grabbing the Class Object Of User Defined Class
            concreteClass = Class.forName("reflectionAPI.ConcreteClass");
            System.out.println("Current Class Name : " + concreteClass.getCanonicalName());

            Class<?> superClass = concreteClass.getSuperclass();
            System.out.println("Super Class Name Of Current Class : " + superClass.getCanonicalName());

            // Fetching the classes as data member from the current api
            Class<?> classes[] = concreteClass.getClasses();
            System.out.println("Public Classes, Enums And Interfaces In Class : ");
            for (var x: classes){
                System.out.println(x);
            }

            // Fetching all declared member classes
            Class<?> allDeclaredClasses[] = concreteClass.getDeclaredClasses();
            System.out.println("All classes, Enums and Interfaces Class ");
            for(var x: allDeclaredClasses){
                System.out.println(x);
            }

            // Returns the Class Object representing the class in which it is declared.
            Class<?> declaringClass = Class.forName("reflectionAPI.ConcreteClass$ConcreteClassPublicClass");
            System.out.println("[X] ConcreteClassPublicClass is defined in this class :"+ declaringClass.getDeclaringClass());

            Package p = concreteClass.getPackage();
            System.out.println(concreteClass.getPackageName());


        }catch (ClassNotFoundException e){
            System.out.println("Wrong Class Name Sir...");
            System.exit(1);
        }finally {
            concreteClass = null;
            System.gc();
        }

    }
}
