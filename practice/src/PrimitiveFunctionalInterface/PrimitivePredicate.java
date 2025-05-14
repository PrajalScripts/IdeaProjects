package PrimitiveFunctionalInterface;


import java.util.function.IntPredicate;

public class PrimitivePredicate {
    
        public static void main(String[] args) {
            int[] x ={0,5,10,15,20,25};
            IntPredicate p= i->i%2==0;
            for (int x1 : x) {
                if(p.test(x1)) {
                    System.out.println(x1);
                }
            }
        }
    }

