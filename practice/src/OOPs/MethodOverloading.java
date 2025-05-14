//Key Points About Method Overloading in Java
//Method Overloading Criteria:
//Overloading is achieved by changing the number of parameters or the data types of parameters. You can also use a mix of both.
//Method overloading cannot be done by changing only the return type.
//Automatic Type Conversion: If a method is called with an argument type that doesn’t exactly match, Java may automatically convert the type (if possible) to match the method’s signature. For example, if an int is passed to a method expecting a long, Java will convert it automatically.
//Ambiguity Avoidance: Java does not allow method overloading based solely on the return type because it could lead to ambiguity. For example, if two methods have the same signature but different return types, the compiler would not be able to decide which method to invoke.
//Operator Overloading (Not Allowed in Java): While languages like C++ allow operator overloading, Java does not support it. However, Java internally overloads operators like the + operator for string concatenation. For example:
//String s1 = "Hello ";
//String s2 = "World!";
//System.out.println(s1 + s2);  // Output: Hello World!


package OOPs;
class Sum{
    public  int sum(int a,int b ){
        return a+b;
    }
    public  long sum(int a,long b ,long c){
        return a+b+c;
    }
    public long sum(long a,long b ){
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
     Sum s=new Sum();
        System.out.println(s.sum(3,5,8));
    }
}
