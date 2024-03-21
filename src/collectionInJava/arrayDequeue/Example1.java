package collectionInJava.arrayDequeue;

import java.util.ArrayDeque;
class Student{
    private int rollNumber;
    private String name;

    // Constructors
    // Default constructor
    public Student(){}

    public Student(String name, int rollNumber)
    {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

/**
 * Using Dequeue As Stack
 */
public class Example1 {
    public static void main(String[] args) {
        // Constructors
        ArrayDeque<Student> stack = new ArrayDeque<>();

        // Adds the element at beginning
        stack.addFirst(new Student("Pranay",1212));
        stack.addFirst(new Student("Diya",1217));
        stack.addFirst(new Student("Sheldon",369)); // throw an Exception
        System.out.println(stack);
        stack.forEach(System.out::println);

        Student removedStudent =  stack.removeLast();
        System.out.println("Removed Student : " + removedStudent);
        System.out.println("Remaining Stack :" + stack); // Throw An Exception


        stack.pollFirst();
        System.out.println("Deletion Using PollFirst : "+stack);


        stack.offerFirst(new Student("Rajesh",890));
        System.out.println(stack);

        System.out.println("Top Object : " + stack.peekFirst());
        System.out.println("Top Object : " + stack.getFirst());

    }
}
