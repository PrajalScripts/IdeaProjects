package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//•	Problem 5: Write a Function<Employee, String> that takes an Employee object and returns a formatted string with the
//employee’s name and salary (e.g., "John: $5000"). Apply this function to a list of employees and
//return the resulting list of formatted strings.
class Employees{
    int id ;
    String name;

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}


public class FormattedEmployeeList {
    public static void main(String[] args) {
        Function<List<Employees>,List<String>> displayEmp= x->{
            List<String> formalltedList=new ArrayList<>();
            for(Employees e:x){
                String s="{ the name of employee is "+e.getName().toUpperCase()+" and the id is :"+e.getId()+" }";
                formalltedList.add(s);
            }
            return formalltedList;
        };
        

        ArrayList<Employees>employees = new ArrayList<>();

        // Adding some employee objects to the list
        employees.add(new Employees(101, "John Doe"));
        employees.add(new Employees(102, "Jane Smith"));
        employees.add(new Employees(103, "Alice Johnson"));
        employees.add(new Employees(104, "Bob Brown"));
        
        List<String> res= displayEmp.apply(employees);
        System.out.println(res);
    }
}
