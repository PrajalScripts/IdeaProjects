package OOPs;
import java.util.*;

//class ClassA {
////    public void methodOne(int i) {
////    }
////    public void methodTwo(int i) {
////    }
////    public static void methodThree(int i) {
////    }
////    public  void methodFour(int i) {
////        System.out.println("Superclass");
////    }
//}
//
//class ClassB extends ClassA {
////    public static void methodOne(int i) {
////    }
////    public void methodTwo(int i) {
////    }
////    public void methodThree(int i) {
////    }
//    public static void methodFour(int i) {
//        System.out.println("subclass ");
//    }
//}

public class Test {


    public static void main(String[] args) {
        int a=10;int d=0;
        try{
            int c =a/d;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("finally block executed");
        }
    }
}