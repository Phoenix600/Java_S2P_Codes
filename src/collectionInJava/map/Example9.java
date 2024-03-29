package collectionInJava.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
    String name;
    boolean isPass;
    public Student(String name, boolean isPass){
        this.name = name;
        this.isPass = isPass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isPass=" + isPass +
                '}';
    }
}
public class Example9 {
    public static void main(String[] args) {
        Student s1 = new Student("James",true);
        Student s2 = new Student("Lorien",false);
        Student s3 = new Student("Eliot",true);
        Student s4 = new Student("Angela",true);
        Student s5 = new Student("Peter",false);
        Student s6 = new Student("Natasha",false);
        Student s7 = new Student("Nick",true);
        Student s8 = new Student("Robert",true);

        List<Student> list = new LinkedList<>(List.of(s1,s2,s3,s4,s5,s6,s7,s8));

        Map<Boolean, List<Student>> map = list.stream().collect(Collectors.partitioningBy(s->s.isPass == true));
        System.out.println(map);


    }
}
