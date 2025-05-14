//Given a list of strings representing integers (e.g., "1", "2", "3"), use a Function<String, Integer> 
// to convert each string to an integer and return a list of integers.

package Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample1 {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        ArrayList<String> strings2 = new ArrayList<>(Arrays.asList("13", "42", "43", "54"));
      //  Function<String, Integer> convertInt = x -> Integer.parseInt(x);
        
        Function<List<String>, List<Integer>> resultList = x -> {
            ArrayList<Integer> convertedList = new ArrayList<>();
            for (String s : x) {
                
                int num = Integer.parseInt(s);

                convertedList.add(num);
            }
              return convertedList;

        };
      List<Integer> res=resultList.apply(strings);
        System.out.println(res.toString());
        List<Integer> res2=resultList.apply(strings2);
        System.out.println(res2.toString());
    }
}
