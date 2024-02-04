package stringsInJava;

public class Example2 {
    public static void main(String[] args) {

        // In this example, the String objects will have the same reference.
        String name0 = "Diya";
        String name1 = "Diya";
        System.out.println(name1 == name0); // True

        // two different objects using new and check that they have different references
        String name2 = new String("Diya");
        String name3 = new String("Diya");
        System.out.println(name3 == name2); // false

        // when we compare a String literal with a String object created using new() operator using
        // the == operator, it will return false
        System.out.println(name1 == name3);


        // Manual Interning Of String In String Literal Pool
        String myActressRolePool = "Jessi";
        String myActressRole = new String("Jessi");
        String myActressRoleIntern = myActressRole.intern();
        System.out.println(myActressRolePool == myActressRoleIntern);


    }
}
