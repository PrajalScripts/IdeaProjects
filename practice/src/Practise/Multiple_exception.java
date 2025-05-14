package Practise;

public class Multiple_exception {



    public static void main(String[] args) {
        int a=10;
        int c=0;
        int []arr= {1,4,5,6};
        try{
            System.out.println(a/c);
            System.out.println(arr[4]);
        }
//        catch (ArithmeticException | IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch ( IndexOutOfBoundsException e){
         System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Finally executed");
        }
    }
}
