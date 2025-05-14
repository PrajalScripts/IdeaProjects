//Create a class Employee with a constructor that takes String name and int id. Use 
//BiFunction<String, Integer, Employee> to instantiate an employee using a constructor reference.


package Practise;


import java.util.function.BiFunction;
import java.util.function.Function;

public class Cons_Reference {
    public static void main(String[] args) {
        Function<String ,Employee> personIns= Employee::new; 
        Employee e=personIns.apply("Prajal");
        System.out.println(e.name);
    }
}
