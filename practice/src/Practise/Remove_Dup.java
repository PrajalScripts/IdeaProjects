package Practise;

import java.util.*;

public class Remove_Dup {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,3,5,54,12,3,4,2,4,1,4));
        HashSet<Integer>set= new HashSet<>();
        for(int element:list){
            set.add(element);
        }
        list.clear();
        for(int element:set){
            list.add(element);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
