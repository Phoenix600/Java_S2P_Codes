package collectionInJava.map;

import java.util.*;
import java.util.stream.Collectors;

enum Department
{
    ETC,
    CSE,
    MECH,
    AIML,
    DS
}
class Employee{
    String name;
    Department department;
    public Employee(String name, Department department){
        this.name = name;
        this.department = department;

    }


    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}

public class Example7 {
    public static void main(String[] args)
    {
        Employee e1= new Employee("Sheldon Cooper",Department.ETC);
        Employee e2= new Employee("Howard Walowards",Department.CSE);
        Employee e3= new Employee("Leonard Hoftstater",Department.CSE);
        Employee e4= new Employee("Johnny Bravo",Department.CSE);
        Employee e5= new Employee("Daisy Watson",Department.MECH);
        Employee e6= new Employee("Penny Cooper",Department.ETC);
        Employee e7= new Employee("John Cena",Department.AIML);
        Employee e8= new Employee("James Gosling",Department.DS);

        List<Employee> employeesList = new LinkedList<>(List.of(e1,e2,e3,e4,e5,e6,e7,e8));

        Map<Department,List<Employee>> map = employeesList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(map);



    }
}
