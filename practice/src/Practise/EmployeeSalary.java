package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String s) {
       name=s;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        List<Employee>  emp= new ArrayList<>(Arrays.asList(new Employee("prajal",2000), new Employee
  ("pranjal",54000),new Employee("Ashutosh",30000),new Employee("Sanskar",6000)));

       // Predicate<Integer> checkSalary= salary->salary>5000;
        
        List<Employee> finalList= emp.stream().filter(e->e.getSalary()>5000).toList();
        finalList.forEach(System.out::println);
    }
}
