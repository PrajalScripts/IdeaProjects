package Practise;
//Exercise 3: Create a class Rectangle with two parameters: length and width. Use a functional interface 
//(e.g., a custom RectangleFactory) to create objects using constructor references.



class Rectangle1{
    int width;
    int length;

    public Rectangle1(int width, int length) {
        this.width = width;
        this.length = length;
    }
}
interface Cus_RectangleFactory{
    
    Rectangle1 createRec(int width,int length);
}


public class Cons_ref2 {
    public static void main(String[] args) {
        Cus_RectangleFactory rec1= Rectangle1::new;
        Rectangle1 obj1= rec1.createRec(4,7);
        System.out.println(obj1.length+"  "+ obj1.width);
    }
}
