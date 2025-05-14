package OOPs;

class myAgeException extends Exception {
    String e;
   public myAgeException(String s){
        super(s);
    }

    }

public class Voter {
    public static void checkAge(int age) throws myAgeException {
        if(age<18){
            throw new myAgeException("Not eligible for voting");
        }
        else{

            System.out.println("Eligible for voting");
        }

    }

    public static void main(String[] args) {
        int age=65;
        try{
            checkAge(age);
        }
        catch (myAgeException e){
            System.out.println(e.getMessage());
        }
    }

}
