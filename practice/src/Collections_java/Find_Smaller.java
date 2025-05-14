package Collections_java;

//your task is to find smaller than the target
import java.util.*;

public class Find_Smaller {
    public static void main(String[] args) {
     List<Integer> list=new ArrayList<>();
     int target =15;
     list.add(6);
     list.add(45);
     list.add(6);
     list.add(53);
     ListIterator<Integer> it = list.listIterator();
     while(it.hasNext()){
         if(it.next()>target){
             it.remove();
         }
     }
     for(int e:list){
         System.out.println(e+" ");
     }
            }
        }


