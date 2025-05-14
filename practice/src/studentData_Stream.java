//Student arr[] = {
//        new Student(110, "abc", 70),
//        new Student(101, "bcd", 70),
//        new Student(120, "xyz", 60)
//we have to return this as a map where key is marks and value is students name getting that marks

import java.util.*;

import java.util.stream.Collectors;

class Student{
    int rollNo;
    String name;
    int marks ;

    public Student(int rollNo,String name,int marks) {
      this.rollNo=rollNo;
      this.name=name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

public class studentData_Stream {
    public static void main(String[] args) {
        //    List<Student> list = new ArrayList<>();
        Student arr[] = {
                new Student(110, "abc", 70),
                new Student(101, "bcd", 70),
                new Student(120, "xyz", 60)};

        Map<Integer,List<Student>> map= Arrays.stream(arr).collect(Collectors.groupingBy(Student::getMarks));
        System.out.println(map);
        //Map<Integer,List<String>> map2= Arrays.stream(arr).collect(Collectors.toMap(Student::getMarks,Student::getName));
        Map<Integer, List<String>> map2 = Arrays.stream(arr)
                .collect(Collectors.groupingBy(
                        Student::getMarks,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));
        System.out.println(map2);
    }
}
