package javaLangPackage;

/**
 * Example on Enum
 * Enum is predefined final
 * The enum type, introduced in Java 5, is a special data type that
 * represents a group of constants.
 */

interface  Sample1{

}

// Every member in enum is public static final in nature
// Enum identifier itself is a value

enum Department {
    CS,
    IT,
    Civil,
    ETC
}

enum SBJain implements Sample1{

}
public class Example1 {
    public static void main(String[] args) {
        Department d = Department.ETC;
    }
}
