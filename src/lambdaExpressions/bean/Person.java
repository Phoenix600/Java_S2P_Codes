package lambdaExpressions.bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    public enum Sex{
        MALE,FEMALE
    }
    public String name;
    public LocalDate birthday;
    public Sex gender;
    public String emailAddress;
    public int getAge(){
        System.out.println("Your age is xyz....");
        return 45;
    }
    static List<Person> instances = new ArrayList<>();

    public void printPerson(){
        System.out.println(this.name +"..." + this.birthday + "..." + this.emailAddress);
    }


}
