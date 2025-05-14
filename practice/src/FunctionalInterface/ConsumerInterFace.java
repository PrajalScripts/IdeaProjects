package FunctionalInterface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerInterFace {
    public static void main(String[] args) {
        ArrayList<Integer> studentId= new ArrayList<>(Arrays.asList(12,5,8,43,45,67));
        ArrayList<Integer> studentId2= new ArrayList<>(Arrays.asList(1,54,83,3,5,7));
        
        ArrayList<Integer> list=new ArrayList<>();
        Consumer<Integer> consumer= System.out::println;
        Consumer<Integer> consumer2=consumer.andThen(consumer);
        
        studentId.forEach(consumer2);
        studentId2.forEach(consumer2);

        System.out.println(list);
    }
}
