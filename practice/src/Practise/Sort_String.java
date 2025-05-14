/*Input: arr[] = {“for”, “geeks”, “app”, “best”}
Output: app for best geeks
Explanation:
Sum of ASCII values of characters of each string is: {327, 527, 321, 430}.
Hence, the sorted order of strings is {“app”, “for”, “best”, “geeks”}.


Input: arr[] = {“geeksforgeeks”, “a”, “computer”, “science”, “portal”, “for”, “geeks”}
Output: a for geeks portal science computer geeksforgeeks
Explanation:
Sum of ASCII values of characters of each string is: {1381, 97, 879, 730, 658, 327, 527}.
Hence, the sorted order is {“a”, “for”, “geeks”, “portal”, “science”, “computer”, “geeksfor
*/
package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Sort_String {
public static String[] sorted(String[]arr) {
    int[] temp = new int[arr.length];
    int c=arr.length;
    for(int  i=0;i< arr.length;i++){
        temp[i]=calculateSum(arr[i]);
    }
    HashMap<Integer,String> map=new HashMap<>();
    for(int i=0;i<c;i++){
        map.put(temp[i],arr[i]);
    }
    Arrays.sort(temp);
    int z= map.size();
    int i=0;
    while(z>0){
        String value= map.get(temp[i]);
        arr[i]=value;
        z--;i++;
    }

    return arr;
}

    public static int calculateSum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++) {
        char ch= s.charAt(i);
         sum+=ch;

        }
        return sum;
    }

    public static void main(String[] args) {
       String[] test2= {"Xcelore", "is", "a", "growing","Ai","developement","oraganization"};
        String[] test = {"geeksforgeeks", "a", "computer","science","portal","for","geeks"};
        String[] res=sorted(test2);
        for (String e:res) {
            System.out.print(e+" ");
        }
    }
}

