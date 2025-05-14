package OOPs;



class Animal{

public void Sound()
{
    System.out.println("Animal sound");
}
}
class Cat extends Animal{
    @Override
    public void Sound() {
        System.out.println("cat sound");
    }
}
class Dog extends Animal{
    @Override
    public void Sound() {
        super.Sound();
        System.out.println("Dog sound");
    }
}

public class Overriding {
    public static void main(String[] args) {
  Animal a=new Cat();
  Animal b =  new Dog();
  a.Sound();
  b.Sound();
  Animal c = new Animal();
  c.Sound();

    }
}
