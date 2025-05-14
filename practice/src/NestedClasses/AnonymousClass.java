package NestedClasses;

import org.w3c.dom.ls.LSOutput;

class Animal{
    void sound(){
        System.out.println("peo peo peo  ");
    }
    
}
public class AnonymousClass {
    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            void sound() {
             //   super.sound();
                System.out.println("bark,bark,bark");
            }
        };
        
        Animal obj = new Animal();
        obj.sound();
        dog.sound();
    }

}

// Java program to illustrate defining a thread
// Using Anonymous Inner class that define inside argument

// Main class
//class MyThread {
//    // Main driver method
//    public static void main(String[] args)
//    {
//        // Using Anonymous Inner class that define inside
//        // argument
//        // Here constructor argument
//        Thread t = new Thread(new Runnable() {
//
//            public void run()
//            {
//                System.out.println("Child Thread");
//            }
//        });
//
//        t.start();
//
//        System.out.println("Main Thread");
//    }
//}