package NestedClasses;

class OuterClass{
    static final int outer_member =10;//static member
    int outer_mem2 =20;// instance member
    private static final int member3= 40;

    static class InnerClass{
      public void display(){
          System.out.println("the static outer member is :"+outer_member);

          System.out.println("the private outer member is :"+member3);
          
          OuterClass obj= new OuterClass();
       
          System.out.println("the instance outer member is :"+obj.outer_mem2);
      }
    }  
}

public class StaticNestedClass {
    public static void main(String[] args) {
        OuterClass.InnerClass obj= new OuterClass.InnerClass();
        obj.display();
            }
}
