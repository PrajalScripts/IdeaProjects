//. Define an interface Shape with a method area().
//Implement it in Circle and Rectangle. Write code to calculate and display the area of each using polymorphism.

package Practise;
interface shape{
    void area();

}
class Circle implements shape{
int radius=10;

    public void area() {
        System.out.println(radius*radius*Math.PI);
    }
}

class Rectangle implements shape{

    int length=5;
    int width=4;
    public void area() {
        System.out.println("the area is :"+ length*width);
    }
}
public class Interface_prac {
}
